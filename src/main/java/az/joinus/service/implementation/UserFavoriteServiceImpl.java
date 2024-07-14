package az.joinus.service.implementation;

import az.joinus.dto.UserFavoritePostDTO;
import az.joinus.dto.UserFavoriteSearchDTO;
import az.joinus.model.entity.Item;
import az.joinus.model.entity.User;
import az.joinus.model.entity.UserFavorite;
import az.joinus.repository.UserFavoriteRepository;
import az.joinus.service.abstraction.ItemService;
import az.joinus.service.abstraction.UserFavoriteService;
import az.joinus.util.ListUtil;
import lombok.RequiredArgsConstructor;
import org.json.JSONObject;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UserFavoriteServiceImpl implements UserFavoriteService {

    private final UserFavoriteRepository repository;
    private final UserServiceImpl userService;
    private final ItemService itemService;

    @Override
    public UserFavorite post(UserFavoritePostDTO postDTO) {
        User authenticatedUser = userService.findByUsername(postDTO.getUsername());
        return repository.save(new UserFavorite(authenticatedUser, postDTO, itemService.getById(postDTO.getItemId())));
    }

    @Override
    public Page<Item> getAll(String username, int page, int size) {
        User user = userService.findByUsername(username);
        List<UserFavorite> favorites;
        if (user == null)
            favorites = repository.findAll();
        else
            favorites = repository.findAllByUser(user);
        List<Item> items = favorites.stream().map(UserFavorite::getItem).collect(Collectors.toList());
        return ListUtil.convertToPage(items, size, page);
    }
}
