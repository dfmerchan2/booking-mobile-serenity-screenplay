Feature: Frontend - Login to the Booking application

  Scenario: Login successful
    When that "Diego" authenticated with user "Test1001@gmail.com" and password "Test741852*"
    Then should see the message of welcoming "¡te damos la bienvenida a Booking.com!"

  Scenario: Login failed with incorrect credentials
    When that "Diego" authenticated with user "userInvalid" and password "Test123456"
    Then should see the authentication error message "Esta contraseña es incorrecta, vuelve a intentarlo"