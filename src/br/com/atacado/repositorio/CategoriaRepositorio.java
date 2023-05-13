package br.com.atacado.repositorio;

import br.com.atacado.dominio.Categoria;
import br.com.atacado.fakeDB.CategoriaFakeDB;

public class CategoriaRepositorio extends BaseRepositorio<Categoria> {
    
    public CategoriaRepositorio() {
        _tabela = new CategoriaFakeDB().getTabela();
    }

    @Override
    public Categoria Create(Categoria obj) {
        int chave = 0;
        if (_tabela.size() == 0) {
            chave++;
        }
        else {
            int tamanho = _tabela.size();
            chave = _tabela.get(tamanho - 1).getId() + 1;
        }

        obj.setId(chave);
        _tabela.add(obj);
        return obj;
    }

    @Override
    public Categoria Read(int chave) {
        Categoria res = new Categoria();
        for (Categoria tupla : _tabela) {
            if (tupla.getId() == chave) {
                res = tupla;
                break;
            } else {
                res = null;
            }
        }
        return res;
    }

    @Override
    public Categoria Update(Categoria obj) {
        Categoria alt = Read(obj.getId());

        if (alt != null) {
            alt.setDescricao(obj.getDescricao());
        }

        return alt;
    }
}

