package dev.elshan.OneToOne;

import jakarta.persistence.*;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String firstName;
    private String lastName;
    private Integer birthDate;

    @OneToOne
//    @JoinColumn(name = "card")
    private UniversityCard studentCard;
}
