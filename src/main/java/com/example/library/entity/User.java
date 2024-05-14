package com.example.library.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.*;

@Setter
@Entity
@Table(name = "reader")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "username", unique = true, nullable = false)
    private String username;

    @Override
    public int hashCode() {
        return Objects.hash(id, username);
    }

    public User(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id) && Objects.equals(username, user.username);
    }
}
