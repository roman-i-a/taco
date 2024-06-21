package ru.romania.taco.data;

import org.springframework.data.repository.Repository;

import ru.romania.taco.TacoOrder;

public interface OrderRepository extends Repository<TacoOrder, String> {
    TacoOrder save(TacoOrder order);
}
