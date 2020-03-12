package br.com.rd.exerciciospring.controller;


import br.com.rd.exerciciospring.model.Cupom;
import br.com.rd.exerciciospring.repository.CupomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CupomController {

    @Autowired
    private CupomRepository cupomRepository;

    @ResponseStatus(HttpStatus.CREATED)


    @GetMapping("/cupom/id/dtvenda")
    public List<Cupom> buscarPorIdAndDtVenda(@PathVariable("idcliente") Long id, @PathVariable("dt_venda") String dtvenda) {
        return cupomRepository.findByIdAndDtVenda(id, dtvenda);
    }
}
