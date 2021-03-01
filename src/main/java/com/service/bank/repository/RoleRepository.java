package com.service.bank.repository;

import com.service.bank.model.Role;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface RoleRepository extends JpaRepository<Role, Long> {

    @Query("from Role r where r.role = :roleName")
    Optional<Role> getRoleByName(String roleName);
}
