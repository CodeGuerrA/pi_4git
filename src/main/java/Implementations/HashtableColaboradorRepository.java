/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Implementations;

import Model.Cliente;
import Model.Colaborador;
import java.util.Hashtable;
import Repository.ColaboradorRepository;


/**
 *
 * @author Melo
 */
public class HashtableColaboradorRepository implements ColaboradorRepository {
    
    private final Hashtable<String, Colaborador> colaboradores = new Hashtable<>();
    
    @Override
    public void adicionarColaborador(Colaborador colaborador) {
        String id = obterId(colaborador);
        if(id != null && !colaboradores.containsKey(id)) {
            colaboradores.put(id, colaborador);
        }
    }
    
    @Override
    public Colaborador buscarColaboradorPeloId(String id) {
        return colaboradores.get(id);
    }
    
    @Override
    public boolean atualizarColaborador(String id, Colaborador colaboradorAtualizado) {
        if(colaboradores.containsKey(id)) {
            colaboradores.put(id, colaboradorAtualizado);
            return true;        
        }
        return false;
    }
    
    @Override
    public boolean removerColaborador (String id) {
        if (colaboradores.containsKey(id)) {
            colaboradores.remove(id);
            return true;
        }
        return false;
    }
    
    private String obterId(Colaborador colaborador) {
        if (colaborador.getId()!=  null && !colaborador.getId().isEmpty()) {
            return colaborador.getId();
        } 
        return null;
    }

    @Override
    public Hashtable<String, Colaborador> ListarTodosColaboradores() {
        return colaboradores;
    }
}