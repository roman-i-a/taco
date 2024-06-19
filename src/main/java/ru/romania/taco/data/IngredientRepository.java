package ru.romania.taco.data;

import java.util.Optional;

import ru.romania.taco.Ingredient;

public interface IngredientRepository {
    Iterable<Ingredient> findAll();

    Optional<Ingredient> findById(String id);

    Ingredient save(Ingredient ingredient);
}
