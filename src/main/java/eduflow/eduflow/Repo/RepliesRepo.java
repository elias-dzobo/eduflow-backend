package eduflow.eduflow.Repo;

import eduflow.eduflow.models.Replies;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RepliesRepo extends JpaRepository<Replies, Integer> {

    List<Replies> getRepliesByQuestionId(Integer questionId);
}
