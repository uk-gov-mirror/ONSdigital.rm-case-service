package uk.gov.ons.ctp.response.casesvc.message;

import static org.junit.Assert.assertTrue;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import org.springframework.messaging.Message;
import org.junit.Test;
import org.springframework.integration.support.MessageBuilder;

public class ReceiptFilterTest {

  @Test
  public void willValidateJson() throws JsonParseException, JsonMappingException, IOException {
    String payload = "{\"caseId\":\"34597808-ec88-4e93-af2f-228e33ff7946\",\"partyId\":\"34597808-ec88-4e93-af2f-228e33ff7946\",\"caseRef\":\"12343543\"}";

    Message<?> m = MessageBuilder.withPayload(payload.getBytes()).build();

    ReceiptFilter filter = new ReceiptFilter();
    assertTrue(filter.accept(m));
  }
}