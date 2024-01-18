package ru.romania.taco;

import lombok.Data;

import java.sql.Date;
import java.util.List;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Data
public class Taco {

    private long id;

    private Date createdAt;
    
    @NotNull
    @Size(min=5, message="name must be at least 5 characters long")
    private String name;

    @NotNull
    @Size(min=1, message="You must choose at least 1 ingredient")
    private List<Ingredient> ingredients;
}
