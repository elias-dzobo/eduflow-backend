package eduflow.eduflow.Service;

import eduflow.eduflow.Repo.QuestionRepo;
import eduflow.eduflow.models.Questions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {

    private final QuestionRepo questionRepo;

    @Autowired
    public QuestionService(QuestionRepo questionRepo) {
        this.questionRepo = questionRepo;
    }

    // Get all questions from the database
    public List<Questions> getAllQuestion() {
        return questionRepo.findAll();
    }

    // Post a new question and saves it to database
    public Questions postNewQuestion(Questions newQuestion) {
        return questionRepo.save(newQuestion);
    }




}
