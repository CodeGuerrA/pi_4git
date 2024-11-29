/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Util.StatusOrdemServico;
import java.util.Date;

/**
 *
 * @author Guerra
 */
public class OrdemServico {
  private String id;
    private Cliente cliente;
    private Veiculos veiculos;
    private Date dataCriacao;
    private Date dataPrevistaConclusao;
    private StatusOrdemServico status;

    public OrdemServico() {
    }

    public OrdemServico(String id, Cliente cliente, Veiculos veiculos, Date dataCriacao, Date dataPrevistaConclusao, StatusOrdemServico status) {
        this.id = id;
        this.cliente = cliente;
        this.veiculos = veiculos;
        this.dataCriacao = dataCriacao;
        this.dataPrevistaConclusao = dataPrevistaConclusao;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Veiculos getVeiculos() {
        return veiculos;
    }

    public void setVeiculos(Veiculos veiculos) {
        this.veiculos = veiculos;
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public Date getDataPrevistaConclusao() {
        return dataPrevistaConclusao;
    }

    public void setDataPrevistaConclusao(Date dataPrevistaConclusao) {
        this.dataPrevistaConclusao = dataPrevistaConclusao;
    }

    public StatusOrdemServico getStatus() {
        return status;
    }

    public void setStatus(StatusOrdemServico status) {
        this.status = status;
    }
    
    
}
