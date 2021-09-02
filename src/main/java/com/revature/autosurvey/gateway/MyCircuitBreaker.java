package com.revature.autosurvey.gateway;

import java.time.Duration;

import org.springframework.cloud.circuitbreaker.resilience4j.ReactiveResilience4JCircuitBreakerFactory;
import org.springframework.cloud.circuitbreaker.resilience4j.Resilience4JConfigBuilder;
import org.springframework.cloud.client.circuitbreaker.Customizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.github.resilience4j.circuitbreaker.CircuitBreakerConfig;
import io.github.resilience4j.circuitbreaker.CircuitBreakerConfig.SlidingWindowType;
import io.github.resilience4j.timelimiter.TimeLimiterConfig;

@Configuration
public class MyCircuitBreaker {

  @Bean
  public Customizer<ReactiveResilience4JCircuitBreakerFactory> defaultCustomizer() {
    return factory -> factory.configureDefault(id -> new Resilience4JConfigBuilder(id)
            .circuitBreakerConfig(CircuitBreakerConfig.custom()
            		.failureRateThreshold(50)
            		  .slowCallRateThreshold(50)
            		  .waitDurationInOpenState(Duration.ofMillis(1000))
            		  .slowCallDurationThreshold(Duration.ofSeconds(2))
            		  .permittedNumberOfCallsInHalfOpenState(3)
            		  .minimumNumberOfCalls(10)
            		  .slidingWindowType(SlidingWindowType.TIME_BASED)
            		  .slidingWindowSize(5)
            		  .recordExceptions(Throwable.class)
            		  .build())
            .timeLimiterConfig(TimeLimiterConfig.custom().timeoutDuration(Duration.ofSeconds(4)).build()).build());
  }
}
