package ru.romania.taco.data;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

import ru.romania.taco.TacoOrder;

public interface OrderRepository extends CrudRepository<TacoOrder, UUID> {
}
