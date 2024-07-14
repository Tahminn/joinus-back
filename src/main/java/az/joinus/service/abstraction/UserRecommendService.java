package az.joinus.service.abstraction;

import az.joinus.dto.item.ItemGetDTO;
import az.joinus.model.entity.User;
import az.joinus.model.entity.UserRecommend;

import java.util.List;

public interface UserRecommendService {
    UserRecommend save(UserRecommend userRecommend);
    UserRecommend getByUser(User user);

    void deleteById(Long id);

    List<ItemGetDTO> getRecommendItemsByUsername(String username);
}
