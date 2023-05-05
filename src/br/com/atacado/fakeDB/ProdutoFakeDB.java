package br.com.atacado.fakeDB;

import java.math.BigDecimal;
import java.time.LocalDate;

import br.com.atacado.dominio.Produto;

public class ProdutoFakeDB extends BaseFakeDB<Produto>{

    @Override
    protected void AutoFill() {
        tabela.add(new Produto(1, 1, "", new BigDecimal(50), LocalDate.now()));
    }
    
}
