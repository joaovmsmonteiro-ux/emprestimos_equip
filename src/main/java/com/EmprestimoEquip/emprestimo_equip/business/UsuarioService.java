package com.business;

import com.infraestructure.entitys.Usuario;
import com.infraestructure.repository.UsuarioRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service 
public class UsuarioService {

    private final UsuarioRepository repository;

    public UsuarioService(UsuarioRepository repository) {
        this.repository = repository;
    }

    public void salveUsuario(Usuario usuario) {
        repository.saveAndFlush(usuario);
    }

    public Usuario buscarUsuarioPorId(Integer id) {
        return repository.findById(id).orElseThrow(
            () -> new RuntimeException("ID não encontrado")
        );
    }

    public Usuario buscarUsuarioPorNome(String nome) {
        return repository.findByNome(nome).orElseThrow(
            () -> new RuntimeException("Nome não encontrado")
        );
    }

    public Usuario buscarUsuarioPorEmail(String email) {
        return repository.findByEmail(email).orElseThrow(
            () -> new RuntimeException("Email não encontrado")
        );
    }

    public void deletarUsuarioPorId(Integer id) {
        repository.deleteById(id);
    }

    @Transactional 
    public void deletarUsuarioPorNome(String nome) {
        repository.deleteByNome(nome);
    }
    @Transactional 
    public void deletarUsuarioPorEmail(String email) {
        repository.deleteByEmail(email);
    }
    /**ESTUDAR AMANHÃ */
    public void atualizarUsuarioPorId(Integer id, Usuario usuario) {
        Usuario usuarioEntity = repository.findById(id).orElseThrow(
            () -> new RuntimeException("ID não encontrado")
        );

        if (usuario.getNome() != null) {
            usuarioEntity.setNome(usuario.getNome());
        }

        if (usuario.getEmail_usuario() != null) {
            usuarioEntity.setEmail_usuario(usuario.getEmail_usuario());
        }

        repository.saveAndFlush(usuarioEntity);
    }
}
