package api.financas.domain.interfaces;

import api.financas.domain.valueobject.PasswordHash;

public interface IPasswordHasher {
  PasswordHash hash(String rawPassword);

  boolean compare(String rawPassword, PasswordHash passwordHash);
}
