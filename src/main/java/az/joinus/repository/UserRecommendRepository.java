package az.joinus.repository;

import az.joinus.model.entity.User;
import az.joinus.model.entity.UserRecommend;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRecommendRepository extends JpaRepository<UserRecommend, Long> {
    UserRecommend getByUser(User user);
}
