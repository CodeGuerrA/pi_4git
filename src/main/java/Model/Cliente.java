package Model;

import java.util.Hashtable;
import java.util.UUID;

public class Cliente {

    private String nome;
    private String endereco;
    private String CPF;
    private String CNPJ;
    private String Ins_Estadual;
    private String email;
    private String telefones;
    private String contatos;

    public Cliente() {

    }

    public Cliente(String nome, String endereco, String CPF, String CNPJ, String Ins_Estadual, String email, String telefones, String contatos) {
        this.nome = nome;
        this.endereco = endereco;
        this.CPF = CPF;
        this.CNPJ = CNPJ;
        this.Ins_Estadual = Ins_Estadual;
        this.email = email;
        this.telefones = telefones;
        this.contatos = contatos;
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

}
