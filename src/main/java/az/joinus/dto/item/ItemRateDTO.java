package az.joinus.dto.item;

import az.joinus.model.entity.Item;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Data
public class ItemRateDTO {
    Long rateSum;
    Item item;
}
