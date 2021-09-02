package com.revature.autosurvey.gateway;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Flux;

@RestController
@RequestMapping("analyticserror")
public class AnalyticsErrorController {

  @GetMapping
  public ResponseEntity<Flux<Object>> handleGet() {
    return ResponseEntity.ok(Flux.empty());
  }
  
}