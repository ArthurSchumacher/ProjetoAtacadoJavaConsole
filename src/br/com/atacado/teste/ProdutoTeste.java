package br.com.atacado.teste;

import java.time.LocalDate;
import java.util.List;

import br.com.atacado.dominio.Produto;
import br.com.atacado.servico.ProdutoServico;

public class ProdutoTeste extends BaseTeste<Produto>{

    public ProdutoTeste() {
        _service = new ProdutoServico();
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
        System.out.println("Testando create: [Produto]");
        Produto tmpProduto = new Produto(0, 1, 1, "TesteCriacaoProduto", LocalDate.now());
        Produto nova = _service.Criar(tmpProduto);
        System.out.println(nova.toString());
        return nova.getId();
    }

    @Override
    protected void TestRead() {
        System.out.println("Testando read all: [Produto]");
        List<Produto> produtos = _service.Ler();
        for (Produto tupla : produtos) {
            System.out.println(tupla.toString());
        }
    }

    @Override
    protected void TestReadOne(int id) {
        System.out.println("Testando read one: [Produto]");
        Produto produto = _service.Ler(id);
        System.out.println(produto.toString());
    }

    @Override
    protected void TestUpdate(int id) {
        System.out.println("Testando update: [Produto]");
        Produto tmpProduto = _service.Ler(id);
        tmpProduto.setDescricao("Testando update");
        Produto updated = _service.Atualizar(tmpProduto);
        System.out.println(updated.toString());
    }

    @Override
    protected void TestDelete(int id) {
        System.out.println("Testando delete: [Produto]");
        Produto removida = _service.Excluir(id);
        System.out.println(removida.toString());
    }
    
}
