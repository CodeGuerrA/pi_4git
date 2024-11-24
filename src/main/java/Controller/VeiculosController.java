package Controller;

import Model.Veiculos;
import Service.ClienteVeiculos;
import java.util.Hashtable;
import javax.swing.table.DefaultTableModel;

/**
 * Classe controlador de Veículos
 */
public class VeiculosController {
    
    private final ClienteVeiculos clienteVeiculos;

    public VeiculosController(ClienteVeiculos clienteVeiculos) {
        this.clienteVeiculos = clienteVeiculos;
    }

    // Adiciona um veículo no sistema
    public void adicionarVeiculo(String placa, Veiculos veiculo) {
        clienteVeiculos.adicionarVeiculo(placa, veiculo);
    }

    // Atualiza um veículo e altera os dados diretamente na tabela nao fz ainda isso no front 
    public boolean atualizarVeiculo(String placa, Veiculos veiculoAtualizado, DefaultTableModel model) {
        boolean resultado = clienteVeiculos.atualizarVeiculo(placa, veiculoAtualizado);
        if (resultado) {
            int rowIndex = localizarLinhaPorPlaca(model, placa);
            if (rowIndex != -1) {
                atualizarLinhaTabela(model, rowIndex, veiculoAtualizado);
            } else {
                model.addRow(obterDadosTabela(veiculoAtualizado));
            }
        }
        return resultado;
    }

    // Carrega todos os veículos do sistema na tabela
    public void carregarTabela(DefaultTableModel model) {
        model.setRowCount(0); // Limpa os dados da tabela
        Hashtable<String, Veiculos> veiculos = clienteVeiculos.listarTodosVeiculos();
        for (Veiculos veiculo : veiculos.values()) {
            model.addRow(obterDadosTabela(veiculo));
        }
    }

    // Remove um veículo pelo número da placa
    public boolean removerVeiculo(String placa, DefaultTableModel model) {
        boolean resultado = clienteVeiculos.removerVeiculo(placa);
        if (resultado) {
            int rowIndex = localizarLinhaPorPlaca(model, placa);
            if (rowIndex != -1) {
                model.removeRow(rowIndex);
            }
        }
        return resultado;
    }

    // Lista todos os veículos cadastrados
    public Hashtable<String, Veiculos> listarTodosVeiculos() {
        return clienteVeiculos.listarTodosVeiculos();
    }

    // Exibe no console todos os veículos cadastrados
    public void exibirTodosVeiculos() {
        Hashtable<String, Veiculos> veiculos = listarTodosVeiculos();
        if (veiculos.isEmpty()) {
            System.out.println("Nenhum veículo cadastrado.");
        } else {
            veiculos.forEach((placa, veiculo) -> System.out.println(veiculo));
        }
    }

    // Obtém os dados de um veículo em formato de array para exibição na tabela
    private Object[] obterDadosTabela(Veiculos veiculo) {
        return new Object[]{
            veiculo.getModelo(),
            veiculo.getMarca(),
            veiculo.getPlaca(),
            veiculo.getChassi(),
            veiculo.getPatrimonio(),
            veiculo.getKilometragem(),
            veiculo.getDataEntrada(),
            veiculo.getAcessorios()
        };
    }

    // Localiza a linha na tabela com base na placa
    private int localizarLinhaPorPlaca(DefaultTableModel model, String placa) {
        for (int i = 0; i < model.getRowCount(); i++) {
            String placaTabela = (String) model.getValueAt(i, 2); 
            if (placaTabela.equals(placa)) {
                return i;
            }
        }
        return -1;
    }

    
    private void atualizarLinhaTabela(DefaultTableModel model, int rowIndex, Veiculos veiculo) {
        Object[] dados = obterDadosTabela(veiculo);
        for (int i = 0; i < dados.length; i++) {
            model.setValueAt(dados[i], rowIndex, i);
        }
    }
}
