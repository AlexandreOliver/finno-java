package api.financas.domain.interfaces;

import api.financas.domain.entities.User;

import java.util.List;

public interface IUserRepository {
  void save(User user);
  void delete(User user);
  List<User> findAll();
}
