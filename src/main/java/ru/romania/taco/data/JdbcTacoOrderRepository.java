package ru.romania.taco.data;

import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.jdbc.core.PreparedStatementCreatorFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import ru.romania.taco.TacoOrder;

@Repository
public class JdbcTacoOrderRepository implements OrderRepository {

    private JdbcOperations jdbcOperations;

    public JdbcTacoOrderRepository(JdbcOperations jdbcOperations) {
        this.jdbcOperations = jdbcOperations;
    }

    @Override
    @Transactional
    public TacoOrder save(TacoOrder order) {
        PreparedStatementCreatorFactory pscf = new PreparedStatementCreatorFactory(
            "insert into Taco_Order "
            + "(delivery_Name, delivery_Street, delivery_City"
        )
    }
    
}
