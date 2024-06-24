package dev.elshan.OneToOne;

import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDateTime;

@Entity
public class UniversityCard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String cardNumber;
    @CreatedDate
    private LocalDateTime activatedAt;

    @OneToOne(mappedBy = "studentCard")
    private Student student;
}
