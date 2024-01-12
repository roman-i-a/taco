package ru.romania.taco;

import lombok.Data;


public record Ingredient(String id, String name, ru.romania.taco.Ingredient.Type type) {

    public enum Type {
        WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
    }
}
