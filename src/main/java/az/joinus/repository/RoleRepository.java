package az.joinus.repository;

import az.joinus.model.entity.Role;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role,Long> {
    Page<Role> findAll(Pageable pageable);

    Role findByName(String name);

    @Override
    void deleteById(Long id);
}
