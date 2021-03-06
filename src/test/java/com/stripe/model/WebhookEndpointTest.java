package com.stripe.model;

import static org.junit.Assert.assertNotNull;

import com.stripe.BaseStripeTest;
import com.stripe.model.WebhookEndpoint;
import com.stripe.net.ApiResource;

import org.junit.Test;

public class WebhookEndpointTest extends BaseStripeTest {
  @Test
  public void testDeserialize() throws Exception {
    final String data = getFixture("/v1/webhook_endpoints/we_123");
    final WebhookEndpoint resource = ApiResource.GSON.fromJson(data, WebhookEndpoint.class);
    assertNotNull(resource);
    assertNotNull(resource.getId());
  }
}
