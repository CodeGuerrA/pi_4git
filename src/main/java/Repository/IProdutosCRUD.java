/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import Model.Produto;

/**
 *
 * @author yurid
 */
public interface IProdutosCRUD {
    public void insertProduto(Produto produto) throws Exception;
    public void removerProduto(int id) throws Exception;
    public void updateProduto(Produto produto) throws Exception;
}
