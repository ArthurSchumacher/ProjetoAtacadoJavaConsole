package br.com.atacado.repositorio;

import java.util.List;

public interface IBaseRepositorio<T> {

    T Create(T obj);

    T Read(int id);

    List<T> Read();

    T Update(T obj);

    T Delete(int id);

}
