/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Model.Colaborador;
import Repository.ColaboradorRepository;
import java.util.Hashtable;

/**
 *
 * @author CARLOS
 */
public class ColaboradorService {
    
    private final ColaboradorRepository colaboradorRepository;
    
    public ColaboradorService(ColaboradorRepository colaboradorRepository) {
        this.colaboradorRepository = colaboradorRepository;
    }
    
    public void adicionarColaborador(Colaborador colaborador) {
        colaboradorRepository.adicionarColaborador(colaborador);
    }
    
    public boolean atualizarColaborador(String id, Colaborador colaboradorAtualizado) {
        return colaboradorRepository.atualizarColaborador(id, colaboradorAtualizado);
    }
    
    public Colaborador buscaColaboradorPorId(String id){
        return colaboradorRepository.buscarColaboradorPeloId(id);
    }
    
    public boolean removerColaborador(String id) {
        return colaboradorRepository.removerColaborador(id);
    }
    
    public Hashtable listarTodosColaboradores() {
        return colaboradorRepository.ListarTodosColaboradores();
    }    
}