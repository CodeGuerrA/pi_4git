/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repository;

import java.util.List;

/**
 *
 * @author yurid
 */
public interface IModeloCRUD {
    public void adicionarModelo(String nomeModelo, int idMarca) throws Exception;
    public void removerModelo(String nomeModelo) throws Exception;
    public List<String> selecionarModelosPorMarca(int idMarca) throws Exception;
}
