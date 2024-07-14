package az.joinus.service.abstraction;

import az.joinus.dto.ItemCategory.ItemCategorySaveDTO;
import az.joinus.dto.ItemCategory.ItemCategoryTreeDTO;
import az.joinus.model.entity.ItemCategory;
import org.springframework.data.domain.Page;

import java.util.List;

public interface ItemCategoryService {
    List<ItemCategoryTreeDTO> getAll();
    Page<ItemCategoryTreeDTO> getAllParents(int page, int size);
    ItemCategory save(ItemCategorySaveDTO saveDTO);
    void delete(Long id);
    ItemCategory getById(Long id);
}
