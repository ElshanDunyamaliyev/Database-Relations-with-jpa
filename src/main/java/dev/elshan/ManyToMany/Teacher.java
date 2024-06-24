package dev.elshan.ManyToMany;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String firstName;

    @ManyToMany
    @JoinTable(name = "teacher_student", joinColumns = @JoinColumn(name = "teacher_id"),inverseJoinColumns = @JoinColumn(name = "student_id"))
    private Set<StudentPrime> students;
}
