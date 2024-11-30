package Controller;

import Model.Cliente;
import Model.Veiculos;
import Service.VeiculoService;
import java.util.Hashtable;

/**
 *
 * @author Guerra
 */
public class HashtableVeiculoController implements VeiculoService {

    private final Hashtable<String, Veiculos> veiculos = new Hashtable<>();
    private final Hashtable<String, Cliente> clientes = new Hashtable<>(); // Repositório de clientes

    @Override
    public void adicionarVeiculo(String placa, Veiculos veiculo) {
        // Verifica se o veículo com a mesma placa já existe
        if (buscarVeiculosPelaPlaca(placa) != null) {  
            System.out.println("Veículo com a placa " + placa + " já existe!");
        } else {
            // Se o veículo não existe, adiciona no repositório
            veiculos.put(placa, veiculo);  //
            System.out.println("Veículo com a placa " + placa + " adicionado com sucesso.");
        }
    }

    // Método para listar todos os veículos (não clientes)
    @Override
    public Hashtable<String, Veiculos> listarTodosVeiculos() {
        return veiculos;
    }

    // Método para buscar um veículo pela placa
    @Override
    public Veiculos buscarVeiculosPelaPlaca(String placa) {
        return veiculos.get(placa);
    }
}
