package Controller;

import Model.Cliente;
import Model.Veiculos;
import Service.ClienteService;
import java.util.Hashtable;

import javax.swing.table.DefaultTableModel;

public class ClienteController {

    private final ClienteService clienteService;

    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    public void adicionarCliente(Cliente cliente, DefaultTableModel model) {
        clienteService.adicionarCliente(cliente);
        model.addRow(obterDadosTabela(cliente));
    }

    public void carregarTabela(DefaultTableModel model) {
        model.setRowCount(0);

        Hashtable<String, Cliente> clientes = clienteService.listarTodosClientes();

        for (Cliente cliente : clientes.values()) {
            
            model.addRow(obterDadosTabela(cliente));
        }
    }

    public Cliente buscarClientePorChave(String chave) {
        return clienteService.buscarClientePorChave(chave);
    }

    public void atualizarCliente(String chave, Cliente clienteAtualizado) {
        clienteService.atualizarCliente(chave, clienteAtualizado);
    }

    public boolean removerCliente(String chave) {
        return clienteService.removerCliente(chave);
    }

    public Hashtable<String, Cliente> listarTodosClientes() {
        return clienteService.listarTodosClientes(); 
    }

    public boolean verificarCliente(String chave) {
        return clienteService.verificarCliente(chave);
    }

    public void adicionarVeiculoAoCliente(String chave, Veiculos veiculo) {
        clienteService.adicionarVeiculoAoCliente(chave, veiculo);
    }

    private Object[] obterDadosTabela(Cliente cliente) {
        return new Object[]{
            cliente.getNome(),
            cliente.getCNPJ() != null && !cliente.getCNPJ().isEmpty() ? cliente.getCNPJ() : cliente.getCPF(),
            cliente.getTelefones(),
            cliente.getEndereco(),
            cliente.getEmail(),
            cliente.getContatos(),
            cliente.getIns_Estadual() != null ? cliente.getIns_Estadual() : ""
        };
    }
}
