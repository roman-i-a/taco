package ru.romania.taco.data;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ru.romania.taco.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    User findByUsername(String name);
}
