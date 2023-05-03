import java.time.LocalDate;

public class Equipamento {  //representa um equipamento da empresa
    private int id;
    private static int proximoID = 1000;
    private String descricao;
    private LocalDate dataAquisicao;
    private Departamento setorInstalado;
    

    public Equipamento(String descricao, Departamento setorInstalado) {
        this.id = proximoID++;
        this.descricao = descricao;
        this.dataAquisicao = LocalDate.now();
        this.setorInstalado = setorInstalado;
    }

    public int getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public LocalDate getDataAquisicao() {
        return dataAquisicao;
    }

    public Departamento getDepartamentoInstalado(){
        return setorInstalado;
    }

    public void setDepartamentoInstalado(Departamento setorNovo){
       setorInstalado = setorNovo;
    }

    @Override
    public String toString() {
        return "Equipamento [id=" + id + ", descricao=" + descricao + ", dataAquisicao=" + dataAquisicao
                + ", setorInstalado=" + setorInstalado + "]";
    }
    
}
