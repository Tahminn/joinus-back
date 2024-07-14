package az.joinus.repository;

import az.joinus.model.entity.User;
import az.joinus.model.entity.UserFavorite;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserFavoriteRepository extends JpaRepository<UserFavorite, Long> {
    List<UserFavorite> findAllByUser(User user);
}
