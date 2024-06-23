package ru.romania.taco;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import lombok.extern.slf4j.Slf4j;
import ru.romania.taco.Ingredient.Type;
import ru.romania.taco.data.IngredientRepository;

@Slf4j
@SpringBootApplication
public class TacoApplication {

	public static void main(String[] args) {
		SpringApplication.run(TacoApplication.class, args);
	}

	@Bean
	public CommandLineRunner loadData(IngredientRepository ingredientRepo) {
		log.info("CommandLineRunner started.");
		return args -> {
			ingredientRepo.save(new Ingredient("FRCH", "Fried Chicken", Type.PROTEIN));
			ingredientRepo.save(new Ingredient("KAIK", "Russian Kabachok Ikra", Type.VEGGIES));
		};
	}
}
