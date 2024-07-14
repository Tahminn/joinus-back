package az.joinus.repository;

import az.joinus.model.entity.ClientMessage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientMessageRepository extends JpaRepository<ClientMessage, Long> {
}
