//package fetch_api.controller;
//
//import fetch_api.entity.Role;
//import fetch_api.entity.User;
//import fetch_api.repository.RoleRepository;
//import fetch_api.service.UserService;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//import java.util.List;
//
//@Controller
//@RequestMapping("api/admin")
//public class AdminController {
//    private final UserService userService;
//    private final RoleRepository roleRepository;
//
//    public AdminController(UserService userService, RoleRepository roleRepository) {
//        this.userService = userService;
//        this.roleRepository = roleRepository;
//    }
//
//    @GetMapping("/users")
//    public String showAllUsers(Model model) {
//        List<User> users = userService.getAllUsers();
//        model.addAttribute("users", users);
//        return "allUsers";
//    }
//
//    @ModelAttribute("roles")
//    public List<Role> initializeRoles() {
//        return roleRepository.findAll();
//    }
//
//
//
////    @GetMapping("/user/edit/{id}")
////    public String editUser(@PathVariable Long id, Model model) {
////
////        List<Role> roles = roleRepository.findAll();
////        model.addAttribute("roles", roles);
////
////        return "allUsers";
////    }
//}
