package api.financas.domain.valueobject;

public record Email(String value) {

  public Email {
    if (value == null || value.isBlank()) {
      throw new IllegalArgumentException("Forneça o Email");
    }

    value = value.trim().toLowerCase();

    if (!value.matches("^[^@\\s]+@[^@\\s]+\\.[^@\\s]+$")) {
      throw new IllegalArgumentException("Email inválido");
    }
  }

  public static Email of(String value) {
    return new Email(value);
  }
}

