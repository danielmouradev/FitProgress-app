import java.time.LocalDate;

import javax.xml.crypto.Data;

public class Aluno {

    //Atributos
    private String nome; 
    private int matricula; 
    private LocalDate dataNasc; 
    private String email; 
    private String senha; 


    public Aluno(String nome, int matricula, LocalDate dataNasc, String email, String senha){
        this.nome = nome; 
        this.matricula = matricula; 
        this.dataNasc = dataNasc; 
        this.email = email; 
        this.senha = senha; 
    }

    //Método da classe
    public void cadastrarTreino(Treino treino){}


    //Getter's e Setter's
    public String getNome() {
        return nome;
    }

    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMatricula(int matricula){
        this.matricula = matricula; 
    }

    public int getMatricula(){
        return matricula; 
    }
    

    public LocalDate getDataNasc() {
        return dataNasc;
    }

    
    public void setDataNasc(LocalDate dataNasc) {
        this.dataNasc = dataNasc;
    }

    
    public String getEmail() {
        return email;
    }

   
    public void setEmail(String email) {
        this.email = email;
    }

    
    public String getSenha() {
        return senha;
    }

    
    public void setSenha(String senha) {
        this.senha = senha;
    }

}