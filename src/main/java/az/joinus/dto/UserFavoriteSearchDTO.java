package az.joinus.dto;

import lombok.Data;

@Data
public class UserFavoriteSearchDTO {
    private String username;
    private int page;
    private int size;
}
