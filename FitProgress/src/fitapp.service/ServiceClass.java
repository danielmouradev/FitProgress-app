import java.util.ArrayList;
import java.util.List;

public class ServiceClass {

    private EnumTreino tipoTreino;
    private Aluno aluno;
    private Treino treino;
    private List<Treino> listaTreino;

    public ServiceClass() {
        this.listaTreino = new ArrayList<>();
    }

    public ServiceClass(EnumTreino tipoTreino) {
        this.tipoTreino = tipoTreino;
    }

    public void cadastrarTreino(Integer id, String[] exercicios) {
        if (id != null) {
            EnumTreino enumTreino = EnumTreino.fromValor(id);
            System.out.println("Treino de " + enumTreino.toLowerCase() + " cadastrado com sucesso!");
            System.out.println();
        } else if (id == null) {
            System.out.println("Não é possível cadastrar com um id nulo!");
        }
    }

    public void descreverTreino(String descricao) {
       this.treino = new Treino();
       this.treino.setDescricao(descricao);
       descricao = this.treino.getDescricao();
       System.out.println("-----------Descrição cadastrada-----------: " + descricao);
    }

    public void cadastrarAluno(String cpf) {
        this.aluno = new Aluno();
        this.aluno.setCpf(cpf);
        cpf = this.aluno.getCpf();
        System.out.println();
        System.out.println("------------ Aluno cadastrado através do cpf ----------------");
    }

    /*public List<Treino> listarTreino(Integer id) {
        this.treino = new Treino();
        return listaTreino;
    }*/

    

    public void setListaTreino(List<Treino> listaTreino) {
        this.listaTreino = listaTreino;
    }

    public List<Treino> getListaTreino() {
        return listaTreino;
    }

    

}
