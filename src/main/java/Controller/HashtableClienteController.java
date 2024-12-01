package Controller;

import Model.Cliente;
import java.util.Hashtable;
import Service.ClienteService;

/**
 * Repositório de clientes usando Hashtable para consulta e listagem.
 */
public class HashtableClienteController implements ClienteService {

    private final Hashtable<String, Cliente> clientes = new Hashtable<>();

    // Busca um cliente pela chave (CPF ou CNPJ)
    @Override
    public Cliente buscarClientePorChave(String chave) {
        return clientes.get(chave);
    }

    // Adiciona um novo cliente ao repositório
    public void adicionarCliente(Cliente cliente) {
        String chave = obterChave(cliente);
        if (chave != null && !clientes.containsKey(chave)) {
            clientes.put(chave, cliente); // Adiciona o cliente usando a chave
        } else {
            System.out.println("Erro: Cliente já existe ou chave inválida.");
        }
    }

    // Lista todos os clientes cadastrados
    @Override
    public Hashtable<String, Cliente> listarTodosClientes() {
        return clientes;
    }

    // Verifica se um cliente existe com base na chave
    @Override
    public boolean verificarCliente(String chave) {
        return clientes.containsKey(chave);
    }

    // Limpa todos os clientes do repositório
    public void clear() {
        clientes.clear();  // Corrigido para 'clientes.clear()'
    }

    // Método utilitário para obter a chave (CPF ou CNPJ) de um cliente
    private String obterChave(Cliente cliente) {
        if (cliente.getCPF() != null && !cliente.getCPF().isEmpty()) {
            return cliente.getCPF();
        } else if (cliente.getCNPJ() != null && !cliente.getCNPJ().isEmpty()) {
            return cliente.getCNPJ();
        }
        return null;
    }
}
