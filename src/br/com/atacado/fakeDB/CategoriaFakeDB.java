package br.com.atacado.fakeDB;

import java.time.LocalDate;

import br.com.atacado.dominio.Categoria;

public class CategoriaFakeDB extends BaseFakeDB<Categoria> {

    @Override
    protected void AutoFill() {
        tabela.add(new Categoria(0, null, LocalDate.now()));
    }
    
}
