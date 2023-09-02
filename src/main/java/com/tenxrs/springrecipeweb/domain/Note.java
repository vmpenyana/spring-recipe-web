package com.tenxrs.springrecipeweb.domain;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@EqualsAndHashCode(exclude = {"recipe"})
public class Note {

    @OneToOne
    private Recipe recipe;

    @Lob
    private String recipeNotes;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


}
