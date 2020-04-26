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
public class ListaEncadeada {
    
        private No ini;

       // Criar construtor
       public ListaEncadeada(){
           this.ini = null;
       }

       // Verifica se a lista está vazia
       public boolean vazia(){
           return ini == null;
       }

       public void insereInicio(String elemento){
           No novo = new No(elemento, ini);
           ini = novo;
       }

       public void insereFinal(String elemento){
           No novo = new No(elemento, null);
           No temp = ini ;

           if(temp==null){
               ini = novo;
           } else {
           //Percorrer até chegar no último nó
           while (temp .getProx()!= null){
               temp = temp.getProx();
           }
               }

           temp.setProx(novo);
       }

       public void insereFinalRec(String elemento){
           insereFinalRec(ini, elemento);
       }
       public void insereFinalRec(No temp, String elemento){
           if(temp==null){
               No novo = new No(elemento, ini);
               ini = novo;
           } else {
               if(temp.getProx() == null){
                   No novo = new No(elemento, null);
                   temp.setProx(novo);
               } else {
               insereFinalRec(temp.getProx(), elemento);
            }
           }
       }



       public boolean buscaLinear(String x){
           No temp = ini;

           while(temp != null){
               if(temp.getElemento() == x){
                   return true;
               }
               temp = temp.getProx();
           }
           return false;
       }

       public No buscaLinear2(String x){
           No temp = ini;

           while(temp != null){
               if(temp.getElemento() == x){
                   return temp;
               }
               temp = temp.getProx();
           }
           return null;
       }

       public boolean buscaLinearRec(String x){
           return buscaLinearRec(ini, x);
       }
       public boolean buscaLinearRec(No temp, String x){
           if(temp == null){
               return false;   
           }
           if(temp.getElemento() == x){
               return true;
           }
           return buscaLinearRec(temp.getProx(), x);
       }

       public No buscaLinearRec2(String x){
           return buscaLinearRec2(ini, x);
       }
       public No buscaLinearRec2(No temp, String x){
           if(temp == null){
               return null;  
           }
           if(temp.getElemento() == x){
               return temp;
           }
           return buscaLinearRec2(temp.getProx(), x);
       }

       public void removeInicio(){
           if(vazia()){
               System.out.println("Lista vazia");
           } else {
               // Existe ao menos um nó
               ini=ini.getProx();
           }
       }

       public void removeFinal(){
           if(vazia()){
               System.out.println("Lista vazia");
           } else {
               No temp = ini;
               No anterior = null;

               while(temp.getProx()!= null){
                   anterior = temp;
                   temp = temp.getProx();
               }
               // Se a lista tiver apenas um nó
               if(anterior == null){
                   ini = null;
               } else {
                   anterior.setProx(null);
               }
           }

       }

       public void removeFinalRec(){
           removeFinalRec(ini);
       }
       public void removeFinalRec(No temp){
           if(vazia()){
               System.out.println("Lista vazia");
               return;
           }

           if(ini.getProx()==null){
               ini = null;
           }

           if(temp.getProx().getProx()==null){
               temp.setProx(null);
               return;
           }

           removeFinalRec(temp.getProx());
       }
       
       public void removeOrdenado(String elemento){
        if(vazia()){
            System.out.println("Lista vazia!");
        } else {
            No temp = ini;
            No anterior = null;
            
            while(!temp.equals(null) && !temp.getElemento().equals(elemento)){
                anterior=temp;
                temp=temp.getProx();
            }
            //Se a lista tem apenas um nó
            if(anterior==null){
                ini=ini.getProx(); //1. remove do início
            } else {
                if (!temp.equals(null) && temp.getElemento().equals(elemento)){
                    anterior.setProx(temp.getProx());
                } else {
                    System.out.println(elemento + " NAO está na lista");
                }
            }
        }   
    }

       public int quantidadeNos(){
           No no = ini;
           int contador = 0;   
           if(vazia()){
               System.out.println("A lista está vazia");
           } else {
               while (no!= null){
                   no = no.getProx();
                   contador ++;
               }
           }
           return contador;
       }
       
       public void inverteLista(){
           No temp = ini;
           No anterior = null;
           No posterior = anterior;

           while(temp.getProx()!= null){
               posterior = anterior;
               anterior = temp;
               temp = temp.getProx();
               anterior.setProx(posterior); // Anterior olha pra trás
           }
           ini = temp;
           temp.setProx(anterior);
       }
       
       public void checa(String x){
           No temp = ini;
           int count = 1;
          String[] vetor=  {"a", "b", "c", "d", "e","f","g","h","i","j", "k", "l", "m","n", "o","p","q","r","s","t","u","v","w","x","y","z"};
         
           while(temp != null){
               if(temp.getElemento().equals(x)){
                   System.out.println(count);
                   removeOrdenado(x);
                   insereInicio(x);
               }
               temp = temp.getProx();
               count++;
           }
       }
       

       @Override
       public String toString() {
           String strLista= " ";
           No temp = ini;

           while (temp != null){
               strLista = strLista + temp.getElemento() + " ";
               temp = temp.getProx();
           }
           return strLista;
       }

   }
