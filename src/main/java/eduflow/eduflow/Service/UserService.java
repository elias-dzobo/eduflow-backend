package eduflow.eduflow.Service;

import eduflow.eduflow.Repo.UserRepo;
import eduflow.eduflow.models.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepo userRepo;

    @Autowired
    public UserService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    public Users addNewUser(Users newUser) {
        return userRepo.save(newUser);
    }


}
