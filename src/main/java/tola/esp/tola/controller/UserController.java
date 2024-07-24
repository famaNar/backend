package tola.esp.tola.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import tola.esp.tola.model.User;
import tola.esp.tola.service.UserService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @SuppressWarnings("rawtypes")
    @Autowired
    private UserService userService;

    @SuppressWarnings("unchecked")
    @GetMapping("/list")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @SuppressWarnings("unchecked")
    @GetMapping("/listId/{id}")
    public Optional<User> getUserById(@PathVariable Long id) {
        return userService.getUserById(id);
    }

    @PostMapping("/add")
    public User createUser(@RequestBody User user) {
        return userService.saveUser(user);
    }

    @PutMapping("/put/{id}")
    public User updateUser(@PathVariable Long id, @RequestBody User user) {
        user.setId(id); // Set the ID from path variable to ensure update on correct user
        return userService.saveUser(user);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
    }

    
}
