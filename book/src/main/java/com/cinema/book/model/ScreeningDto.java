package com.cinema.book.model;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ScreeningDto {

    Movie movie;
    Integer roomNumber;
    LocalDateTime startTime;
    BigDecimal price;
}
