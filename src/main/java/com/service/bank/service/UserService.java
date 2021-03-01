package com.service.bank.service;

import com.service.bank.model.User;
import java.util.List;

public interface UserService {
    User get(Long id);

    List<User> getAll();

    User getByPhone(String phoneNumber);

    User save(User user);

    User update(User user);

    void delete(Long id);
}
