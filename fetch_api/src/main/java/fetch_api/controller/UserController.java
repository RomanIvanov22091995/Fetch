package fetch_api.controller;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.CurrentSecurityContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import fetch_api.entity.User;
import fetch_api.service.UserService;

import java.security.Principal;
import java.util.Optional;

@RestController
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(path = "/api/auth", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Optional<User>> getAuthUser(@CurrentSecurityContext(expression = "authentication") Principal principal) {
        Optional<User> user = userService.findByUsername(principal.getName());
        return ResponseEntity.ok(user);
    }
}
