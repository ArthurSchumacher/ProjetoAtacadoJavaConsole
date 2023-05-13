package br.com.atacado.teste;

import java.time.LocalDate;
import java.util.List;

import br.com.atacado.dominio.Categoria;
import br.com.atacado.servico.CategoriaServico;

public class CategoriaTeste extends BaseTeste<Categoria>{

    public CategoriaTeste() {
        _service = new CategoriaServico();
    }

    @Override
    public void Executar() {
        int novoId = TestCreate();
        TestReadOne(novoId);
        TestUpdate(novoId);
        TestDelete(novoId);
        //TestRead();
    }

    @Override
    protected int TestCreate() {
        System.out.println("Testando create: [Categoria]");
        Categoria tmpCategoria = new Categoria(0, "Testando create categoria", LocalDate.now());
        Categoria nova = _service.Criar(tmpCategoria);
        System.out.println(nova.toString());
        return nova.getId();
    }

    @Override
    protected void TestRead() {
        System.out.println("Testando read all: [Categoria]");
        List<Categoria> categorias = _service.Ler();
        for (Categoria tupla : categorias) {
            System.out.println(tupla.toString());
        }
    }

    @Override
    protected void TestReadOne(int id) {
        System.out.println("Testando read one: [Categoria]");
        Categoria categoria = _service.Ler(id);
        System.out.println(categoria.toString());
    }

    @Override
    protected void TestUpdate(int id) {
        System.out.println("Testando update: [Categoria]");
        Categoria tmpCategoria = _service.Ler(id);
        tmpCategoria.setDescricao("Testando update");
        Categoria updated = _service.Atualizar(tmpCategoria);
        System.out.println(updated.toString());
    }

    @Override
    protected void TestDelete(int id) {
        System.out.println("Testando delete: [Categoria]");
        Categoria removida = _service.Excluir(id);
        System.out.println(removida.toString());
    }
    
}
