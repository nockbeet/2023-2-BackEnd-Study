package GDSC_6th_HW;


import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import jakarta.persistence.*;
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    private Reservation reservation;

    private int name;
}