package co.com.booking.models;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class Credenciales {
  private String email;
  private String password;
}
