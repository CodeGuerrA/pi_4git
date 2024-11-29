/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import Model.Veiculos;
import java.util.Hashtable;

/**
 *
 * @author Guerra
 */
public interface VeiculoRepository {

    void adicionarVeiculo(String placa, Veiculos veiculo);
    
    Veiculos buscarVeiculosPelaPlaca(String placa);

    boolean atualizarVeiculo(String placa, Veiculos veiculoAtualizado);

    boolean removerVeiculo(String placa);

    Hashtable<String, Veiculos> listarTodosVeiculos();
    
    

}
