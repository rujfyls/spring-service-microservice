package ru.feduncov.userservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.feduncov.userservice.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
