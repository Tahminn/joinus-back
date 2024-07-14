package az.joinus.service.abstraction;

import az.joinus.dto.QuestionGetDTO;
import az.joinus.dto.QuestionSaveDTO;
import az.joinus.model.entity.Question;

import java.util.List;

public interface QuestionService {
    Question save(QuestionSaveDTO saveDTO);
    List<QuestionGetDTO> getAll();
}
