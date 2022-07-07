package eduflow.eduflow.Service;

import eduflow.eduflow.Repo.QuestionRepo;
import eduflow.eduflow.models.Questions;

import java.util.List;

public class QuestionService {

    private final QuestionRepo questionRepo;

    public QuestionService(QuestionRepo questionRepo) {
        this.questionRepo = questionRepo;
    }

    public List<Questions> getAllQuestion() {
        return questionRepo.findAll();
    }
}
