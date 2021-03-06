package uk.co.gdickinson.smarthome.lambda.payload;

import uk.co.gdickinson.smarthome.lambda.models.MessageName;

public class SetColorTemperatureConfirmation extends ColorTemperatureChangeConfirmation {
  @Override
  public MessageName getMessageName() {
    return MessageName.SET_COLOR_TEMPERATURE_CONFIRMATION;
  }
}
