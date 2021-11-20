
import java.time.LocalDate;
import modelo.Produto;
import modelo.ProdutoBuilder;
import modelo.Vendedor;
import modelo.VendedorBuilder;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author joaoantoniodahora
 */
public class Principal {
    
    private static LocalDate data = LocalDate.now();
    
    
        
        
    
    
    public static void main(String[] args) {
        
        Vendedor vendedor = new VendedorBuilder()
                .id(1)
                .nome("Joao")
                .build();
        
        Produto produto = new ProdutoBuilder()
                .id(1)
                .titulo("Anador")
                .descricao("500mg 10cpr")
                .marca("Anador")
                .modelo("comprimido")
                .estoque(20)
                .preco(20.0)
                .dataCadastro(data)
                .dataUltimaAtualizacao(data)
                .vendedor(vendedor)
                .urlFoto("foto")
                .categoria("referencia")
                .peso(20.0)
                .altura(10.0)
                .largura(100.0)
                .profundidade(100.0)
                .build();
                
           System.out.println(produto);     
        
    }
    
}
