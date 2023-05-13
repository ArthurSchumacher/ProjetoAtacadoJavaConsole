package br.com.atacado.servico;

import java.util.List;

import br.com.atacado.dominio.Subcategoria;
import br.com.atacado.repositorio.SubcategoriaRepositorio;

public class SubcategoriaServico extends BaseServico<Subcategoria> {

    public SubcategoriaServico() {
        _repository = new SubcategoriaRepositorio();
    }

    @Override
    public Subcategoria Criar(Subcategoria obj) {
        return _repository.Create(obj);
    }

    @Override
    public List<Subcategoria> Ler() {
        return _repository.Read();
    }

    @Override
    public Subcategoria Ler(int id) {
        return _repository.Read(id);
    }

    @Override
    public Subcategoria Atualizar(Subcategoria obj) {
        return _repository.Update(obj);
    }

    @Override
    public Subcategoria Excluir(int id) {
        return _repository.Delete(id);
    }
    
}
