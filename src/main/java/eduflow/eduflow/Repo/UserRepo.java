package eduflow.eduflow.Repo;

import eduflow.eduflow.models.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository <Users, Integer>{
}
