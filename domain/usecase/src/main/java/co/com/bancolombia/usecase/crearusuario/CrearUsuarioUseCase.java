package co.com.bancolombia.usecase.crearusuario;

import co.com.bancolombia.model.user.User;
import co.com.bancolombia.model.user.gateways.UserRepository;
import lombok.RequiredArgsConstructor;
@RequiredArgsConstructor
public class CrearUsuarioUseCase {

    UserRepository userRepository;

    public void crearUsuario(Long id, String name, String email, String password){

        User user = new User(id, name,email,password);

        userRepository.crearUsuario(user);

    }

}
