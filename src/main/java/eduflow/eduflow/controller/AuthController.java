package eduflow.eduflow.controller;

import eduflow.eduflow.Service.UserService;
import eduflow.eduflow.dto.RegisterRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth/")
public class AuthController {

    @Autowired
    private UserService userService;

    @PostMapping("/signup")
    public void signup(@RequestBody RegisterRequest registerRequest) {
        userService.signup(registerRequest);
    }
}
