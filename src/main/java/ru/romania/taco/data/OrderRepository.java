package ru.romania.taco.data;

import ru.romania.taco.TacoOrder;

public interface OrderRepository {
    TacoOrder save(TacoOrder order);
}
