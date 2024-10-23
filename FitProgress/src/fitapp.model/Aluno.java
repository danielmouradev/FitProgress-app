import java.time.LocalDate;

import javax.xml.crypto.Data;

public class Aluno {

    // Atributos
    private String nome;
    private String cpf; 
    private int matricula;
    private LocalDate dataNasc;
    private String email;
    private String telefone;

    public Aluno(String nome, int matricula, LocalDate dataNasc, String email, String telefone) {
        this.nome = nome;
        this.matricula = matricula;
        this.dataNasc = dataNasc;
        this.email = email;
        this.telefone = telefone;
    }

    public Aluno(){}

    // Getter's e Setter's
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getMatricula() {
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

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Aluno [nome=" + nome + ", cpf=" + cpf + ", matricula=" + matricula + ", dataNasc=" + dataNasc
                + ", email=" + email + ", telefone=" + telefone + "]";
    }

    

}