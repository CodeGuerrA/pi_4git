package Model;

import java.util.Date;
import java.util.UUID;

public class Veiculos {

    private String ID;
    private String modelo;
    private String marca;
    private String placa;
    private String chassi;
    private String patrimonio;
    private Double kilometragem;
    private Date dataEntrada; // Continuamos com java.util.Date
    private String acessorios;

    public Veiculos() {
        this.ID = gerarID(); // Gera um ID único ao criar um novo objeto
    }

    // Construtor com parâmetros
    public Veiculos(String modelo, String marca, String placa, String chassi, String patrimonio,
            Double kilometragem, Date dataEntrada, String acessorios) {
        this.ID = gerarID(); // Gera um ID único
        this.modelo = modelo;
        this.marca = marca;
        this.placa = placa;
        this.chassi = chassi;
        this.patrimonio = patrimonio;
        this.kilometragem = kilometragem;
        this.dataEntrada = dataEntrada; // Recebe diretamente um objeto Date
        this.acessorios = acessorios;
    }

    // Método para gerar um ID único usando UUID
    private String gerarID() {
        return UUID.randomUUID().toString();
    }

    // Getters e Setters
    public String getID() {
        return this.ID;
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

    public Double getKilometragem() {
        return kilometragem;
    }

    public void setKilometragem(Double kilometragem) {
        this.kilometragem = kilometragem;
    }

    public Date getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(Date dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public String getAcessorios() {
        return acessorios;
    }

    public void setAcessorios(String acessorios) {
        this.acessorios = acessorios;
    }
}
