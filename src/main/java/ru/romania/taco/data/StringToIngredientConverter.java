package ru.romania.taco.data;

import java.util.Optional;

import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

import ru.romania.taco.Ingredient;
import ru.romania.taco.IngredientUDT;

@Component
public class StringToIngredientConverter implements Converter<String, IngredientUDT> {

    IngredientRepository ingredientRepository;

    public StringToIngredientConverter(IngredientRepository ingredientRepository) {
        this.ingredientRepository = ingredientRepository;
    }

    @Override
    @Nullable
    public IngredientUDT convert(@NonNull String id) {
        Optional<Ingredient> ingredient = ingredientRepository.findById(id);
        if (ingredient.isEmpty()) {
            return null;
        }

        return ingredient.map(i -> {
            return new IngredientUDT(i.getName(), i.getType());
        }).get();
    }

}
