/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import Model.Colaborador;
import java.util.Hashtable;

/**
 *
 * @author CARLOS
 */
public interface ColaboradorRepository {
    
    void adicionarColaborador(Colaborador colaborador);
    
    Colaborador buscarColaboradorPeloId(String id);
    
    boolean atualizarColaborador(String id, Colaborador colaboradorAtualizado);
    
    boolean removerColaborador(String id);
    
    Hashtable<String, Colaborador> ListarTodosColaboradores();
    
}