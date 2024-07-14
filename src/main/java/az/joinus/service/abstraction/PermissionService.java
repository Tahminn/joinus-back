package az.joinus.service.abstraction;

import az.joinus.model.entity.Permission;

import java.util.List;

public interface PermissionService {
    List<Permission> findAll();
}
