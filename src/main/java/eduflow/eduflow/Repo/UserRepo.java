package eduflow.eduflow.Repo;

import eduflow.eduflow.models.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository <Users, Long>{
    Users getUserByUsername(String username);
}
