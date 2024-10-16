import java.time.LocalTime;

public class Treino {
    
    //Atributos 
    private String musculo; 
    private String descricao; 
    private LocalTime duracao; 
    private boolean concluido; 


    //Construtor
    public Treino (String musculo, String descricao, LocalTime duracao){
        this.musculo = musculo; 
        this.descricao = descricao; 
        this.duracao = duracao; 
    }
    

    

    //Getter's e Setter's

    public String getMusculo() {
        return musculo;
    }

    
    public void setMusculo(String musculo) {
        this.musculo = musculo;
    }

    
    public String getDescricao() {
        return descricao;
    }

    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    
    public LocalTime getDuracao() {
        return duracao;
    }

   
    public void setDuracao(LocalTime duracao) {
        this.duracao = duracao;
    }




    public boolean isConcluido() {
        return concluido;
    }




    public void setConcluido(boolean concluido) {
        this.concluido = concluido;
    }

    

}
