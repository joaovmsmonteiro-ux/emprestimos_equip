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

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column (name = "Nome", length = 100)
    private String nome;

    // Alterado para camelCase (o banco continuará salvando como email_usuario se quiser, ou ajuste o name)
    @Column (name = "Email_Usuario", length = 100)
    private String emailUsuario;

    @Column (name = "Nome_Gestor", length = 100)
    private String nomeGestor;

    @Column (name = "Email_Gestor", length = 100)
    private String emailGestor;
}