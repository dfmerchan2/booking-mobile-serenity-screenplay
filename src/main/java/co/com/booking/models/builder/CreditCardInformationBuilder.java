package co.com.booking.models.builder;

import co.com.booking.models.CreditCardInformation;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;

import static co.com.booking.utilities.Constants.faker;
import static co.com.booking.utilities.Conversion.getDateCreditCard;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class CreditCardInformationBuilder {

  public static CreditCardInformation getCreditCardInformation() {
    return CreditCardInformation.builder()
        .numberCard(faker.number().digits(16))
        .holderName(faker.name().fullName())
        .expirationDate(getDateCreditCard())
        .build();
  }
}
