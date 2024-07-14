package az.joinus.dto;

import az.joinus.model.entity.Answer;
import lombok.Data;

import java.util.List;

@Data
public class QuestionSaveDTO {
    Long id;
    String question;
    List<Answer> answers;
    Integer questionOrder;
}
