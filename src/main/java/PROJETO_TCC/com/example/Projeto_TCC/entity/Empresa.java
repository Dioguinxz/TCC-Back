package PROJETO_TCC.com.example.Projeto_TCC.entity;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table
public class Empresa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "Nome", length = 200, nullable = false)
    private String nome;

    @Column(name = "Email", nullable = false, unique = true)
    private String email;


    @Column(name = "Senha", nullable = false)
    private String senha;

    @OneToMany(mappedBy = "empresa")
    private Set<Usuario> usuarios;

    @OneToMany(mappedBy = "empresa")
    private Set<Tarefa> tarefas;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Set<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(Set<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public Set<Tarefa> getTarefas() {
        return tarefas;
    }

    public void setTarefas(Set<Tarefa> tarefas) {
        this.tarefas = tarefas;
    }

}
