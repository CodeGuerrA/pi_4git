package Implementations;

import Model.Cliente;
import Model.Veiculos;
import Repository.VeiculoRepository;
import java.util.Hashtable;

/**
 *
 * @author Guerra
 */
public class HashtableVeiculoRepository implements VeiculoRepository {

    private final Hashtable<String, Veiculos> veiculos = new Hashtable<>();
    private final Hashtable<String, Cliente> clientes = new Hashtable<>(); // Repositório de clientes

    
    @Override
    public void adicionarVeiculo(String chave, Veiculos veiculo) {
        // Verifica se o cliente existe
        Cliente cliente = clientes.get(chave);
        if (cliente != null) {
            cliente.adicionarVeiculo(veiculo); 
            veiculos.put(veiculo.getPlaca(), veiculo); 
        } else {
            System.out.println("Cliente não encontrado!");
        }
    }

    @Override
    public boolean atualizarVeiculo(String placa, Veiculos veiculoAtualizado) {
        if (veiculos.containsKey(placa)) {
            veiculos.put(placa, veiculoAtualizado);
            return true;
        }
        return false;
    }

    @Override
    public boolean removerVeiculo(String placa) {
        if (veiculos.containsKey(placa)) {
            veiculos.remove(placa);
            return true;
        }
        return false;
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

    // Método para adicionar um cliente ao repositório
    public void adicionarCliente(Cliente cliente) {
        clientes.put(cliente.getID(), cliente);
    }
}
