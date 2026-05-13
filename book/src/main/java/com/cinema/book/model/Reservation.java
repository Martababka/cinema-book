package com.cinema.book.model;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @OneToOne
    @JoinColumn(name = "screening_id")
    Screening screening;

    @ManyToOne
    @JoinColumn(name = "user_id")
    User user;

    LocalDateTime reservationTime;
    ReservationStatus status;

    @OneToMany
    List<Seat> reservedSeats;
}
