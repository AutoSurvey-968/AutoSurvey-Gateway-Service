package com.revature.autosurvey.gateway;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import reactor.core.publisher.Mono;
@RestController
@RequestMapping("ioerror")

public class IoErrorController {
@PostMapping
	  public Mono<ResponseEntity<Object>> handlePost() {
	    return Mono.just(ResponseEntity.status(503).build());
	  }
}
