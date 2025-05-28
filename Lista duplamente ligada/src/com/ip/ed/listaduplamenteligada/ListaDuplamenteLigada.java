/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ip.ed.listaduplamenteligada;

/**
 *
 * @author Marcos21
 */
public class ListaDuplamenteLigada {
    private No primeiro;
    private No ultimo;
    private int tamanho;
    
    public ListaDuplamenteLigada(){
        this.primeiro=null;
        this.ultimo=null;
        this.tamanho = 0;
    }
    
    public boolean listaVazia(){
        return this.tamanho==0;
    }
    
    public int tamanho(){
        return this.tamanho;
    }
    
    public boolean inserirIni(Pessoa pessoa){
        No novo = new No(pessoa);
        if(this.listaVazia()){
            this.primeiro=novo;
            this.ultimo=novo;
        }
        novo.setProximo(this.primeiro);
        this.primeiro.setAnterior(novo);
        this.primeiro=novo;
        this.tamanho++;
        return true;
    }
    public boolean inserirFim(Pessoa pessoa){
        No novo = new No(pessoa);
        if(this.listaVazia()){
            this.primeiro = this.ultimo = novo;
        }
        this.ultimo.setProximo(novo);
        novo.setAnterior(this.ultimo);
        this.ultimo=novo;
        this.tamanho++;
        return true;
    }
    public boolean removerIni(){
        if(this.listaVazia()){
            return false;
        }
        if(this.primeiro==this.ultimo){
            this.primeiro = this.ultimo = null;
        }else{
            this.primeiro = this.primeiro.getProximo();
            this.primeiro.setAnterior(null);
        }
        this.tamanho--;
        return true;
    }
    public boolean removerFim(){
        if(this.listaVazia()){
            return false;
        }
        if(this.primeiro==this.ultimo){
            this.primeiro = this.ultimo = null;
        }else{
            this.ultimo = this.ultimo.getAnterior();
            this.ultimo.setProximo(null);
        }
        this.tamanho--;
        return true;
    }
    public boolean inserirEm(int pos, Pessoa pessoa){
        if(pos < 0 || pos > this.tamanho){
            return false;
        }
  
        if(pos == 0){
            inserirIni(pessoa);
        }else if(pos == this.tamanho){
            inserirFim(pessoa);
        }else{
                  No novo = new No(pessoa);
                  No atual = this.primeiro;
                  for(int i=0; i < pos; i++){
                      atual = atual.getProximo();
            }
                  No anterior = atual.getAnterior();
                  novo.setAnterior(anterior);
                  novo.setProximo(atual);
                  anterior.setProximo(novo);
                  atual.setAnterior(novo);
                  this.tamanho++;
        }
        return true;
    }
    public boolean removerEm(int pos, Pessoa pessoa){
        if(pos < 0 || pos > this.tamanho){
            return false;
        }
        if(pos == 0){
            removerIni();
        }else if(pos == this.tamanho){
        removerFim();
    }else{
            No atual = this.primeiro;
            for(int i=0; i < pos; i++){
                atual = atual.getProximo();
            }
            No anterior = atual.getAnterior();
            No proximo = atual.getProximo();
            anterior.setProximo(proximo);
            proximo.setAnterior(anterior);
        }
        this.tamanho--;
        return true;
    }
    public void buscar(String nome){
        No atual = this.primeiro;
        while(atual !=null){
            if(atual.getPessoa().getNome().equalsIgnoreCase(nome)){
                System.out.println("Nome encontrado! "+atual.getPessoa().getNome()+" com "+atual.getPessoa().getIdade());
                return;
            }
            atual = atual.getProximo();
        }
        System.out.println("Nome "+nome+" não encontrado.");
    }
    public void ordemAlfabetica(){
        if(this.tamanho < 2){
            return;
        }
        boolean trocou;
        do{
            trocou = false;
            No atual = this.primeiro;
            while(atual.getProximo()!=null){
                No seguinte = atual.getProximo();
                String nomeAtual = atual.getPessoa().getNome();
                String nomeSeguinte = seguinte.getPessoa().getNome();
                if(nomeAtual.compareToIgnoreCase(nomeSeguinte)>0){
                    Pessoa temp = atual.getPessoa();
                    atual.setPessoa(seguinte.getPessoa());
                    seguinte.setPessoa(temp);
                    trocou = true;
                }
                atual=atual.getProximo();
            }
        }while(trocou);
    }
    
    public void print(){
        if(this.listaVazia()){
            System.out.println("Lista está vazia");
            return;
        }
        No atual = this.primeiro;
        while(atual != null){
            System.out.println("------------------------------------------");
            System.out.println("Nome "+atual.getPessoa().getNome());
            System.out.println("Idade "+atual.getPessoa().getIdade());
            atual = atual.getProximo();
        }
    }
    
}
