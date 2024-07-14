package az.joinus.service.abstraction;

import az.joinus.dto.item.ItemFromUrlDTO;
import az.joinus.dto.item.ItemGetDTO;
import az.joinus.dto.item.ItemSaveDTO;
import az.joinus.dto.item.ItemSearchDTO;
import az.joinus.model.entity.Item;
import org.springframework.data.domain.Page;

import java.util.List;

public interface ItemService {

    ItemFromUrlDTO getFromUrl(String url);
    Item save(Item item);
    Item save(ItemSaveDTO saveDTO);
    Page<ItemGetDTO> getAll(Long categoryId, String name, Double minPrice, Double maxPrice, int page, int size);
    Item getById(Long id);
    List<Item> getAll();
    Boolean isItemExistsByUrl(String path);
    Item getByUrl(String url);
}
