/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Cliente;
import Model.Colaborador;
import Service.ColaboradorService;
import java.util.Hashtable;

import javax.swing.table.DefaultTableModel;
/**
 *
 * @author CARLOS
 */
public class ColaboradorController {
    
    private final ColaboradorService colaboradorService;
    
    public ColaboradorController (ColaboradorService colaboradorService) {
        this. colaboradorService = colaboradorService;
    }
    
    public void adicionarColaborador(Colaborador colaborador, DefaultTableModel model) {
        colaboradorService.adicionarColaborador(colaborador);
    }
    
    //metodo retirado pois não havera mais tabela na tela de cadastro
    public void carregarTela(DefaultTableModel model) {
//        model.setRowCount(0);
//        
//        Hashtable<String, Colaborador> colaboradores = colaboradorService.listarTodosColaboradores();
//
//        for (Colaborador colaborador : colaboradores.values()) {
//            
//            model.addRow(obterDadosTabela(colaboradores));
//        }    
    }
    
    public Colaborador buscarColaboradorPorId(String id) {
        return colaboradorService.buscaColaboradorPorId(id);
    }
    
}