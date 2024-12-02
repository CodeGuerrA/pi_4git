package Model;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

public class Veiculos {

    private String modelo;
    private String marca;
    private String placa;
    private String chassi;
    private String patrimonio;
    private String kilometragem;

    private String acessorios;

    public Veiculos() {

    }

    public Veiculos(String modelo, String marca, String placa, String chassi, String patrimonio, String kilometragem, String acessorios) {
        this.modelo = modelo;
        this.marca = marca;
        this.placa = placa;
        this.chassi = chassi;
        this.patrimonio = patrimonio;
        this.kilometragem = kilometragem;
        this.acessorios = acessorios;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public String getPatrimonio() {
        return patrimonio;
    }

    public void setPatrimonio(String patrimonio) {
        this.patrimonio = patrimonio;
    }

    public String getKilometragem() {
        return kilometragem;
    }

    public void setKilometragem(String kilometragem) {
        this.kilometragem = kilometragem;
    }

    public String getAcessorios() {
        return acessorios;
    }

    public void setAcessorios(String acessorios) {
        this.acessorios = acessorios;
    }

}
