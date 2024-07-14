package az.joinus.service.abstraction;

import az.joinus.model.entity.Role;
import az.joinus.model.entity.User;
import az.joinus.dto.RoleDTO;
import org.springframework.data.domain.Page;

import java.util.List;
import java.util.Set;

public interface RoleService {
    Role save(String user, Role role);
    Role findById(Long id);
    Page<Role> findAllByPageSizeAndNumber(int page, int size);
    Role assignUserToRole(Long id, List<User> users);
    List<RoleDTO>  findAll();
    List<Role> saveAll(Set<Role> roles);
    void deleteRoleById(Long id);
}
