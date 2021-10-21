package cliente.eureka.ClienteEureka2.controlador;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;
@RestController
public class clienteController {


		private Counter counter;
		
		//Utilidad de prometheus MeterRegistry
		public clienteController(MeterRegistry registry) {
			
			this.counter = Counter.builder("saludos.hola").description("saludos totales").register(registry);
			
		}
		// Aumenta el contador cuando entremos en http://localhost:8080/holamundo
		@GetMapping(path="/saludos")
		public String holaMundo() {
			counter.increment();
			return "Hola mundo";
		
		}
}
