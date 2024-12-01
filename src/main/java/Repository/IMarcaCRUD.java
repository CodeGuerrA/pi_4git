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
public interface IMarcaCRUD {
    public void adicionarMarca(String nomeMarca) throws Exception;
    public void removerMarca(String nomeMarca) throws Exception;
    public List<String> selecionarMarcas() throws Exception;
}
