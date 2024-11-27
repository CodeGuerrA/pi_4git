package Controller;

import Model.Veiculos;
import Service.ClienteVeiculos;
import java.text.SimpleDateFormat;
import java.util.Hashtable;
import javax.swing.table.DefaultTableModel;

public class VeiculosController {

    private final ClienteVeiculos clienteVeiculos;

    public VeiculosController(ClienteVeiculos clienteVeiculos) {
        this.clienteVeiculos = clienteVeiculos;
    }

    public void adicionarVeiculo(Veiculos veiculo, DefaultTableModel model) {
        clienteVeiculos.adicionarVeiculo(veiculo);
        model.addRow(obterDadosTabela(veiculo));
    }

    public void carregarTabela(DefaultTableModel model) {
        model.setRowCount(0);
        Hashtable<String, Veiculos> veiculos = clienteVeiculos.listarTodosVeiculos();
        for (Veiculos veiculo : veiculos.values()) {
            model.addRow(obterDadosTabela(veiculo));
        }
    }

    public Veiculos buscarVeiculosporPlaca(String placa) {
        return clienteVeiculos.buscarVeiculosporPlaca(placa);
    }

    public boolean atualizarVeiculo(String placa, Veiculos veiculoAtualizado) {
        return clienteVeiculos.atualizarVeiculo(placa, veiculoAtualizado);
    }

    public boolean removerVeiculo(String placa) {
        return clienteVeiculos.removerVeiculo(placa);
    }

    public Hashtable<String, Veiculos> listarTodosVeiculos() {
        return clienteVeiculos.listarTodosVeiculos();
    }

    public void exibirTodosVeiculos() {
        Hashtable<String, Veiculos> veiculos = listarTodosVeiculos();
        if (veiculos.isEmpty()) {
            System.out.println("Nenhum veículo cadastrado.");
        } else {
            veiculos.forEach((placa, veiculo) -> System.out.println(veiculo));
        }
    }

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
}
