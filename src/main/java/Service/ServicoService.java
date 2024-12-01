/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Model.Tarefas;
import java.util.Hashtable;
import java.util.List;

public interface ServicoService {

    void adicionarServico(Tarefas servico);

    Tarefas buscarServicoNome(String nome);

    Hashtable<String,Tarefas> listarTodosServico();;


}
