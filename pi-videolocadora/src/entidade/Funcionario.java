/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidade;

/**
 *
 * @author bonamigo
 */
public class Funcionario {
    
    private Integer id;
    private String nome;
    private String cargo;
    private Integer cliente_id;

    public Funcionario(Integer id, String nome, String cargo, Integer cliente_id) {
        this.id = id;
        this.nome = nome;
        this.cargo = cargo;
        this.cliente_id = cliente_id;
    }
    
    public Funcionario(){
        
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public Integer getCliente_id() {
        return cliente_id;
    }

    public void setCliente_id(Integer cliente_id) {
        this.cliente_id = cliente_id;
    }
    
}
