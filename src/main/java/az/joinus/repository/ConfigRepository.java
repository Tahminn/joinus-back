package az.joinus.repository;

import az.joinus.model.entity.Config;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ConfigRepository extends JpaRepository<Config, Long> {
    Optional<Config> getByName(String name);
    List<Config> getAllByType(String type);
}
