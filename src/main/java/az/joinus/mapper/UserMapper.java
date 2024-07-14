package az.joinus.mapper;

import az.joinus.model.entity.User;
import az.joinus.dto.RoleDTO;
import az.joinus.dto.authentication.UserDTO;
import az.joinus.model.entity.Role;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;


@Mapper(componentModel = "spring")
public interface UserMapper {
    UserMapper MAPPER = Mappers.getMapper(UserMapper.class);

    User fromDTO(UserDTO userDTO);

    Role fromDto(RoleDTO roleDTO);

    RoleDTO fromEntity(Role role);

    @Mapping(target="photo", source="photoUrl")
    UserDTO fromEntity(User user);



}