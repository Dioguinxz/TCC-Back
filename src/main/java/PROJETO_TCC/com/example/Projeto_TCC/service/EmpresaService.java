package PROJETO_TCC.com.example.Projeto_TCC.service;

import PROJETO_TCC.com.example.Projeto_TCC.entity.Empresa;
import PROJETO_TCC.com.example.Projeto_TCC.entity.Usuario;
import PROJETO_TCC.com.example.Projeto_TCC.repository.EmpresaRepository;
import PROJETO_TCC.com.example.Projeto_TCC.repository.UsuarioRepository;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpresaService {
    private EmpresaRepository empresaRepository;

    public EmpresaService(EmpresaRepository empresaRepository) {
        this.empresaRepository = empresaRepository;
    }

    public List<Empresa> criarEmpresa(Empresa empresa){
        empresaRepository.save(empresa);
        return listarEmpresa();
    }

    public List<Empresa> listarEmpresa(){
        Sort sort = Sort.by("nome").ascending();
        return empresaRepository.findAll(sort);
    }

    public List<Empresa> editarEmpresa(Empresa empresa){
        empresaRepository.save(empresa);
        return listarEmpresa();
    }

    public List<Empresa> excluirEmpresa(Long id) {
        empresaRepository.deleteById(id);
        return listarEmpresa();
    }
}
