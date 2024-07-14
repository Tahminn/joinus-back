package az.joinus.service.implementation;

import az.joinus.dto.ClientMessageDTO;
import az.joinus.model.entity.ClientMessage;
import az.joinus.repository.ClientMessageRepository;
import az.joinus.service.abstraction.ClientMessageService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClientMessageServiceImpl implements ClientMessageService {

    private final ClientMessageRepository repository;

    @Override
    public List<ClientMessage> findAll() {
        return repository.findAll();
    }

    @Override
    public ClientMessage save(ClientMessageDTO messageDTO) {
        return repository.save(new ClientMessage(messageDTO));
    }
}
