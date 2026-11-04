package com.infraestructure.repository;
import com.infraestructure.entitys.Usuario;

import jakarta.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;

import java.util.Optional;

                                                 /*Tabela "usuarios" */
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
                                                                  /**Tipo do ID */
    Optional<Usuario> findById(Integer id);
    Optional<Usuario> findByNome(String nome);
    Optional<Usuario> findByEmail(String email);

    /*Não pode deletar esse e-mail se ocorrer algum erro*/
    @Transactional 
    @Modifying 
    void deleteById(Integer id);

    @Transactional 
    @Modifying 
    void deleteByNome(String nome);

    @Transactional 
    @Modifying
    void deleteByEmail(String email);
}