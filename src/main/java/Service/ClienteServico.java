/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Model.Tarefas;
import Repository.ServicoRepository;
import java.util.Hashtable;

/**
 *
 * @author Guerra
 */
public class ClienteServico {

    private final ServicoRepository servicoRepository;

    public ClienteServico(ServicoRepository servicoRepository) {

        this.servicoRepository = servicoRepository;
    }

    public void adicionarServico(Tarefas Servico) {

        servicoRepository.adicionarServico(Servico);
    }

    public Tarefas buscarServicoNome(String nome) {
        return servicoRepository.buscarServicoNome(nome);
    }
    
    public Hashtable listarTodosServico(){
        return servicoRepository.listarTodosServico();
    }
    
    public boolean removerServico(String nome){
        return servicoRepository.removerServicoNome(nome);
    }

}
