/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Veiculos; // Considere renomear para Veiculo
import Service.ClienteService;
import Service.ClienteVeiculos;
import java.util.HashMap; // Alterado de Hashtable para HashMap
import java.util.Hashtable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Guerra
 */
// Classe controlador
public class VeiculosController {
    
    private final ClienteVeiculos clienteVeiculos;
    
    public VeiculosController(ClienteVeiculos clienteVeiculos) {
        this.clienteVeiculos = clienteVeiculos;
    }

    public void adicionarVeiculo(String chave, Veiculos veiculo) {
        clienteVeiculos.adicionarVeiculo(chave, veiculo);
    }

    public boolean atualizarVeiculo(String placa, Veiculos veiculoAtualizado, DefaultTableModel model) {
        boolean resultado = clienteVeiculos.atualizarVeiculo(placa, veiculoAtualizado);
        if (resultado) {
            model.addRow(obterDadosTabela(veiculoAtualizado));
        }
        return resultado;
    }
    
    public void carregarTabela(DefaultTableModel model) {
        model.setRowCount(0);
        Hashtable<String, Veiculos> veiculos = clienteVeiculos.listarTodosVeiculos(); 
        
        for (Veiculos veiculo : veiculos.values()) { 
            model.addRow(obterDadosTabela(veiculo));
        }
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