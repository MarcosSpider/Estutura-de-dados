/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ip.com.ed.listaligada;

/**
 *
 * @author Marcos21
 */
public class Pessoa {
    private String nome;
    private String sexo;
    public int idade;
    
    public Pessoa(String nome,String sexo, int idade){
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
    }
    public String getNome(){
        return this.nome;
    }
    public void getNome(String nome){
        this.nome = nome;
    }
    public String getSexo(){
        return this.sexo;
    }
    public void setexo(String sexo){
        this.sexo=sexo;
    }
    public int getIdade(){
        return this.idade;
    }
    public void setIdade(){
        this.idade = idade;
    }

    public String toString(){
        return "nome: "+nome+"\n Sexo: "+sexo+"\n Idade: "+idade;
    }
    
}
