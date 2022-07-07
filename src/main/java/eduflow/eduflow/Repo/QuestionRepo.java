package eduflow.eduflow.Repo;

import eduflow.eduflow.models.Questions;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepo extends JpaRepository<Questions, Integer> {
}
