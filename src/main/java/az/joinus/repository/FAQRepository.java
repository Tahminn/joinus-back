package az.joinus.repository;

import az.joinus.model.entity.FAQ;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FAQRepository extends JpaRepository<FAQ, Long> {
    List<FAQ> getAllByIsActive(Boolean isActive);
}
