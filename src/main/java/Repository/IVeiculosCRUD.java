/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import Model.Veiculos;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author yurid
 */
public interface IVeiculosCRUD {
    public void insertVeiculo(Veiculos veiculo, JComboBox<String> comboBoxMarca, JComboBox<String> comboBoxModelo) throws Exception;
    public void removerVeiculo(String placa) throws Exception;
    public void updateVeiculo(Veiculos veiculo, String placa) throws Exception;
    public void selectVeiculo(DefaultTableModel model) throws Exception;
}
