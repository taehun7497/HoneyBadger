package com.team.HoneyBadger.DTO;

import lombok.Builder;
import org.springframework.web.multipart.MultipartFile;

import java.time.LocalDateTime;
import java.util.List;

@Builder
public record EmailReservationRequestDTO(String title, String content, List<String> receiverIds,
                                         LocalDateTime sendTime, List<MultipartFile> attachments) {
}
