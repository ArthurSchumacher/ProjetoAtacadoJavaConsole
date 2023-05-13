package br.com.atacado.servico;

import java.util.List;

import br.com.atacado.dominio.Categoria;
import br.com.atacado.repositorio.CategoriaRepositorio;

public class CategoriaServico extends BaseServico<Categoria> {

    public CategoriaServico() {
        _repository = new CategoriaRepositorio();
    }

    @Override
    public Categoria Criar(Categoria obj) {
        return _repository.Create(obj);
    }

    @Override
    public List<Categoria> Ler() {
        return _repository.Read();
    }

    @Override
    public Categoria Ler(int id) {
        return _repository.Read(id);
    }

    @Override
    public Categoria Atualizar(Categoria obj) {
        return _repository.Update(obj);
    }

    @Override
    public Categoria Excluir(int id) {
        return _repository.Delete(id);
    }
    
}
