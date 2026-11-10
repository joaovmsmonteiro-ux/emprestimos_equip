package com.EmprestimoEquip.emprestimo_equip.infraestructure.repository;

import com.EmprestimoEquip.emprestimo_equip.infraestructure.entitys.Equipamento;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import java.util.Optional;
import java.time.LocalDateTime;

public interface EquipamentoRepository extends JpaRepository<Equipamento, Integer> {

    Optional<Equipamento> findById(Integer id);
    Optional<Equipamento> findByNomeEquipamento(String nomeEquipamento);
    Optional<Equipamento> findByCadastro(LocalDateTime cadastro);
    Optional<Equipamento> findByDisponibilidade(boolean disponibilidade);


    @Transactional 
    @Modifying 
    void deleteById(Integer id);

    @Transactional 
    @Modifying 
    void deleteByNomeEquipamento(String nomeEquipamento);

    @Transactional 
    @Modifying
    void deleteByCadastro(LocalDateTime cadastro);

    @Transactional 
    @Modifying
    void deleteByDisponibilidade(boolean disponibilidade);
}