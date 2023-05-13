package br.com.atacado.servico;

import java.util.List;

import br.com.atacado.dominio.Produto;
import br.com.atacado.repositorio.ProdutoRepositorio;

public class ProdutoServico extends BaseServico<Produto> { 

    public ProdutoServico() {
        _repository = new ProdutoRepositorio();
    }

    @Override
    public Produto Criar(Produto obj) {
        return _repository.Create(obj);
    }

    @Override
    public List<Produto> Ler() {
        return _repository.Read();
    }

    @Override
    public Produto Ler(int id) {
        return _repository.Read(id);
    }

    @Override
    public Produto Atualizar(Produto obj) {
        return _repository.Update(obj);
    }

    @Override
    public Produto Excluir(int id) {
        return _repository.Delete(id);
    }
    
}
