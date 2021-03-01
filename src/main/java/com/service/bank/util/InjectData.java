package com.service.bank.util;

import com.service.bank.model.Role;
import com.service.bank.model.RoleName;
import com.service.bank.model.User;
import com.service.bank.service.RoleService;
import com.service.bank.service.UserService;
import java.time.LocalDate;
import java.util.Set;
import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InjectData {
    @Autowired
    private RoleService roleService;
    @Autowired
    private UserService userService;

    @PostConstruct
    private void init() {
        Role admin = new Role();
        admin.setRole(RoleName.ADMIN);
        User userAdmin = new User();
        userAdmin.builder()
                .dateOfBirth(LocalDate.of(1980, 5, 25))
                .name("Bob")
                .password("admin")
                .phoneNumber("9379992")
                .roles(Set.of(admin)).build();
        Role user = new Role();
        user.setRole(RoleName.USER);
        User userUser = new User();
        userUser.builder()
                .dateOfBirth(LocalDate.of(1995, 12,5))
                .name("Alice")
                .password("1234")
                .phoneNumber("0884522245")
                .roles(Set.of(user)).build();
        roleService.save(admin);
        roleService.save(user);
        userService.save(userAdmin);
        userService.save(userUser);
    }
}
