package br.com.atacado.servico;

import java.util.List;

public interface IBaseServico<T> {
    
    T Criar(T obj);

    List<T> Ler();

    T Ler(int id);

    T Atualizar(T obj);

    T Excluir(int id);
}
