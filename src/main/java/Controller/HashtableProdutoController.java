/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Produto;
import Service.ProdutoService;
import java.util.Hashtable;

public class HashtableProdutoController implements ProdutoService {

    private final Hashtable<String, Produto> produtos = new Hashtable<>();

    @Override
    public void adicionarProduto(Produto produto) {
        if (produto != null && produto.getId() != null) {
            produtos.put(produto.getId(), produto);
        } else {
            throw new IllegalArgumentException("Produto ou ID inválido");
        }
    }

    @Override
    public Produto buscarProdutoPeloId(String id) {
        if (id != null && produtos.containsKey(id)) {
            return produtos.get(id);
        }
        return null;  // Produto não encontrado
    }

    @Override
    public Hashtable<String, Produto> ListarTodosProdutos() {
        return produtos;
    }

}
