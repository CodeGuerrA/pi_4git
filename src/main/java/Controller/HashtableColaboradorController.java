/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Cliente;
import Model.Colaborador;
import java.util.Hashtable;

import Service.ColaboradorService;

/**
 *
 * @author Melo
 */
public class HashtableColaboradorController implements ColaboradorService {

    private final Hashtable<String, Colaborador> colaboradores = new Hashtable<>();

    @Override
    public void adicionarColaborador(Colaborador colaborador) {
        String id = obterId(colaborador);
        if (id != null && !colaboradores.containsKey(id)) {
            colaboradores.put(id, colaborador);
        }
    }

    @Override
    public Colaborador buscarColaboradorPeloId(String id) {
        return colaboradores.get(id);
    }


    private String obterId(Colaborador colaborador) {
        if (colaborador.getId() != null && !colaborador.getId().isEmpty()) {
            return colaborador.getId();
        }
        return null;
    }

    @Override
    public Hashtable<String, Colaborador> ListarTodosColaboradores() {
        return colaboradores;
    }
}
