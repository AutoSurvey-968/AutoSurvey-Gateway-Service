package com.revature.autosurvey.gateway;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import reactor.core.publisher.Flux;
import reactor.test.StepVerifier;

@ExtendWith(SpringExtension.class)
class ErrorControllerTest {
	
	@TestConfiguration
	static class Configuration {
		
		@Bean
		public ErrorController getErrorController() {
			return new ErrorController();
		}

	}
	
	@Autowired
	private ErrorController errorController;
	
	@Test
	void tetGetError() {
		ResponseEntity<Flux<Object>> response = errorController.getError();
		
		assertThat(response.getStatusCodeValue()).isEqualTo(200);
		StepVerifier.create(response.getBody()).verifyComplete();
	}
	
	@Test
	void testPutError() {
		ResponseEntity<Object> response = errorController.putError();
		
		assertThat(response.getStatusCodeValue()).isEqualTo(503);
		
	}
	
	@Test
	void testPostError() {
		ResponseEntity<Object> response = errorController.postError();
		
		assertThat(response.getStatusCodeValue()).isEqualTo(503);
		
	}
	
	@Test
	void testDeleteError() {
		ResponseEntity<Object> response = errorController.deleteError();
		
		assertThat(response.getStatusCodeValue()).isEqualTo(503);
		
	}
}
