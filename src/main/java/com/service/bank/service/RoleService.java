package com.service.bank.service;

import com.service.bank.model.Role;

public interface RoleService {
    Role save(Role role);

    Role getByName(String name);
}
