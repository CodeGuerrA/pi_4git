/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Tarefas;
import Service.ClienteServico;
import java.util.Hashtable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Guerra
 */
public class ServicoController {

    private final ClienteServico clienteServico;

    public ServicoController(ClienteServico clienteServico) {
        this.clienteServico = clienteServico;
    }

    public void adicionarServico(Tarefas servico, DefaultTableModel model) {
        clienteServico.adicionarServico(servico);
        model.addRow(obterDadosTabela(servico));
    }

    public void carregarTabela(DefaultTableModel model) {
        model.setRowCount(0);

        Hashtable<String, Tarefas> servicos = clienteServico.listarTodosServico();  // Renomeei a variável
        for (Tarefas servico : servicos.values()) {  // Agora a variável do loop é 'servico'
            model.addRow(obterDadosTabela(servico));
        }
    }

    public Tarefas buscarServicoNome(String nome) {
        return clienteServico.buscarServicoNome(nome);
    }

    public boolean removerServico(String nome) {
        return clienteServico.removerServico(nome);
    }

    public Hashtable<String, Tarefas> listarTodosServico() {
        return  clienteServico.listarTodosServico();
    }

    private Object[] obterDadosTabela(Tarefas servico) {
        return new Object[]{
            servico.getNome(),
            servico.getPreco()
        };
    }
}
