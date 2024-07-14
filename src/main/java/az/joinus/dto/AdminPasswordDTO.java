package az.joinus.dto;


import az.joinus.validation.PasswordMatch;
import az.joinus.validation.ValidPassword;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
@PasswordMatch(password = "newPassword", confirmationPassword = "confirmationPassword")
public class AdminPasswordDTO {
    @NotNull
    @ValidPassword
    private String newPassword;

    @NotNull
    private String confirmationPassword;
}
