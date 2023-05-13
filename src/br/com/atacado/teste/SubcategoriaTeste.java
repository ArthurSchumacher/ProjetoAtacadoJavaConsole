package br.com.atacado.teste;

import java.time.LocalDate;
import java.util.List;

import br.com.atacado.dominio.Subcategoria;
import br.com.atacado.servico.SubcategoriaServico;

public class SubcategoriaTeste extends BaseTeste<Subcategoria>{

    public SubcategoriaTeste() {
        _service = new SubcategoriaServico();
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
        System.out.println("Testando create: [Subcategoria]");
        Subcategoria tmpSubcategoria = new Subcategoria(0, "Testando criar subcategoria", LocalDate.now(), 1);
        Subcategoria nova = _service.Criar(tmpSubcategoria);
        System.out.println(nova.toString());
        return nova.getId();
    }

    @Override
    protected void TestRead() {
        System.out.println("Testando read all: [Subcategoria]");
        List<Subcategoria> subcategorias = _service.Ler();
        for (Subcategoria tupla : subcategorias) {
            System.out.println(tupla.toString());
        }
    }

    @Override
    protected void TestReadOne(int id) {
        System.out.println("Testando read one: [Subcategoria]");
        Subcategoria subcategoria = _service.Ler(id);
        System.out.println(subcategoria.toString());
    }

    @Override
    protected void TestUpdate(int id) {
        System.out.println("Testando update: [Subcategoria]");
        Subcategoria tmpSubcategoria = _service.Ler(id);
        tmpSubcategoria.setDescricao("Testando update");
        Subcategoria updated = _service.Atualizar(tmpSubcategoria);
        System.out.println(updated.toString());
    }

    @Override
    protected void TestDelete(int id) {
        System.out.println("Testando delete: [Subcategoria]");
        Subcategoria removida = _service.Excluir(id);
        System.out.println(removida.toString());
    }
    
}
