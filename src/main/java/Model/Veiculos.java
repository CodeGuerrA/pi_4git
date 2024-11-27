package Model;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

public class Veiculos {

    private String ID;
    private String modelo;
    private String marca;
    private String placa;
    private String chassi;
    private String patrimonio;
    private String kilometragem;
    private Date dataEntrada;
    private Date dataFim;
    private String acessorios;

    // Formato de data padrão
    private SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

    // Construtor padrão
    public Veiculos() {
        this.ID = gerarID();
        this.dataFim = new Date();
    }

    // Construtor com parâmetros
    public Veiculos(String modelo, String marca, String placa, String chassi, String patrimonio,
                    String kilometragem, Date dataEntrada, String acessorios) {
        this.ID = gerarID(); // Gera um ID único
        this.modelo = modelo;
        this.marca = marca;
        this.placa = placa;
        this.chassi = chassi;
        this.patrimonio = patrimonio;
        this.kilometragem = kilometragem;
        this.dataEntrada = dataEntrada;
        this.dataFim = new Date();
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

    public String getKilometragem() {
        return kilometragem;
    }

    public void setKilometragem(String kilometragem) {
        this.kilometragem = kilometragem;
    }

    public String getDataEntrada() {
        return formato.format(dataEntrada);
    }

    public void setDataEntrada(Date dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public String getDataFim() {
        return formato.format(dataFim);
    }

    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }

    public String getAcessorios() {
        return acessorios;
    }

    public void setAcessorios(String acessorios) {
        this.acessorios = acessorios;
    }
}
