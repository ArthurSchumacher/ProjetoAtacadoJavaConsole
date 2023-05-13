package br.com.atacado.teste;

import br.com.atacado.servico.BaseServico;

public abstract class BaseTeste<TModel> implements IBaseTeste<TModel> {
    
    protected BaseServico<TModel> _service;

    public BaseTeste() {

    }

    protected abstract int TestCreate();
    protected abstract void TestRead();
    protected abstract void TestReadOne(int id);
    protected abstract void TestUpdate(int id);
    protected abstract void TestDelete(int id);
}
