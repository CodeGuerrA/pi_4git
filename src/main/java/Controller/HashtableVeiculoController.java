package Controller;

import Model.Cliente;
import Model.Veiculos;
import Service.VeiculoService;
import java.util.Hashtable;

/**
 *
 
@author Guerra*/
public class HashtableVeiculoController implements VeiculoService {

    private final Hashtable<String, Veiculos> veiculos = new Hashtable<>();
    private final Hashtable<String, Cliente> clientes = new Hashtable<>(); // Repositório de clientes

    @Override
    public void adicionarVeiculo(Veiculos veiculo) {
        // Verifica se o veículo com a mesma placa já existe
        if (buscarVeiculosPelaPlaca(veiculo.getPlaca()) != null) {
            System.out.println("Veículo com a placa " + veiculo.getPlaca() + " já existe!");
        } else {
            // Se o veículo não existe, adiciona no repositório
            veiculos.put(veiculo.getPlaca(), veiculo);  //
            System.out.println("Veículo com a placa " + veiculo.getPlaca() + " adicionado com sucesso.");
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

    public void clear() {
        veiculos.clear();  // Corrigido para 'clientes.clear()'
    }

}