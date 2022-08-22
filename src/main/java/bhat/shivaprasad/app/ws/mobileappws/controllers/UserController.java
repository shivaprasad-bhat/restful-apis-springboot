package bhat.shivaprasad.app.ws.mobileappws.controllers;
import org.springframework.web.bind.annotation.*;

/**
 * User controller class
 * @author shivaprasad-bhat
 */
@RestController
@RequestMapping("api/v1/user")            //http://loalhost:8080/users
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
