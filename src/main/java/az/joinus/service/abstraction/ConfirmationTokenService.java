package az.joinus.service.abstraction;

import az.joinus.model.entity.ConfirmationToken;

public interface ConfirmationTokenService {
    ConfirmationToken findByToken(String token);
    void setConfirmedAt(String token);
    void saveConfirmationToken(ConfirmationToken token);
}
