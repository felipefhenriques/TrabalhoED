/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entrega;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Felipe
 */
public class GerenciaLista {
    
    public static void main(String[] args) throws IOException {
        ListaEncadeada list = new ListaEncadeada();
        list.insereInicio("Oi");
        list.insereFinal("tudo");
        list.insereFinal("legal?");
        list.insereFinal("show?");
        list.insereFinal("bem?");
         list.insereFinal("que bom!");
        System.out.println(list);
        list.checa(leArquivo());
        System.out.println(list);
        
    }
    
            public static String leArquivo() throws FileNotFoundException, IOException{
            
                FileReader arquivo = new FileReader("texto.txt");
                BufferedReader leBufferizado = new BufferedReader(arquivo); 
                String linha = leBufferizado.readLine();
                String dados[] = linha.split(" ");
                
                System.out.println("texto: "+linha);
                return linha;
}
    
}