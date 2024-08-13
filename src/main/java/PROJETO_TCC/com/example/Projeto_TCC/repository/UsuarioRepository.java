package PROJETO_TCC.com.example.Projeto_TCC.repository;

import PROJETO_TCC.com.example.Projeto_TCC.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
