package br.com.rd.exerciciospring.service;


import br.com.rd.exerciciospring.model.Cupom;
import br.com.rd.exerciciospring.repository.CupomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("CupomService")
public class CupomService {
    @Autowired
    private CupomRepository cupomRepository;

    public List<Cupom> buscarIdAndDtVenda(Long id, String vlvenda) {
        return cupomRepository.findByIdAndDtVenda(id, vlvenda);
    }


}
