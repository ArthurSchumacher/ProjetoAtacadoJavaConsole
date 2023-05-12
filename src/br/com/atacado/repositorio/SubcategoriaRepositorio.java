package br.com.atacado.repositorio;

import br.com.atacado.dominio.Subcategoria;
import br.com.atacado.fakeDB.SubcategoriaFakeDB;

public class SubcategoriaRepositorio extends BaseRepositorio<Subcategoria> {

    public SubcategoriaRepositorio() {
        super();
        _tabela = new SubcategoriaFakeDB().getTabela();
    }

    @Override
    public Subcategoria Create(Subcategoria obj) {
        int chave = 0;
        if (_tabela.size() == 0) {
            chave++;
        } else {
            int tamanho = _tabela.size();
            chave = _tabela.get(tamanho - 1).getId() + 1;
        }
        obj.setId(chave);
        _tabela.add(obj);
        return obj;
    }

    @Override
    public Subcategoria Read(int chave) {
        Subcategoria res = new Subcategoria();
        for (Subcategoria tupla : _tabela) {
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
    public Subcategoria Update(Subcategoria obj) {
        Subcategoria alteracao = this.Read(obj.getId());
        if (alteracao != null) {
            alteracao.setDescricao(obj.getDescricao());
        }
        return alteracao;
    }
}