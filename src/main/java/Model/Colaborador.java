package Model;

import java.util.Hashtable;
import java.util.UUID;

/**
 *
 * @author Melo
 */
public class Colaborador {
        
    private String id;
    private String nome;
    private String cargo;
    
    public Colaborador(){
        this.id = gerarID();
    }
    
    public Colaborador(String id, String nome, String cargo) {
        this.id = gerarID();
        this.nome = nome;
        this.cargo = cargo;
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

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }        
}