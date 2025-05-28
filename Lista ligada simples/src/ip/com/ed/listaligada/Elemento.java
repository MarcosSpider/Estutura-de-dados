/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ip.com.ed.listaligada;

/**
 *
 * @author Marcos21
 */
public class Elemento {
    private Pessoa pessoa;
    private Elemento proximo;
    
    public Elemento(Pessoa pessoa){
        this.pessoa = pessoa;
        this.proximo = null;
    }
    public Pessoa getPessoa(){
        return this.pessoa;
    }
    public void setPessoa(Pessoa pessoa){
        this.pessoa = pessoa;
    }
    public Elemento getProximo(){
        return this.proximo;
    }
    public void setProximo(Elemento proximo){
        this.proximo =proximo;
    }
    
}
