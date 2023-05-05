import br.com.atacado.dominio.Produto;
import br.com.atacado.fakeDB.ProdutoFakeDB;

public class App {
    public static void main(String[] args) throws Exception {
        ProdutoFakeDB db = new ProdutoFakeDB();
        for (Produto item : db.getTabela()) {
            System.out.println(item.toString());
        }
    }
}
