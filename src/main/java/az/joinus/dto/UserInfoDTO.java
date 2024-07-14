package az.joinus.dto;

import az.joinus.model.entity.User;
import lombok.Data;

@Data
public class UserInfoDTO {
    Long id;
    String firstName;
    String lastName;
    String email;
    String username;
    String phoneNumber;
    String gender;

    public UserInfoDTO(User user) {
        this.id = user.getId();
        this.firstName = user.getFirstName();
        this.lastName = user.getLastName();
        this.email = user.getEmail();
        this.username = user.getUsername();
        this.phoneNumber = user.getPhoneNumber();
        this.gender = user.getGender();
    }
}
