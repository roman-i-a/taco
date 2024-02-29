package ru.romania.taco;

import java.util.Optional;

public interface TacoRepository {

    Iterable<Taco> findAll();

    Optional<Taco> findById(Long id);

    Taco save(Taco taco);
    
}
