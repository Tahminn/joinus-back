package az.joinus.dto.ItemCategory;

import lombok.Data;

@Data
public class ItemCategorySaveDTO {
    Long id;
    Long parentId;
    String name;
}
