package az.joinus.util;

import az.joinus.dto.authentication.UserNameDTO;

public class UserUtil {
    public static UserNameDTO divideFullName(String fullName) {
        String[] fullNameArray = fullName.split(" ");
        return UserNameDTO.builder()
                .firstName(fullNameArray[0])
                .lastName(fullNameArray.length < 2 ? null : fullNameArray[1])
                .build();
    }
}
