package PROJETO_TCC.com.example.Projeto_TCC.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table
public class Tarefa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "Nome", length = 200, nullable = false)
    private String nome;

    @Column(name = "Descrição", length = 200, nullable = false)
    private String descricao;

    @Column(name = "Concluída")
    private boolean concluida;

    @Column(name = "Data_Final")
    private LocalDate dataFinal;


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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(LocalDate dataFinal) {
        this.dataFinal = dataFinal;
    }


    public boolean isConcluida() {
        return concluida;
    }

    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }

    @PrePersist
    @PreUpdate
    public void validate() {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("O nome da tarefa não pode ser vazio.");
        }
        if (descricao == null || descricao.length() > 100) {
            throw new IllegalArgumentException("A descrição não pode exceder 100 caracteres.");
        }
        if (dataFinal != null && dataFinal.isBefore(LocalDate.now())) {
            throw new IllegalArgumentException("A data final não pode ser uma data passada.");
        }
        if (concluida && (dataFinal == null || dataFinal.isAfter(LocalDate.now()))) {
            throw new IllegalArgumentException("A tarefa não pode ser marcada como concluída se a data final for no futuro.");
        }
    }


}
