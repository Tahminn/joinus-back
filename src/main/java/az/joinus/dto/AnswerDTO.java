package az.joinus.dto;

import az.joinus.model.entity.Answer;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AnswerDTO {
    private Long id;
    private String answer;

    public AnswerDTO(Answer answer) {
        this.id = answer.getId();
        this.answer = answer.getAnswer();
    }
}
