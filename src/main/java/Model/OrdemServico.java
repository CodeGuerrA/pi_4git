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
    private Date dataInicio;
    private Date dataFim;
    private StatusOrdemServico status;
    private Double precoFinal;

    public OrdemServico() {
    }

    public OrdemServico(String id, Date dataInicio, Date dataFim, StatusOrdemServico status, Double precoFinal) {
        this.id = id;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.status = status;
        this.precoFinal = precoFinal;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataFim() {
        return dataFim;
    }

    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }

    public StatusOrdemServico getStatus() {
        return status;
    }

    public void setStatus(StatusOrdemServico status) {
        this.status = status;
    }

    public Double getPrecoFinal() {
        return precoFinal;
    }

    public void setPrecoFinal(Double precoFinal) {
        this.precoFinal = precoFinal;
    }

}
