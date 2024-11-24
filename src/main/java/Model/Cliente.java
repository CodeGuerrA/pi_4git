package Model;

import java.util.Hashtable;
import java.util.UUID;

// Classe Cliente
public class Cliente {

    private String ID;
    private String nome;
    private String endereco;
    private String CPF; // Para Pessoa Física
    private String CNPJ; // Para Pessoa Jurídica
    private String Ins_Estadual; // Para Pessoa Jurídica
    private String email;
    private String telefones;
    private String contatos;

    // Relacionamento 1 para N com veículos
    private Hashtable<String, Veiculos> veiculos;

    // Construtor sem parâmetros
    public Cliente() {
        this.ID = gerarID(); // Gera um ID único com UUID
        this.veiculos = new Hashtable<>(); // Inicializa o Hashtable
    }

    // Construtor com parâmetros
    public Cliente(String nome, String endereco, String CPF, String CNPJ, String Ins_Estadual, String email, String telefones, String contatos) {
        this.ID = gerarID(); // Gera um ID único com UUID
        this.nome = nome;
        this.endereco = endereco;
        this.CPF = CPF;
        this.CNPJ = CNPJ;
        this.Ins_Estadual = Ins_Estadual;
        this.email = email;
        this.telefones = telefones;
        this.contatos = contatos;
        this.veiculos = new Hashtable<>(); // Inicializa o Hashtable
    }

    // Método para gerar um ID único usando UUID
    private String gerarID() {
        return UUID.randomUUID().toString(); // Gera um ID único com UUID
    }

    // Métodos para adicionar, remover e acessar veículos
    public void adicionarVeiculo(Veiculos veiculo) {
        veiculos.put(veiculo.getID(), veiculo); // Adiciona veículo
    }

    public void removerVeiculo(String veiculoID) {
        veiculos.remove(veiculoID); // Remove veículo
    }

    public Veiculos getVeiculo(String veiculoID) {
        return veiculos.get(veiculoID); // Retorna o veículo por ID
    }

    public Hashtable<String, Veiculos> getVeiculos() {
        return veiculos;
    }

    public void setVeiculos(Hashtable<String, Veiculos> veiculos) {
        this.veiculos = veiculos;
    }

    // Getters e Setters
    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getIns_Estadual() {
        return Ins_Estadual;
    }

    public void setIns_Estadual(String Ins_Estadual) {
        this.Ins_Estadual = Ins_Estadual;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefones() {
        return telefones;
    }

    public void setTelefones(String telefones) {
        this.telefones = telefones;
    }

    public String getContatos() {
        return contatos;
    }

    public void setContatos(String contatos) {
        this.contatos = contatos;
    }

    public void verificarVeiculo(Veiculos veiculo) {
        Veiculos veiculoEncontrado = getVeiculo(veiculo.getID());
        if (veiculoEncontrado != null) {
            System.out.println("Veículo encontrado: " + veiculoEncontrado.getModelo());
        } else {
            System.out.println("Veículo não encontrado.");
        }
    }

}
