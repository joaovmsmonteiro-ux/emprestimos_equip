package com.EmprestimoEquip.emprestimo_equip.business;

import com.EmprestimoEquip.emprestimo_equip.controller.DTO.EmprestimoRequestDTO;
import com.EmprestimoEquip.emprestimo_equip.infraestructure.entitys.Emprestimo;
import com.EmprestimoEquip.emprestimo_equip.infraestructure.repository.EmprestimoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmprestimoService {

    @Autowired 
    private EmprestimoRepository emprestimoRepository;

    public void registrarEmprestimo(EmprestimoRequestDTO dto) {
        // Lógica para registrar o empréstimo
        Emprestimo emprestimo = new Emprestimo();

        emprestimo.setNomeUsuario(dto.nomeUsuario());
        emprestimo.setEmailUsuario(dto.emailUsuario());
        emprestimo.setNomeGestor(dto.nomeGestor());
        emprestimo.setEmailGestor(dto.emailGestor());
        emprestimo.setDataEmprestimo(dto.dataEmprestimo());
        emprestimo.setDataDevolucao(dto.dataDevolucao());

        emprestimo.setStatus("ATIVO");

        emprestimoRepository.save(emprestimo);
    }
}
