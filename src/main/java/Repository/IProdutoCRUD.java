/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import Model.Produto;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Melo
 */
public interface IProdutoCRUD {
    public void insertProduto(Produto produto) throws Exception;
    public void updateProduto(Produto produto) throws Exception;
    public void deleteProduto(String id) throws Exception;
    public void selectProduto(String nomer) throws Exception;
}
