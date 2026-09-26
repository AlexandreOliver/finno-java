package api.financas.infrastructure.Security;

import api.financas.domain.interfaces.IPasswordHasher;
import api.financas.domain.valueobject.PasswordHash;
import org.springframework.stereotype.Component;

import org.mindrot.jbcrypt.BCrypt;

@Component
public class BCryptPasswordHasher implements IPasswordHasher {

  @Override
  public PasswordHash hash(String rawPassword) {

    String hash = BCrypt.hashpw(rawPassword, BCrypt.gensalt());

    return new PasswordHash(hash);
  }

  @Override
  public boolean compare(String rawPassword, PasswordHash passwordHash) {
    return BCrypt.checkpw(rawPassword, passwordHash.value());
  }
}
