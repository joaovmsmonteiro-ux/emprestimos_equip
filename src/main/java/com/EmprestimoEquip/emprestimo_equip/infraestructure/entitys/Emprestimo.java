package com.EmprestimoEquip.emprestimo_equip.infraestructure.entitys;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "emprestimos")
public class Emprestimo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Relacionamento com o Equipamento que está sendo emprestado
    @ManyToOne 
    @JoinColumn (name = "equipamento_id", nullable = false)
    private Equipamento equipamento;

    // Dados do formulário que mapeamos do seu HTML
    private String nomeUsuario;
    private String emailUsuario;
    private String nomeGestor;
    private String emailGestor;

    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucao;

    private String status; // "Pendente", "Aprovado", "Devolvido", etc. 
}