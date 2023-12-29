package ms.bc48.customer.config;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ApplicationException {
	
	@ExceptionHandler(ConfigException.class)
	public ResponseEntity<?> handlerAplicationException(ConfigException configException){
		Map<String, String> atribute=new HashMap<>();
		atribute.put("ERROR:", configException.getMessage());
		atribute.put("STATUS", HttpStatus.BAD_REQUEST.toString());
		return ResponseEntity.ok(atribute);
	}

}
