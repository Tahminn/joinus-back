package az.joinus.repository;

import az.joinus.model.entity.Permission;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PermissionRepository extends JpaRepository<Permission,Long> {
    List<Permission> findAll();
}
