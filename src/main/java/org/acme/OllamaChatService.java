package org.acme;

import dev.langchain4j.service.SystemMessage;
import dev.langchain4j.service.UserMessage;
import io.quarkiverse.langchain4j.RegisterAiService;

@RegisterAiService(chatMemoryProviderSupplier =ChatMemoryBean.class,tools = CookService.class,modelName = "oai")
public interface OllamaChatService {

  @SystemMessage("You are a professional cook.")
  @UserMessage("""
    add celery 10 grams
    add vinegar 20 deciliters.
    cook for 10 minutes in a pan at 300 celsius degrees
  """)
  String cookRecipe();
}
