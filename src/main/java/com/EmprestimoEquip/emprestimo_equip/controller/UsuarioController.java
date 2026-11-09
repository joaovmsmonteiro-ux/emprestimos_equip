package com.EmprestimoEquip.emprestimo_equip.controller;

import com.EmprestimoEquip.emprestimo_equip.business.UsuarioService;
import com.EmprestimoEquip.emprestimo_equip.infraestructure.entitys.Usuario;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody; // Acesso ao JSON do corpo da requisição
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestParam;

@RestController 
@RequestMapping("/usuarios")
@RequiredArgsConstructor 
public class UsuarioController {

    private final UsuarioService usuarioService;

    // Salva no banco de dados
    @PostMapping 
    public ResponseEntity<Void> salvarUsuario(@RequestBody Usuario usuario) {
        usuarioService.salveUsuario(usuario);
        return ResponseEntity.ok().build();
    }

    @GetMapping 
    public ResponseEntity<Usuario> buscarUsuarioPorEmail(@RequestParam String email) {
        return ResponseEntity.ok(usuarioService.buscarUsuarioPorEmail(email));
    }

    @DeleteMapping 
    public ResponseEntity<Void> deletarUsuarioPorEmail(@RequestParam String email) {
        usuarioService.deletarUsuarioPorEmail(email);
        return ResponseEntity.ok().build();
    }

    @PutMapping 
    public ResponseEntity<Void> atualizarUsuarioPorId(@RequestParam Integer id, @RequestBody Usuario usuario) {
        usuarioService.atualizarUsuarioPorId(id, usuario);
        return ResponseEntity.ok().build();
    }
}