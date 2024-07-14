package az.joinus.service.abstraction;


import az.joinus.dto.ResponseDTO;
import az.joinus.dto.authentication.UserPasswordDTO;

public interface PasswordService {
    ResponseDTO resetPassword(String email, String password);
    boolean isValidPassword(String password, String encryptedPassword);
    ResponseDTO changePasswordByUser(UserPasswordDTO passwordDto);
}
