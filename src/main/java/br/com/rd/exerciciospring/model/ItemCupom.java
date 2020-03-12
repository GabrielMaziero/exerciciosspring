package br.com.rd.exerciciospring.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_cupom_item")
public class ItemCupom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idItemCupom;

    @ManyToOne
    @JoinColumn(name = "id_cupom")
    private Cupom cupom;

    @ManyToOne
    @JoinColumn(name = "id_produto")
    private Produto produto;

    @Column(name = "qt_produto", nullable = false)
    private Long qtProduto;

    @Column(name = "vl_produto", nullable = false)
    private BigDecimal vlProduto;
}
