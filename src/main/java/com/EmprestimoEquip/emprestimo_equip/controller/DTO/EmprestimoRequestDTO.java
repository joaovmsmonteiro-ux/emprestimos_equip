package com.EmprestimoEquip.emprestimo_equip.controller.DTO;

import java.time.LocalDateTime;

public record EmprestimoRequestDTO(
    String select,
    String nomeUsuario,
    String emailUsuario,
    String nomeGestor,  
    String emailGestor,    
    LocalDateTime dataEmprestimo,
    LocalDateTime dataDevolucao    
) {}