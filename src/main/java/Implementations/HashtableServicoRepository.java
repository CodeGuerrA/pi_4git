/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Implementations;

import Model.Tarefas;
import Repository.ServicoRepository;
import java.util.Hashtable;

/**
 *
 * @author Guerra
 */
public class HashtableServicoRepository implements ServicoRepository {

    private final Hashtable<String, Tarefas> servicos = new Hashtable<>();

    @Override
    public void adicionarServico(Tarefas servico) {
        // Verifica se o serviço já foi cadastrado (nome do serviço em minúsculas)
        if (servicos.containsKey(servico.getNome().toLowerCase())) {
            System.out.println("O serviço '" + servico.getNome() + "' já foi cadastrado.");
        } else {
            servicos.put(servico.getNome().toLowerCase(), servico);
            System.out.println("Serviço '" + servico.getNome() + "' cadastrado com sucesso.");
        }
    }

    @Override
    public Tarefas buscarServicoNome(String nome) {
        return servicos.get(nome.toLowerCase());
    }

    @Override
    public Hashtable<String, Tarefas> listarTodosServico() {
        return servicos;
    }

    @Override
    public boolean removerServicoNome(String nome) {
        if (servicos.containsKey(nome)) {
            servicos.remove(nome);
            return true;
        }
        return false;
    }

}
