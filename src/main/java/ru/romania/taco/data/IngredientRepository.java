package ru.romania.taco.data;

import org.springframework.data.repository.CrudRepository;

import ru.romania.taco.Ingredient;

public interface IngredientRepository extends CrudRepository<Ingredient, String> {
}
