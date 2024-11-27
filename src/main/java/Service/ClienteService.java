/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

/**
 *
 * @author Guerra
 */

import Model.Cliente;
import Model.Veiculos;
import Repository.ClienteRepository;
import java.util.Hashtable;

import java.util.List;

public class ClienteService {
    private final ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }
   

    public void adicionarCliente(Cliente cliente) {
        clienteRepository.adicionarCliente(cliente);
    }

    public Cliente buscarClientePorChave(String chave) {
        return clienteRepository.buscarClientePorChave(chave);
    }

    public boolean atualizarCliente(String chave, Cliente clienteAtualizado) {
        return clienteRepository.atualizarCliente(chave, clienteAtualizado);
    }

    public boolean removerCliente(String chave) {
        return clienteRepository.removerCliente(chave);
    }

    public Hashtable listarTodosClientes() {
        return clienteRepository.listarTodosClientes();
    }
    public boolean verificarCliente(String chave){
        return clienteRepository.verificarCliente(chave);
    }
    
    public void adicionarVeiculoAoCliente(String chave, Veiculos veiculo){
        clienteRepository.adicionarVeiculoAoCliente(chave, veiculo);
    }
}
