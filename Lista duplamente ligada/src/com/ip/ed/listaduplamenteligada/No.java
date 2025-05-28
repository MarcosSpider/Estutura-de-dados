/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ip.ed.listaduplamenteligada;

/**
 *
 * @author Marcos21
 */
public class No {
    private Pessoa pessoa;
    private No proximo;
    private No anterior;
    
    public No(Pessoa pessoa){
        this.pessoa = pessoa;
        this.proximo = null;
        this.anterior = null;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public No getProximo() {
        return proximo;
    }

    public void setProximo(No proximo) {
        this.proximo = proximo;
    }

    public No getAnterior() {
        return anterior;
    }

    public void setAnterior(No anterior) {
        this.anterior = anterior;
    }
    
    
}
