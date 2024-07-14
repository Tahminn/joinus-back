package az.joinus.service.abstraction;

import az.joinus.dto.ResponseDTO;
import az.joinus.dto.WishlistItemDTO;
import az.joinus.dto.item.ItemDTO;
import az.joinus.dto.wishlist.WishListGetDTO;
import az.joinus.dto.wishlist.WishlistItemByUrlDTO;
import az.joinus.dto.wishlist.WishlistSaveDTO;
import az.joinus.model.entity.Wishlist;
import org.springframework.data.domain.Page;

public interface WishlistService {
    Wishlist save(WishlistSaveDTO wishlistSaveDTO);

    void delete(Long id);

    Page<WishListGetDTO> findAll(Boolean onlyPublic, String username, int page, int size);

    WishListGetDTO getById(Long id);

    Wishlist addItem(Long wishlistId, ItemDTO itemDTO);

    ResponseDTO addItemByUrl(WishlistItemByUrlDTO wishlistItemByUrlDTO);

    ResponseDTO getWishlistItemsById(Long id);

    ResponseDTO deleteWishlistItemsById(Long id, Long wishlistId);

    ResponseDTO getSharingUrl(String username, String wishlistName);

    Boolean handleItemBuying(WishlistItemDTO wishlistItemDTO);

    WishListGetDTO getByNameAndUsername(String name, String username);

}
