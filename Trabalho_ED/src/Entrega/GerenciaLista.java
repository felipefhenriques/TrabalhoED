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
//        list.insereInicio("Oi");
//        list.insereFinal("tudo");
//        list.insereFinal("legal?");
//        list.insereFinal("show?");
//        list.insereFinal("bem?");
//        list.insereFinal("que bom!");
//        System.out.println(list);
//       list.checa(leArquivo());
        
        String[] ler = leArquivo();
        for(int i = 0; i < ler.length; i++){
            System.out.print(" " + ler[i]);
        }
        
        list.compactador(ler);
        System.out.println(list);
        System.out.println("0");
    }
    
            public static String[] leArquivo() throws FileNotFoundException, IOException{
            
                FileReader arquivo = new FileReader("texto.txt");
                BufferedReader leBufferizado = new BufferedReader(arquivo); 
                String linha = leBufferizado.readLine();
                String dados[] = linha.split(" ");
                return dados;
}
    
}
