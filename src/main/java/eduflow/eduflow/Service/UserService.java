package eduflow.eduflow.Service;

import eduflow.eduflow.Repo.UserRepo;
import eduflow.eduflow.dto.RegisterRequest;
import eduflow.eduflow.models.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;
    public void createUser(RegisterRequest registerRequest) {
        Users user = new Users();
        user.setUsername(registerRequest.getUsername());
        user.setPassword(registerRequest.getPassword());
        user.setEmail(registerRequest.getEmail());
        userRepo.save(user);
    }

    public Users getUserByUsername(String username) {
        return userRepo.getUserByUsername(username);
    }



}
