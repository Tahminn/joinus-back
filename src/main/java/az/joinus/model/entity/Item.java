package az.joinus.model.entity;

import az.joinus.dto.item.ItemDTO;
import az.joinus.dto.item.ItemFromUrlDTO;
import az.joinus.dto.item.ItemSaveDTO;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

@Data
@NoArgsConstructor
@Entity
public class Item {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    private String name;

    private Boolean byAdmin;

    private Double price;

    private String url;

    private String photoUrl;

    @ManyToOne
    private ItemCategory category;

    @Column(length = 5000)
    private String description;

    public Item(ItemSaveDTO saveDTO, ItemCategory category, Boolean byAdmin) {
        this.id = saveDTO.getId();
        this.name = saveDTO.getName();
        this.price = saveDTO.getPrice();
        this.url = saveDTO.getUrl();
        this.photoUrl = saveDTO.getPhotoUrl();
        this.description = saveDTO.getDescription();
        this.category = category;
        this.byAdmin = byAdmin;
    }

    public Item(ItemDTO itemDTO, Boolean byAdmin) {
        this.id = itemDTO.getId();
        this.name = itemDTO.getName();
        this.byAdmin = byAdmin;
        this.url = itemDTO.getUrl();
        this.price = itemDTO.getPrice();
        this.description = itemDTO.getDescription();
    }

    public Item(ItemFromUrlDTO dto, Boolean byAdmin) {
        this.name = dto.getName();
        this.price = dto.getPrice();
        this.url = dto.getUrl();
        this.photoUrl = dto.getPhotoUrl();
        this.byAdmin = byAdmin;
    }

}
