package az.joinus.service.implementation;

import az.joinus.repository.ConfirmationTokenRepository;
import az.joinus.model.entity.ConfirmationToken;
import az.joinus.service.abstraction.ConfirmationTokenService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class ConfirmationTokenServiceImpl implements ConfirmationTokenService {

    private final ConfirmationTokenRepository repository;

    @Override
    public ConfirmationToken findByToken(String token) {
        return repository.findByToken(token).orElseThrow(() ->
                new IllegalStateException("token not found"));
    }

    @Override
    public void setConfirmedAt(String token) {
        repository.updateConfirmedAt(
                token, LocalDateTime.now());
    }

    @Override
    public void saveConfirmationToken(ConfirmationToken token){
        repository.save(token);
    }

}
