package Model;

import java.util.UUID;

/**
 *
 * @author Diagramador - Arena
 */
public class Produto {

    private String id;
    private String nome;
    private String descricao;
    private double quantidade;
    private double precoUnitario;

    public Produto() {
        this.id = gerarID();
    }

    public Produto(String id, String nome) {
        this.id = id;
        this.nome = nome;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
        this.descricao = descricao;
    }

    private String gerarID() {
        return UUID.randomUUID().toString();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}