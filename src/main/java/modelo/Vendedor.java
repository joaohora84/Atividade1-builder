/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import org.immutables.builder.Builder;

/**
 *
 * @author joaoantoniodahora
 */
public class Vendedor {
    
  
    private int id;
    private String nome;

    @Builder.Constructor
    public Vendedor(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Vendedor{" + "id=" + id + ", nome=" + nome + '}';
    }

  

   
    
    
    
}
