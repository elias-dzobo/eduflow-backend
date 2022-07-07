package eduflow.eduflow.Service;

import eduflow.eduflow.Repo.RepliesRepo;
import eduflow.eduflow.models.Replies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RepliesService {

    @Autowired
    private final RepliesRepo repliesRepo;

    public RepliesService(RepliesRepo repliesRepo) {
        this.repliesRepo = repliesRepo;
    }

    public List<Replies> getAllRepliesForAQuestion(Integer questionId) {
        return repliesRepo.getRepliesByQuestionId(questionId);
    }

    public Replies addNewReply(Replies newReply) {
        return repliesRepo.save(newReply);
    }
}
