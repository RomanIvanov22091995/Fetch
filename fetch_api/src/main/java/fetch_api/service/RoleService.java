package fetch_api.service;

import fetch_api.entity.Role;

import java.util.List;

public interface RoleService {
    List<Role> getAllRoles();

    void deleteRoleById(Long id);

    void addRole(Role role);

}

