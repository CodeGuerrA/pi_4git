/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Model.OrdemServico;
import java.util.Hashtable;

/**
 *
 * @author Guerra
 */
public interface OrdemServicoService {
    void criarOrdemServico(OrdemServico ordemServico);
    
    Hashtable<String, OrdemServico> listarOrdensServico();
    
    OrdemServico buscarOrdemId(String id);
    
    boolean removerOrdemServico(String id);
    boolean atualizarOrdemServico(OrdemServico ordemServico);
        
    
    
}
