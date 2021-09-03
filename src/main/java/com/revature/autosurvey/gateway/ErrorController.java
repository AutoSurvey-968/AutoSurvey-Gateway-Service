package com.revature.autosurvey.gateway;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Flux;

@RestController
@RequestMapping("fallback")
public class ErrorController {
	
	@GetMapping
	public ResponseEntity<Flux<Object>> getError() {
		return ResponseEntity.ok(Flux.empty());
	}
	
	@PutMapping
	public ResponseEntity<Object> putError(){
		return ResponseEntity.status(503).build();
	}
	
	@PostMapping
	public ResponseEntity<Object> postError(){
		return ResponseEntity.status(503).build();
	}
	
	@DeleteMapping
	public ResponseEntity<Object> deleteError(){
		return ResponseEntity.status(503).build();
	}
}
