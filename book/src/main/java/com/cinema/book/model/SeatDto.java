package com.cinema.book.model;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class SeatDto {

    Integer roomNumber;
    Integer rowNumber;
    Integer seatNumber;
}
