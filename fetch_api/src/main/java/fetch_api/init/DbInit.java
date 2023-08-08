package fetch_api.init;

import fetch_api.entity.Role;
import fetch_api.entity.User;
import fetch_api.service.RoleServiceImpl;
import fetch_api.service.UserServiceImpl;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Set;

@Component
public class DbInit {
    private final UserServiceImpl userService;
    private final RoleServiceImpl roleService;

    public DbInit(UserServiceImpl userService, RoleServiceImpl roleService) {
        this.userService = userService;
        this.roleService = roleService;
    }
    @PostConstruct
    private void postConstruct() {
        Role roleAdmin = new Role(1L,"ADMIN");
        Role roleUser = new Role( 2L,"USER");
        roleService.addRole(roleAdmin);
        roleService.addRole(roleUser);

        User user = new User("user@mail.ru", "user", "user", "userov", 20, Set.of(roleUser));
        User admin = new User("admin@mail.ru", "admin", "admin", "adminov", 30, Set.of(roleAdmin, roleUser));
        userService.addUser( user);
        userService.addUser( admin);
    }
}
