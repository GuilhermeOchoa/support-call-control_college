public class Funcionario { //representa um funcionário da empresa
    private int id;
    private String nome;
    private Departamento departamento;
    private Boolean equipeSuporte;
    private static int proximoID=1;

    public Funcionario(String nome, Departamento departamento, Boolean equipeSuporte) {
        this.id = proximoID++;
        this.nome = nome;
        this.departamento = departamento;
        this.equipeSuporte = equipeSuporte;
    }
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public Departamento getDepartamento() {
        return departamento;
    }
    
    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public boolean isSuport(){
        return(equipeSuporte);
    }

    @Override
    public String toString() {
        return "Funcionario [id=" + id + ", nome=" + nome + ", departamento=" + departamento + ", equipeSuporte="
                + equipeSuporte + "]";
    }
    
}