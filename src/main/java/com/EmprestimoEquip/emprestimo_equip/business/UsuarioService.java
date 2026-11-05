package com.EmprestimoEquip.emprestimo_equip.business;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.EmprestimoEquip.emprestimo_equip.infraestructure.entitys.Usuario;
import com.EmprestimoEquip.emprestimo_equip.infraestructure.repository.UsuarioRepository;

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

    public Usuario buscarUsuarioPorEmail(String email_usuario) {
        return repository.findByEmail(email_usuario).orElseThrow(
            () -> new RuntimeException("Email não encontrado")
        );
    }

    public Usuario buscarUsuarioPorNomeGestor(String nome_gestor) {
        return repository.findByNome(nome_gestor).orElseThrow(
            () -> new RuntimeException("Nome não encontrado")
        );
    }

    public Usuario buscarUsuarioPorEmailGestor(String email_gestor) {
        return repository.findByEmail(email_gestor).orElseThrow(
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
    public void deletarUsuarioPorEmail(String email_usuario) {
        repository.deleteByEmail(email_usuario);
    }
    @Transactional 
    public void deletarUsuarioPorNomeGestor(String nome_gestor) {
        repository.deleteByNome_Gestor(nome_gestor);
    }
    @Transactional 
    public void deletarUsuarioPorEmailGestor(String email_gestor) {
        repository.deleteByEmail_Gestor(email_gestor);
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

        if (usuario.getNome_gestor() != null) {
            usuarioEntity.setNome_gestor(usuario.getNome_gestor());
        }

        if (usuario.getEmail_gestor() != null) {
            usuarioEntity.setEmail_gestor(usuario.getEmail_gestor());
        }

        repository.saveAndFlush(usuarioEntity);
    }
}
