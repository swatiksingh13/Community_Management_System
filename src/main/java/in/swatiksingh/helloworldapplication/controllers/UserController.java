package in.swatiksingh.helloworldapplication.controllers;

import in.swatiksingh.helloworldapplication.models.User;
import in.swatiksingh.helloworldapplication.services.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/addNewUser")
    public User createNewUser(@RequestBody User user) {
        return userService.addUser(user);

    }
}
