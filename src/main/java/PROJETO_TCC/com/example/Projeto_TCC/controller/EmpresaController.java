package PROJETO_TCC.com.example.Projeto_TCC.controller;

import PROJETO_TCC.com.example.Projeto_TCC.entity.Empresa;
import PROJETO_TCC.com.example.Projeto_TCC.entity.Usuario;
import PROJETO_TCC.com.example.Projeto_TCC.service.EmpresaService;
import PROJETO_TCC.com.example.Projeto_TCC.service.UsuarioService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/empresa")
public class EmpresaController {
    private EmpresaService empresaService;

    public EmpresaController(EmpresaService empresaService) {
        this.empresaService = empresaService;
    }

    @PostMapping
    List<Empresa> criarEmpresa(@RequestBody Empresa empresa) {
        return empresaService.criarEmpresa(empresa);
    }

    @GetMapping
    List<Empresa> listarEmpresa() {
        return empresaService.listarEmpresa();
    }

    @PutMapping
    List<Empresa> editarEmpresa(@RequestBody Empresa empresa) {
        return empresaService.editarEmpresa(empresa);
    }

    @DeleteMapping("{id}")
    List<Empresa> excluirEmpresa(@PathVariable("id") Long id) {
        return empresaService.excluirEmpresa(id);
    }
}
