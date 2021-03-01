package com.service.bank.repository;

import com.service.bank.model.User;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<User, Long> {

    @Query("from User u inner join fetch u.roles where u.phoneNumber = :phoneNumber")
    Optional<User> findByPhoneNumber(String phoneNumber);

    @Override
    @Query("from User u inner join fetch u.roles where u.id = :id")
    Optional<User> findById(Long id);
}
