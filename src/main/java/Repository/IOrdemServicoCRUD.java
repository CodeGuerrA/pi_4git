/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import Model.Colaborador;
import Model.OrdemServico;
import java.util.Hashtable;

/**
 *
 * @author Guerra
 */
public interface IOrdemServicoCRUD {
    public void insertOrdemServico(OrdemServico orderServico) throws Exception;
    public void updateColaborador(OrdemServico ordemServico) throws Exception;
    public void deleteOrdemServicoById(String id) throws Exception;
    public void selectOrdemServico(String id) throws Exception;   
}
