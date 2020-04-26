/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entrega;

/**
 *
 * @author Felipe
 */
public class No {
    
    private String elemento;
    private No prox;
    
    public No(String elemento, No prox){
        this.elemento = elemento;
        this.prox = prox;
    }
    
    // get e set para todos

    public String getElemento() {
        return elemento;
    }

    public void setElemento(String elemento) {
        this.elemento = elemento;
    }

    public No getProx() {
        return prox;
    }

    public void setProx(No prox) {
        this.prox = prox;
    }
    
      
    @Override
    public String toString(){
        return "No{" + "elemento " + elemento + ", prox = " + prox + "}";
    }
    
}
