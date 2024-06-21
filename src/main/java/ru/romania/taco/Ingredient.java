package ru.romania.taco;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import io.micrometer.common.lang.NonNull;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@Table
@AllArgsConstructor
public class Ingredient {
    @Id
    @NonNull
    private String id;

    @NonNull
    private String name;
    private Type type;

    public enum Type {
        WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
    }
}
