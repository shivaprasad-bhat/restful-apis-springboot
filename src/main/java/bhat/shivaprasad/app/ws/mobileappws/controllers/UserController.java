package bhat.shivaprasad.app.ws.mobileappws.controllers;
import bhat.shivaprasad.app.ws.mobileappws.model.requests.UserDetailsModel;
import bhat.shivaprasad.app.ws.mobileappws.model.responses.UserRest;
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
    public UserRest createUser(@RequestBody UserDetailsModel userDetailsModel) {
        return null;
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
