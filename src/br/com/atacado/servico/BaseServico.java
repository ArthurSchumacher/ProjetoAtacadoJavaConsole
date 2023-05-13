package br.com.atacado.servico;

import br.com.atacado.repositorio.BaseRepositorio;

public abstract class BaseServico<TModel> implements IBaseServico<TModel> {

    protected BaseRepositorio<TModel> _repository;

    public BaseServico() {
    }
}
