/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ip.com.ed.listaligada;

/**
 *
 * @author Marcos21
 */
public class Principal {
    public static void main(String[] args) {
        ListaLigada lista = new ListaLigada();
        lista.inserirIni(new Pessoa("Paulo","M",22));
        lista.inserirFim(new Pessoa("Ana","F",19));
        lista.inserirFim(new Pessoa("Pedro","M",21));
        lista.inserirIni(new Pessoa("Maria","F",20));
        lista.imprimir();
        lista.removerFim();
        lista.buscar("Ana");
        lista.inserirEm(2, new Pessoa("Marcos","M",23));
        lista.removerEm(0, new Pessoa("Paulo","M",22));
        System.out.println("--------------------------------------------");
        lista.imprimir();
        System.out.println("--------------------------------------------");
        System.out.println("Tamanho da lista: "+lista.tamanho());
        System.out.println("Lista vazia: "+lista.listaVazia());
        
        
    }
    
}
