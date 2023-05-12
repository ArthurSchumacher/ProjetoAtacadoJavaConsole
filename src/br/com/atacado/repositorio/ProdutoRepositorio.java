package br.com.atacado.repositorio;

import br.com.atacado.dominio.Produto;
import br.com.atacado.fakeDB.ProdutoFakeDB;

public class ProdutoRepositorio extends BaseRepositorio<Produto> {

    public ProdutoRepositorio() {
        super();
        _tabela = new ProdutoFakeDB().getTabela();
    }

    @Override
    public Produto Create(Produto obj) {
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
    public Produto Read(int chave) {
        Produto res = new Produto();
        for (Produto tupla : _tabela) {
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
    public Produto Update(Produto obj) {
        Produto alteracao = this.Read(obj.getId());
        if (alteracao != null) {
            alteracao.setDescricao(obj.getDescricao());
        }
        return alteracao;
    }
}