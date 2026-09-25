package api.financas.infrastructure.persistence.jpa;

import api.financas.domain.entities.User;
import api.financas.domain.interfaces.IUserRepository;
import api.financas.infrastructure.persistence.UserMapper;
import api.financas.infrastructure.persistence.entities.UserEntity;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public class UserRepository implements IUserRepository {

  private final JPARepositoryUser jpaRepositoryUser;

  public UserRepository(JPARepositoryUser jpaRepositoryUser) {
    this.jpaRepositoryUser = jpaRepositoryUser;
  }

  @Override
  public void save(User user) {

    UserEntity userMapped = UserMapper.mapper(user);

    jpaRepositoryUser.save(userMapped);

  }

  @Override
  public void delete(User user) {
    UserEntity userMapped = UserMapper.mapper(user);

    jpaRepositoryUser.delete(userMapped);
  }

  @Override
  public List<User> findAll() {

    List<UserEntity> users = jpaRepositoryUser.findAll();

    return users.stream().map(UserMapper::mapper).toList();
  }
}
