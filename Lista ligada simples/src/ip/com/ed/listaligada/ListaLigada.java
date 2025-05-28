/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ip.com.ed.listaligada;

/**
 *
 * @author Marcos21
 */
public class ListaLigada {
    private Elemento primeiro;
    private Elemento ultimo;
    private int tamanho;
    
    public ListaLigada(){
        this.primeiro=null;
        this.ultimo=null;
        this.tamanho=0;
    }
    
    public int tamanho(){
        return this.tamanho;
    }
    
    public boolean listaVazia(){
        return this.tamanho ==0;
    }
    public boolean inserirIni(Pessoa pessoa){
        Elemento novo = new Elemento(pessoa);
        if(this.listaVazia()){
            this.primeiro = novo;
            this.ultimo = novo;
        }else{
            novo.setProximo(this.primeiro);
            this.primeiro=novo; 
        }
        this.tamanho++;
        return true;
        
    }
    public boolean inserirFim(Pessoa pessoa){
        Elemento novo =new Elemento(pessoa);
        if(this.listaVazia()){
            this.primeiro=novo;
            this.ultimo=novo;
        }else{
            this.ultimo.setProximo(novo);
            this.ultimo=novo;
        }
        this.tamanho++;
        return true;
    }
    public boolean removerIni(){
        if(this.listaVazia()){
            return false;
        }
        if(this.primeiro==this.ultimo){
            this.primeiro=null;
            this.ultimo=null;
        }else{
          this.primeiro=this.primeiro.getProximo();
        }
        this.tamanho--;
        return true;
    }
    public boolean removerFim(){
        if(this.listaVazia()){
            return false;
        }
        if(this.primeiro==this.ultimo){
            this.primeiro=null;
            this.ultimo=null;
        }else{
            Elemento atual = this.primeiro;
            while(atual.getProximo() != this.ultimo){
                atual=atual.getProximo();
            }
            atual.setProximo(null);
            this.ultimo=atual;
        }
        this.tamanho--;
        return true;
    }
    public boolean inserirEm(int pos, Pessoa pessoa){
        if(pos < 0 || pos > this.tamanho){
            return false;
        }
        Elemento novo = new Elemento(pessoa);
        if(pos == 0){
            novo.setProximo(this.primeiro);
            this.primeiro = novo;
            if(this.tamanho == 0){
            this.ultimo = novo;
            }
        }else{
            Elemento atual = this.primeiro;
            for(int i=0;i < pos -1; i++){
                atual=atual.getProximo();
            }
            novo.setProximo(atual.getProximo());
            atual.setProximo(novo);
            if(novo.getProximo()==null){
                this.ultimo=novo;
            }
        }
        this.tamanho++;
        return true;
    }
    public boolean removerEm(int pos, Pessoa pessoa){
        if(pos < 0 || pos > this.tamanho){
            return false;
        }
        if(pos == 0){
            if(this.primeiro==this.ultimo){
                this.ultimo = this.ultimo = null;
            }else{
            this.primeiro=this.primeiro.getProximo();
            } 
        }else{
            Elemento atual = this.primeiro;
            for(int i=0; i < pos -1;i++){
                atual=atual.getProximo();
            }
            Elemento remover = atual.getProximo();
            atual.setProximo(remover.getProximo());
            if(remover == this.ultimo){
                this.ultimo = atual;
            }
        }
        this.tamanho--;
        return true;
    }
    public void buscar(String nome){
        Elemento atual = this.primeiro;
        while(atual != null){
            if(atual.getPessoa().getNome().equalsIgnoreCase(nome)){
                System.out.println("Encontrado! "+atual.getPessoa().getNome()+", Tem "+atual.getPessoa().getIdade()+" anos");
                return;
            }
            atual = atual.getProximo();
        }
        System.out.println("Pessoa com o nome "+nome+" não foi enocntrado"); 
    }
    
    
    
    public void imprimir(){
        if(this.listaVazia()){
            System.out.println("Lista vazia!");
            return;
        }
        Elemento atual = this.primeiro;
        while(atual != null){
            System.out.println("--------------------------------------------");
            System.out.println("Nome: "+atual.getPessoa().getNome());
            System.out.println("Sexo: "+atual.getPessoa().getSexo());
            System.out.println("Idade: "+atual.getPessoa().getIdade());
            atual = atual.getProximo();
            
        }
    }
    
}
