package PROJETO_TCC.com.example.Projeto_TCC.service;

import PROJETO_TCC.com.example.Projeto_TCC.entity.Usuario;
import PROJETO_TCC.com.example.Projeto_TCC.repository.UsuarioRepository;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {
    private UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public List<Usuario> criarUsuario(Usuario usuario){
        usuarioRepository.save(usuario);
        return listarUsuario();
    }

    public List<Usuario> listarUsuario(){
        Sort sort = Sort.by("nome").ascending();
        return listarUsuario();
    }

    public List<Usuario> excluirUsuario(Long id) {
        usuarioRepository.deleteById(id);
        return listarUsuario();
    }
}
