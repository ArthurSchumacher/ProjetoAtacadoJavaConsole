package br.com.atacado.fakeDB;

import java.util.ArrayList;
import java.util.List;

public abstract class BaseFakeDB<T> {
    protected List<T> tabela;

    protected abstract void AutoFill();

    public List<T> getTabela() {
        if (tabela == null)
        {
            tabela = new ArrayList<T>();
            AutoFill();
        }

        return tabela;
    }
}
