package org.acme;

import jakarta.enterprise.context.ApplicationScoped;

import java.time.Duration;

import com.google.type.Decimal;

import dev.langchain4j.agent.tool.Tool;
import io.quarkus.logging.Log;


@ApplicationScoped
public class CookService {
  @Tool("cook the food for a given duration at a given temperature in Celsius")
  public void cook(Duration duration, Integer temperature) throws InterruptedException {
      Log.info("cooking the food for " + duration + " at " + temperature + " degrees Celsius");
      Log.info("simulating cooking time at 1000 speed.");
      Thread.sleep(duration.toMillis()/1000);
  }
  @Tool("add a given amount expressed in a given measure of a given ingredient to food")
  public void addIngredient(Decimal amount, String measure, String ingredient) throws InterruptedException {
      Log.info("adding " + amount + " " + measure + " of " + ingredient + " to food");
      Thread.sleep(1000);
  }
}
