package br.com.rd.exerciciospring.repository;

import br.com.rd.exerciciospring.model.Cupom;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CupomRepository extends JpaRepository<Cupom, Long> {
    List<Cupom> findByIdAndDtVenda(Long id, String vlvenda);
}
