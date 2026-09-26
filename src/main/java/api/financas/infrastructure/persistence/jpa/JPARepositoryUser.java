package api.financas.infrastructure.persistence.jpa;

import api.financas.infrastructure.persistence.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface JPARepositoryUser extends JpaRepository<UserEntity, UUID> {

  boolean existsByEmail(String email);

}
