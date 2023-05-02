import java.util.ArrayList;
import java.util.List;

public class Departamento { //representa um departamento da empresa
    private NomeDepartamento nomeDep;
    private List<Funcionario> funcionarios;

    public Departamento(NomeDepartamento nome) {
        this.nomeDep = nome;
        this.funcionarios = new ArrayList<>();
    }

    public NomeDepartamento getNome() {
        return nomeDep;
    }

    public void setNome(NomeDepartamento nome) {
        this.nomeDep = nome;
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    public void addFuncionario(Funcionario funcionario) {
        this.funcionarios.add(funcionario);
    }

    public void removeFuncionario(Funcionario funcionario) {
        this.funcionarios.remove(funcionario);
    }

    @Override
    public String toString() {
        return "Departamento [nomeDep=" + nomeDep + ", funcionarios=" + funcionarios + "]";
    }

}
