package com.EmprestimoEquip.emprestimo_equip.infraestructure.repository;

import com.EmprestimoEquip.emprestimo_equip.infraestructure.entitys.Emprestimo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmprestimoRepository extends JpaRepository<Emprestimo, Long> {
    // Aqui você pode adicionar métodos de consulta personalizados, se necessário
}