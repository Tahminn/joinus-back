package az.joinus.dto.item;

import az.joinus.dto.AnswerDTO;
import lombok.Data;

@Data
public class ItemAnswerRateDTO {
    private Long id;
    private Long itemId;

    private String question;
    private AnswerDTO answerDTO;
    private Integer rate;

}
