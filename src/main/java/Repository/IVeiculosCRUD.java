/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import Model.Propriedade;
import Model.Veiculos;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author yurid
 */
public interface IVeiculosCRUD {
    public void insertVeiculo(Veiculos veiculo, Propriedade propriedade) throws Exception;
    public void removerVeiculo(String placa) throws Exception;
    public void updateVeiculo(Veiculos veiculo, String placa) throws Exception;
    public List<String> buscarModelos() throws SQLException;
    public List<String> buscarMarcas() throws SQLException;
}