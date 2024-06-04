package com.PerSEO.Hexagonalintentoryapp.product.infrastructure.rest;

import com.PerSEO.Hexagonalintentoryapp.product.application.UserService;
import com.PerSEO.Hexagonalintentoryapp.product.domain.model.User;
import org.springframework.web.bind.annotation.*;

@RestController
//http://localhost:8085
@RequestMapping("/api/v1_1/users")
//http://localhost:8085/api/v1_1/users
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {
    private final UserService userService;

     // -- constructor
    public UserController(UserService userService) {
        this.userService = userService;
    }

    /**
     * Save User
     * @param user
     * @return
     */
    @PostMapping
    public User save(@RequestBody User user){
        return userService.save(user);
    }

    /**
     * Find user by id
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    public User findById(@PathVariable Integer id){
        return userService.findById(id);
    }
}