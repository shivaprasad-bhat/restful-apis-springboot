package bhat.shivaprasad.app.ws.ui.controllers;
/**
 * User controller class
 * @author shivaprasad-bhat
 */

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/users")            //http://loalhost:8080//api/v1/users
public class UserController {

    @GetMapping
    public String getUser() {
        return "GET getUser() was called";
    }

    @PostMapping
    public String createUser() {
        return "POST createUser() was called";
    }

    @PutMapping
    public String updateUser() {
        return "PUT updateUser() was called";
    }

    @DeleteMapping
    public String deleteUser() {
        return "DELETE deleteUser() was called";
    }
}
