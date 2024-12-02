/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import Model.Tarefas;

/**
 *
 * @author yurid
 */
public interface IServicosCRUD {
    public void insertServico(Tarefas tarefa) throws Exception;
    public void removerServico(String nome) throws Exception;
 public void updateServico(Tarefas tarefa, String nomeAntigo) throws Exception;
}