package com.EmprestimoEquip.emprestimo_equip.infraestructure.repository;

import com.EmprestimoEquip.emprestimo_equip.infraestructure.entitys.Usuario;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

    Optional<Usuario> findById(Integer id);
    Optional<Usuario> findByNome(String nome);
    Optional<Usuario> findByEmailUsuario(String emailUsuario);

    Optional<Usuario> findByNomeGestor(String nomeGestor);
    Optional<Usuario> findByEmailGestor(String emailGestor);

    @Transactional 
    @Modifying 
    void deleteById(Integer id);

    @Transactional 
    @Modifying 
    void deleteByNome(String nome);

    @Transactional 
    @Modifying
    void deleteByEmailUsuario(String emailUsuario);

    @Transactional 
    @Modifying 
    void deleteByNomeGestor(String nomeGestor);

    @Transactional 
    @Modifying
    void deleteByEmailGestor(String emailGestor);
}