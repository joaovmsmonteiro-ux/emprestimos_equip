package com.EmprestimoEquip.emprestimo_equip.infraestructure.repository;
import jakarta.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;

import com.EmprestimoEquip.emprestimo_equip.infraestructure.entitys.Usuario;

import java.util.Optional;

                                                 /*Tabela "usuarios" */
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
                                                                  /**Tipo do ID */

    /* Dados usuário */
    Optional<Usuario> findById(Integer id);
    Optional<Usuario> findByNome(String nome);
    Optional<Usuario> findByEmail(String email_usuario);
    /* Dados gestor */
    Optional<Usuario> findByNome_Gestor(String nome_gestor);
    Optional<Usuario> findByEmail_Gestor(String email_gestor);


    /*Não pode deletar esse e-mail se ocorrer algum erro*/
    
    /* Dados usuário */
    @Transactional 
    @Modifying 
    void deleteById(Integer id);

    @Transactional 
    @Modifying 
    void deleteByNome(String nome);

    @Transactional 
    @Modifying
    void deleteByEmail(String email_usuario);

    /* Dados gestor */
    @Transactional 
    @Modifying 
    void deleteByNome_Gestor(String nome_gestor);

    @Transactional 
    @Modifying
    void deleteByEmail_Gestor(String email_gestor);
}