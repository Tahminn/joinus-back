package az.joinus.dto.item;

import az.joinus.model.entity.Item;
import lombok.Data;

@Data
public class ItemGetDTO {
    Long id;
    String name;
    Double price;
    Long categoryId;
    String categoryName;
    String url;
    String photoUrl;
    String description;

    public ItemGetDTO(Item item) {
        this.id = item.getId();
        this.name = item.getName();
        this.price = item.getPrice();
        if(item.getCategory()!=null) {
            this.categoryId = item.getCategory().getId();
            this.categoryName = item.getCategory().getName();
        }
        this.url = item.getUrl();
        this.photoUrl = item.getPhotoUrl();
        this.description = item.getDescription();
    }
}
