/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

/**
 *
 * @author Guerra
 */
import Model.Cliente;
import Model.Veiculos;
import java.util.Hashtable;


public interface ClienteRepository {

    void adicionarCliente(Cliente cliente);

    Cliente buscarClientePorChave(String chave);

    boolean atualizarCliente(String chave, Cliente clienteAtualizado);

    boolean removerCliente(String chave);

    Hashtable<String, Cliente> listarTodosClientes();
    
    boolean verificarCliente(String chave);
    
    void adicionarVeiculoAoCliente(String chaveCliente, Veiculos veiculo);
}
