package br.com.atacado.repositorio;

import java.util.List;

import br.com.atacado.fakeDB.BaseFakeDB;

public abstract class BaseRepositorio<T> implements IBaseRepositorio<T>{

    protected List<T> _tabela;

    @Override
    public List<T> Read() {
        return _tabela;
    }

    @Override
    public T Delete(int id) {
        T og = Read(id);
        if (og != null) {
            _tabela.remove(og);
        }

        return og;
    }
   
}
