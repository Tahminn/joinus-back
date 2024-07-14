package az.joinus.service.implementation;

import az.joinus.repository.PermissionRepository;
import az.joinus.service.abstraction.PermissionService;
import az.joinus.model.entity.Permission;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PermissionServiceImpl implements PermissionService {

    private final PermissionRepository permissionRepository;

    @Override
    public List<Permission> findAll() {
        return permissionRepository.findAll();
    }
}
