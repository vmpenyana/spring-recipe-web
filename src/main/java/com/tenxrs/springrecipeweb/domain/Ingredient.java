package com.tenxrs.springrecipeweb.domain;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.context.annotation.Profile;

import java.math.BigDecimal;

@Data
@Entity
@EqualsAndHashCode(exclude = {"recipe", "uom"})
public class Ingredient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;
    private BigDecimal amount;

    @ManyToOne
    private Recipe recipe;
    @OneToOne
    private UnitOfMeasure uom;

}
