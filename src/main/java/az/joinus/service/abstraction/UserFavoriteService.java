package az.joinus.service.abstraction;

import az.joinus.dto.UserFavoritePostDTO;
import az.joinus.dto.UserFavoriteSearchDTO;
import az.joinus.model.entity.Item;
import az.joinus.model.entity.UserFavorite;
import org.springframework.data.domain.Page;

public interface UserFavoriteService {
    Page<Item> getAll(String username, int page, int size);
    UserFavorite post(UserFavoritePostDTO postDTO);
}
