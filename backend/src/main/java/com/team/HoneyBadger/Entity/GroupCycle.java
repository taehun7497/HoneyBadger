package com.team.HoneyBadger.Entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class GroupCycle {
    // 그룹 일정
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private Long id;
    @Column(length = 100)
    private String title;
    @Column(columnDefinition = "TEXT")
    private String content;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private LocalDateTime createDate;
    @ManyToOne(fetch = FetchType.LAZY)
    private Department group;
    @ElementCollection
    private List<String> tag;

    @Builder
    public GroupCycle(String title, String content, LocalDateTime startDate, LocalDateTime endDate, Department group) {
        this.title = title;
        this.content = content;
        this.startDate = startDate;
        this.endDate = endDate;
        this.createDate = LocalDateTime.now();
        this.group = group;
        this.tag = new ArrayList<>();
    }
}
