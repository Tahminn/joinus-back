package az.joinus.service.implementation;

import az.joinus.dto.QuestionGetDTO;
import az.joinus.dto.QuestionSaveDTO;
import az.joinus.model.entity.Question;
import az.joinus.repository.QuestionRepository;
import az.joinus.service.abstraction.QuestionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class QuestionServiceImpl implements QuestionService {

    private final QuestionRepository repository;

    @Override
    public List<QuestionGetDTO> getAll() {
        List<QuestionGetDTO> questions = new ArrayList<>();
        repository.findAll().forEach(x->questions.add(new QuestionGetDTO(x)));
        return questions;
    }

    @Override
    public Question save(QuestionSaveDTO saveDTO) {
        return repository.save(new Question(saveDTO));
    }
}
