package Model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.UUID;

public class Veiculos {

    private String ID;
    private String modelo;
    private String marca;
    private String placa;
    private String chassi;
    private String patrimonio;
    private Double kilometragem;
    private LocalDate dataEntrada; // Mudado para LocalDate
    private String acessorios;

    public Veiculos() {
    }

 

    // Construtor com parâmetros
    public Veiculos(String modelo, String marca, String placa, String chassi, String patrimonio, Double kilometragem, String dataEntrada, String acessorios) {
        this.ID = gerarID(); // Gera um ID único
        this.modelo = modelo;
        this.marca = marca;
        this.placa = placa;
        this.chassi = chassi;
        this.patrimonio = patrimonio;
        this.kilometragem = kilometragem;
        this.acessorios = acessorios;
        this.dataEntrada = LocalDate.now();

        // Tenta converter a dataEntrada e lida com erros
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            this.dataEntrada = LocalDate.parse(dataEntrada, formatter);
        } catch (DateTimeParseException e) {
            System.out.println("Formato de data inválido: " + dataEntrada);
            this.dataEntrada = LocalDate.now(); // Define a data atual como padrão em caso de erro
        }
    }

    // Método para gerar um ID único usando UUID
    private String gerarID() {
        return UUID.randomUUID().toString(); // Gera um ID único com UUID
    }

    // Getters e Setters
    public String getID() {
        return this.ID; // Retorna o ID único do veículo
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

    public LocalDate getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(LocalDate dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public String getAcessorios() {
        return acessorios;
    }

    public void setAcessorios(String acessorios) {
        this.acessorios = acessorios;
    }
}
