package Controller;

import Model.Cliente;
import Model.Veiculos;
import Persistence.ClientesDAO;
import Service.ClienteService;
import java.util.Hashtable;
import javax.swing.JOptionPane;

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
        // Limpa a tabela antes de adicionar os dados
        model.setRowCount(0);

        try {
            // Chama o método de `ClientesDAO` para carregar os dados do banco de dados
            ClientesDAO clienteDao = new ClientesDAO();
            clienteDao.selectClientes(model);  // Atualiza o modelo da tabela
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar os dados: " + e.getMessage());
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
