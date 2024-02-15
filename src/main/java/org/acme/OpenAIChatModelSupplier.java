package org.acme;

import java.time.Duration;
import java.util.function.Supplier;

import dev.langchain4j.model.chat.ChatLanguageModel;
import dev.langchain4j.model.openai.OpenAiChatModel;

public class OpenAIChatModelSupplier implements Supplier<ChatLanguageModel> {
  @Override
  public ChatLanguageModel get() {
      return OpenAiChatModel.builder()
              .apiKey("...")
              .baseUrl("http://localhost:11434/v1")
              .modelName("fLlama-2-7b")
              .timeout(Duration.ofSeconds(60))
              .logRequests(true)
              .logResponses(true)
              .build();
  }
}