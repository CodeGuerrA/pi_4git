/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Model.Veiculos;
import Repository.VeiculoRepository;
import java.util.Hashtable;

/**
 *
 * @author Guerra
 */
public class ClienteVeiculos {

    private final VeiculoRepository veiculoRepository;

    public ClienteVeiculos(VeiculoRepository veiculoRepository) {
        this.veiculoRepository = veiculoRepository;
    }

    public void adicionarVeiculo(String Placa, Veiculos veiculo) {
        veiculoRepository.adicionarVeiculo(Placa, veiculo);
    }

    public boolean atualizarVeiculo(String placa, Veiculos veiculoAtualizado) {

        return veiculoRepository.atualizarVeiculo(placa, veiculoAtualizado);
    }

    public boolean removerVeiculo(String placa) {
        return veiculoRepository.removerVeiculo(placa);

    }

    public Veiculos buscarVeiculosporPlaca(String placa) {
        return veiculoRepository.buscarVeiculosPelaPlaca(placa);
    }

    public Hashtable<String, Veiculos> listarTodosVeiculos() {
        return veiculoRepository.listarTodosVeiculos();
    }
    

}
