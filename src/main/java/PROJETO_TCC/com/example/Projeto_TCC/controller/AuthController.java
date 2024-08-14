package PROJETO_TCC.com.example.Projeto_TCC.controller;

import PROJETO_TCC.com.example.Projeto_TCC.dto.LoginRequestDTO;
import PROJETO_TCC.com.example.Projeto_TCC.entity.Usuario;
import PROJETO_TCC.com.example.Projeto_TCC.repository.UsuarioRepository;
import PROJETO_TCC.com.example.Projeto_TCC.security.TokenService;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {
    private UsuarioRepository usuarioRepository;
    private final PasswordEncoder passwordEncoder;
    private final TokenService tokenService;

    public AuthController(PasswordEncoder passwordEncoder, TokenService tokenService, UsuarioRepository usuarioRepository) {
        this.passwordEncoder = passwordEncoder;
        this.tokenService = tokenService;
        this.usuarioRepository = usuarioRepository;
    }


//
//    @PostMapping("/login")
//    public ResponseEntity login(@RequestBody LoginRequestDTO body) {
//        Usuario usuario = this.usuarioRepository.findByEmail(body.email()).orElseThrow(() -> new RuntimeException("Usuário não encontrado"));
//        if(passwordEncoder.matches(usuario.getSenha(), body.password())){
//        String token = this.tokenService.generateToken(Usuario)
//        }
//    }

    //minuto 39.37
}
