package dev.elshan.OneToMany;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class SocialUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String email;

    @OneToMany(mappedBy = "socialUser")
    private List<Post> posts;
}
