package com.example.booktestapi.model.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;
import java.util.Objects;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Table(name = "authors")
@Entity
public class Author extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    private String fullName;
    private String age;
    private String gender;

    @OneToMany
    @ToString.Exclude
    private List<Book> books;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return getId() != null && Objects.equals(getId(), author.getId());
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}