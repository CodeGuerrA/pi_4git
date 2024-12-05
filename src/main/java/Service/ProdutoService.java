/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Model.Produto;
import java.util.Hashtable;

/**
 *
 * @author Guerra
 */
public interface ProdutoService {
    
    void adicionarProduto(Produto produto);
    
    Produto buscarProdutoPeloId(String id);
    
    Hashtable<String, Produto> ListarTodosProdutos();
    
        
}   