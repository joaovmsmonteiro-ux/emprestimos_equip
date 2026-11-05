package com.EmprestimoEquip.emprestimo_equip.infraestructure.entitys;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "usuarios")
@Entity
@Data 
public class Usuario {

/*CRIAÇÃO DOS ATRIBUTOS/COLUNAS DA TABELA/CLASSE "usuarios" */


    /**atribui varíavel ID padrão do sistema */
    @Id
    /**Gera valor automático para o ID */
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    /**Criação da coluna "nome" */
    @Column (name = "Nome", length = 100)
    private String nome;

    /**Criação da coluna "email_usuario" */
    @Column (name = "Email_Usuario", length = 100)
    private String email_usuario;

    /*Criação da coluna "nome_gestor" */
    @Column (name = "Nome_Gestor", length = 100)
    private String nome_gestor;

    /*Criação da coluna "email_gestor" */
    @Column (name = "Email_Gestor", length = 100)
    private String email_gestor;
}
