/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Guerra
 */
import java.text.SimpleDateFormat;

public class Propriedade {

    private int idCliente;
    private int idVeiculo;
    private Date dataEntrada;
    private Date dataFim;

    public Propriedade() {
    }

    
    // Construtor
    public Propriedade(int idCliente, int idVeiculo, Date dataEntrada, Date dataFim) {
        this.idCliente = idCliente;
        this.idVeiculo = idVeiculo;
        this.dataEntrada = dataEntrada;
        this.dataFim = dataFim;
    }

    // Getters e setters
    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdVeiculo() {
        return idVeiculo;
    }

    public void setIdVeiculo(int idVeiculo) {
        this.idVeiculo = idVeiculo;
    }

    public Date getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(Date dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public Date getDataFim() {
        return dataFim;
    }

    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }

    // Formatar as datas para exibição
    public String formatarDataEntrada() {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        return formato.format(dataEntrada);
    }

    public String formatarDataFim() {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        return formato.format(dataFim);
    }
}

