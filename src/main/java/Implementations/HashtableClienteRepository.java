/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Implementations;

/**
 *
 * @author Guerra
 */
import Model.Veiculos;
import Model.Cliente;
import Repository.ClienteRepository;
import java.util.Hashtable;

public class HashtableClienteRepository implements ClienteRepository {

    private final Hashtable<String, Veiculos> veiculos = new Hashtable<>();
    private final Hashtable<String, Cliente> clientes = new Hashtable<>();

    @Override
    public void adicionarCliente(Cliente cliente) {
        String chave = obterChave(cliente);
        if (chave != null && !clientes.containsKey(chave)) {
            clientes.put(chave, cliente);
        }
    }

    @Override
    public Cliente buscarClientePorChave(String chave) {
        return clientes.get(chave);
    }

    @Override
    public boolean atualizarCliente(String chave, Cliente clienteAtualizado) {
        if (clientes.containsKey(chave)) {
            clientes.put(chave, clienteAtualizado);
            return true;
        }
        return false;
    }

    @Override
    public boolean removerCliente(String chave) {
        if (clientes.containsKey(chave)) {
            clientes.remove(chave);
            return true;
        }
        return false;
    }

    @Override
    public Hashtable<String, Cliente> listarTodosClientes() {
        return clientes;
    }

    private String obterChave(Cliente cliente) {
        if (cliente.getCPF() != null && !cliente.getCPF().isEmpty()) {
            return cliente.getCPF();
        } else if (cliente.getCNPJ() != null && !cliente.getCNPJ().isEmpty()) {
            return cliente.getCNPJ();
        }
        return null;
    }

    @Override
    public boolean verificarCliente(String chave) {
        return clientes.containsKey(chave);
    }

    @Override
    public void adicionarVeiculoAoCliente(String chave, Veiculos veiculo) {
        if (verificarCliente(chave)) {
            Cliente cliente = clientes.get(chave); // Obtém o cliente associado à chave
            if (cliente != null) {
                cliente.adicionarVeiculo(veiculo); // Associe o veículo ao cliente
                veiculos.put(veiculo.getPlaca(), veiculo); // Adiciona o veículo no repositório de veículos
            } else {
                throw new IllegalArgumentException("Cliente não encontrado!");
            }
        } else {
            throw new IllegalArgumentException("Chave de cliente inválida!");
        }
    }

}
