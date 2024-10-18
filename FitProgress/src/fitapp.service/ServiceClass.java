import java.util.ArrayList;
import java.util.List;

public class ServiceClass {
    


    private EnumTreino tipoTreino; 
    private Aluno aluno; 
    private Treino treino; 
    private List<Treino> listaTreino;

    public ServiceClass(){
        this.listaTreino = new ArrayList<>();
    }

    public ServiceClass(EnumTreino tipoTreino){
        this.tipoTreino = tipoTreino;
    }

    public void cadastrarTreino(Integer id){
        if (id != null) {
            EnumTreino enumTreino = EnumTreino.fromValor(id);
            System.out.println("Treino de " + enumTreino.toLowerCase() + " cadastrado com sucesso!");
            System.out.println();
        }else if (id == null) {
            System.out.println("Não é possível cadastrar com um id nulo!");
        }
    }

    public void descreverTreino(EnumTreino muscle){}

    public void cadastrarAluno(String cpf){}

    public List<Treino> listarTreino(){
        return listaTreino;
    }

}
