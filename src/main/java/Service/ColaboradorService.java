/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Model.Colaborador;
import java.util.Hashtable;

/**
 *
 * @author CARLOS
 */
public interface ColaboradorService {
    
    void adicionarColaborador(Colaborador colaborador);
    
    Colaborador buscarColaboradorPeloId(String id);
    
    
    
    Hashtable<String, Colaborador> ListarTodosColaboradores();
    
}