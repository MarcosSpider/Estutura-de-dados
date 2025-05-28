/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ip.ed.listaduplamenteligada;

/**
 *
 * @author Marcos21
 */
public class Principal {
    public static void main(String[] args) {
        ListaDuplamenteLigada lista = new ListaDuplamenteLigada();
        
        lista.inserirIni(new Pessoa("Paulo",21));
        lista.inserirIni(new Pessoa("Antonio",22));
        lista.inserirFim(new Pessoa("Pedro",19));
        lista.inserirIni(new Pessoa("Maria",18));
        lista.inserirIni(new Pessoa("Ana",20));
        System.out.println("------------------------------------------");
        lista.print();
        System.out.println("------------------------------------------");
        lista.removerIni();
        lista.removerFim();
        lista.inserirEm(2, new Pessoa("João",23));
        lista.removerEm(4, new Pessoa("Paulo",21));
        lista.buscar("Maria");
        System.out.println("////////////////////////////////");
        lista.print();
        lista.ordemAlfabetica();
        System.out.println("////////////////////////////////");
        lista.print();
    }
}
