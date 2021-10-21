package cliente.eureka.ClienteEureka2.controlador;

import org.springframework.boot.actuate.endpoint.web.annotation.RestControllerEndpoint;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RestControllerEndpoint(id="endPointCustomizado")
public class ClienteEndpoint {
	
	@GetMapping("/")
	public ResponseEntity<String> endPointCustomizado(){
		
		return new ResponseEntity<>("Hola desde el endpoint customizado del cliente!", HttpStatus.OK);
		
	}
	
	@ResponseBody
	@GetMapping("/persona/{nombre}")
	public String prueba(@PathVariable String nombre) {
		
		String respuesta = "Hola: " + nombre + " estás en la máquina cliente de eureka";
		return respuesta;
		
	}

}
