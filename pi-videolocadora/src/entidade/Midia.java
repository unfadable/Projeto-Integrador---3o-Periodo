/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidade;

/**
 *
 * @author rafael
 */
public class Midia {
    
    private Integer id;
    private Integer quantidade;
    private boolean disponibilidade;
    private Integer titulo_id;

    public Midia(Integer id, Integer quantidade, boolean disponibilidade, Integer titulo_id) {
        this.id = id;
        this.quantidade = quantidade;
        this.disponibilidade = disponibilidade;
        this.titulo_id = titulo_id;
    }

    public Midia() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public boolean isDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    public Integer getTitulo_id() {
        return titulo_id;
    }

    public void setTitulo_id(Integer titulo_id) {
        this.titulo_id = titulo_id;
    }
    
}