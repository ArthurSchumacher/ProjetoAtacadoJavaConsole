import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import br.com.atacado.dominio.Frota;
import br.com.atacado.dominio.Veiculo;

public class App {
    public static void main(String[] args) throws Exception {
        Frota frota = new Frota(1, "Frota 01", LocalDate.now());
        Veiculo carro1 = new Veiculo(1, "BMW", LocalDate.now(), 1, "ABC-1234");
        Veiculo carro2 = new Veiculo(2, "Porsche", LocalDate.now(), 1, "ABC-4321");
        List<Veiculo> tmpVeiculos = new ArrayList<>();
        tmpVeiculos.add(carro1);
        tmpVeiculos.add(carro2);
        frota.setVeiculos(tmpVeiculos);

        for (Veiculo veiculo : frota.getVeiculos()) {
            System.out.println(veiculo.toString());
        }
    }
}
