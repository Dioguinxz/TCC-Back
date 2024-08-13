package PROJETO_TCC.com.example.Projeto_TCC.controller;

import PROJETO_TCC.com.example.Projeto_TCC.entity.Usuario;
import PROJETO_TCC.com.example.Projeto_TCC.service.UsuarioService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    private UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @PostMapping
    List<Usuario> criarUsuario(@RequestBody Usuario usuario) {
        return usuarioService.criarUsuario(usuario);
    }

    @GetMapping
    List<Usuario> listarUsuario() {
        return usuarioService.listarUsuario();
    }

    @PutMapping
    List<Usuario> editarUsuario(@RequestBody Usuario usuario) {
        return usuarioService.editarUsuario(usuario);
    }

    @DeleteMapping("{id}")
    List<Usuario> excluirUsuario(@PathVariable("id") Long id) {
        return usuarioService.excluirUsuario(id);
    }
}
