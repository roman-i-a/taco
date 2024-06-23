package ru.romania.taco.data;

import org.springframework.data.repository.CrudRepository;

import ru.romania.taco.TacoOrder;

public interface OrderRepository extends CrudRepository<TacoOrder, Long> {
}
