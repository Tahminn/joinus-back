package az.joinus.service.abstraction;

import az.joinus.dto.ResponseDTO;
import az.joinus.dto.item.ItemAnswerRateDTO;
import az.joinus.dto.item.ItemGenerateDTO;
import az.joinus.dto.item.ItemGetDTO;
import az.joinus.dto.item.ItemRateDTO;

import java.util.List;

public interface ItemRateService {
    ResponseDTO generateItemAnswerBased(ItemGenerateDTO itemGenerateDTO);
    ItemAnswerRateDTO save(ItemAnswerRateDTO itemAnswerRateDTO);

    List<ItemAnswerRateDTO> getAll();

}
