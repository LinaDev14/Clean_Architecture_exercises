package co.com.bancolombia.api;
import co.com.bancolombia.api.dto.GetUser;
import co.com.bancolombia.usecase.crearusuario.CrearUsuarioUseCase;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/User", produces = MediaType.APPLICATION_JSON_VALUE)
@AllArgsConstructor
public class ApiRest {
   private final CrearUsuarioUseCase useCase;


    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public String crearUsuario(@RequestBody GetUser data) {
//      return useCase.doAction();

        useCase.crearUsuario(data.getId(),data.getName(), data.getEmail(), data.getPassword());
        return "Hello World";
    }
}
