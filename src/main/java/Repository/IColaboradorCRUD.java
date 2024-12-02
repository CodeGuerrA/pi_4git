/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repository;

import Model.Colaborador;
import java.util.List;

/**
 *
 * @author yurid
 */
public interface IColaboradorCRUD {
    public void insertColaborador(Colaborador colaborador) throws Exception;
    public void updateColaborador(Colaborador colaborador) throws Exception;
    public void deleteColaboradorById(int id) throws Exception;
}
