/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

/**
 *
 * @author Guerra
 */
import Model.Tarefas;
import java.util.Hashtable;
import java.util.List;

public interface ServicoRepository {

    void adicionarServico(Tarefas servico);

    Tarefas buscarServicoNome(String nome);

    Hashtable<String,Tarefas> listarTodosServico();;

    boolean removerServicoNome(String nome);
}
