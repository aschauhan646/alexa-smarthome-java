package uk.co.gdickinson.smarthome.lambda.payload;

import uk.co.gdickinson.smarthome.lambda.models.MessageName;

public class DecrementPercentageConfirmation implements Response {
  @Override
  public MessageName getMessageName() {
    return MessageName.DECREMENT_PERCENTAGE_CONFIRMATION;
  }
}
