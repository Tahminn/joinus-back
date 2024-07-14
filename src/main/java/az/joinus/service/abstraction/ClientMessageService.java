package az.joinus.service.abstraction;

import az.joinus.dto.ClientMessageDTO;
import az.joinus.model.entity.ClientMessage;

import java.util.List;

public interface ClientMessageService {
    ClientMessage save(ClientMessageDTO messageDTO);
    List<ClientMessage> findAll();
}
