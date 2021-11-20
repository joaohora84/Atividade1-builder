/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.time.LocalDate;
import org.immutables.builder.Builder;

/**
 *
 * @author joaoantoniodahora
 */
public class Produto {

    private long id;
    private String titulo;
    private String descricao;
    private String marca;
    private String modelo;
    private int estoque = 0;
    private double preco;
    private LocalDate dataCadastro;
    private LocalDate dataUltimaAtualizacao;
    private String urlFoto;
    private String categoria;
    private Vendedor vendedor;
    private double peso;
    private double altura;
    private double largura;
    private double profundidade;

    @Builder.Constructor
    public Produto(long id, String titulo, String descricao, String marca, 
            String modelo, int estoque, double preco, LocalDate dataCadastro,
            LocalDate dataUltimaAtualizacao, String urlFoto, String categoria, 
            Vendedor vendedor, double peso, double altura, double largura, 
            double profundidade) {
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.marca = marca;
        this.modelo = modelo;
        this.preco = preco;
        this.estoque = estoque;
        this.dataCadastro = dataCadastro;
        this.dataUltimaAtualizacao = dataUltimaAtualizacao;
        this.urlFoto = urlFoto;
        this.categoria = categoria;
        this.vendedor = vendedor;
        this.peso = peso;
        this.altura = altura;
        this.largura = largura;
        this.profundidade = profundidade;
    }
    
    
    
    /**
     * @return the id
     */
    public long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        
        if (titulo == null || titulo.isEmpty()) {
            throw new IllegalArgumentException("Título é obrigatório");
        }
        
        this.titulo = titulo;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        
        if (descricao == null || descricao.isEmpty()) {
            throw new IllegalArgumentException("Descrição é obrigatória");
        }
        
        this.descricao = descricao;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the estoque
     */
    public int getEstoque() {
        return estoque;
    }

    /**
     * @param estoque the estoque to set
     */
    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    /**
     * @return the preco
     */
    public double getPreco() {
        return preco;
    }

    /**
     * @param preco the preco to set
     */
    public void setPreco(double preco) {
        
        if (preco <= 0) {
            throw new IllegalArgumentException("Preço deve ser maior que zero");
        }
        
        this.preco = preco;
    }

    /**
     * @return the urlFoto
     */
    public String getUrlFoto() {
        return urlFoto;
    }

    /**
     * @param urlFoto the urlFoto to set
     */
    public void setUrlFoto(String urlFoto) {
        this.urlFoto = urlFoto;
    }

    /**
     * @return the categoria
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * @param categoria the categoria to set
     */
    public void setCategoria(String categoria) {
        
        if (categoria == null || categoria.isEmpty()) {
            
            throw new IllegalArgumentException("Categoria é orbrigatório");
            
        }
        
        this.categoria = categoria;
    }

    /**
     * @return the peso
     */
    public double getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(double peso) {
        this.peso = peso;
    }

    /**
     * @return the altura
     */
    public double getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(double altura) {
        this.altura = altura;
    }

    /**
     * @return the largura
     */
    public double getLargura() {
        return largura;
    }

    /**
     * @param largura the largura to set
     */
    public void setLargura(double largura) {
        this.largura = largura;
    }

    /**
     * @return the profundidade
     */
    public double getProfundidade() {
        return profundidade;
    }

    /**
     * @param profundidade the profundidade to set
     */
    public void setProfundidade(double profundidade) {
        this.profundidade = profundidade;
    }

    /**
     * @return the dataCadastro
     */
    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    /**
     * @param dataCadastro the dataCadastro to set
     */
    public void setDataCadastro(LocalDate dataCadastro) {
        
        if (dataCadastro.isBefore(LocalDate.now())) {
            
            throw new IllegalArgumentException("Data de cadastro não pode ser menor que a data atual ");
            
        }
        
        this.dataCadastro = dataCadastro;
    }

    public LocalDate getDataUltimaAtualizacao() {
        return dataUltimaAtualizacao;
    }

    public void setDataUltimaAtualizacao(LocalDate dataUltimaAtualizacao) {
        
        if (dataCadastro.isBefore(LocalDate.now())) {
            
            throw new IllegalArgumentException("Data de cadastro não pode ser menor que a data atual ");
            
        }
        
        this.dataUltimaAtualizacao = dataUltimaAtualizacao;
    }
    
    /**
     * @return the vendedor
     */
    public Vendedor getVendedor() {
        return vendedor;
    }

    /**
     * @param vendedor the vendedor to set
     */
    public void setVendedor(Vendedor vendedor) {
        
        if (vendedor == null) {
            
            throw new IllegalArgumentException("Vendedor é obrigatório");
            
        }
        
        this.vendedor = vendedor;
    }

    @Override
    public String toString() {
        return "Produto{" + "id=" + id + ", titulo=" + titulo + ","
                + " descricao=" + descricao + ", marca=" + marca + ","
                + " modelo=" + modelo + ", estoque=" + estoque + ", preco=" + preco + ","
                + " dataCadastro=" + dataCadastro + ", "
                + "dataUltimaAtualizacao=" + dataUltimaAtualizacao + ", "
                + "urlFoto=" + urlFoto + ", categoria=" + categoria + ", vendedor=" + vendedor + ","
                + " peso=" + peso + ", altura=" + altura + ", largura=" + largura + ", profundidade=" + profundidade + '}';
    }

  
  

}
