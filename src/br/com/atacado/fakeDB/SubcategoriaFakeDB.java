package br.com.atacado.fakeDB;

import java.time.LocalDate;

import br.com.atacado.dominio.Subcategoria;

public class SubcategoriaFakeDB extends BaseFakeDB<Subcategoria> {

    @Override
    protected void AutoFill() {
        tabela.add(new Subcategoria(1, 1, "", LocalDate.now()));
    }
    
}
