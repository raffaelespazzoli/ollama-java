package org.acme;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;

//import org.jboss.resteasy.reactive.RestQuery;

import jakarta.inject.Inject;

@Path("/query")
public class ChatService {
  @Inject OllamaChatService ollamaChatService;

  // @POST
  // public String query(String topic, @RestQuery int lines) {
  //    return ollamaChatService.writeAPoem(topic,lines);
  // }

  @POST
  public String cook() {
     return ollamaChatService.cookRecipe();
  }
}
