package dev.elshan.ManyToMany;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class StudentPrime {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String firstName;

    @ManyToMany(mappedBy = "students")
    private Set<Teacher> teachers;
}
