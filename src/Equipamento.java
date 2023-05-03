import java.time.LocalDate;

public class Equipamento {  //representa um equipamento da empresa
    private int id;
    private static int proximoID = 1000;
    private String descricao;
    private LocalDate dataAquisicao;
    private String setorInstalado;
    

    public Equipamento(String descricao, String setorInstalado) {
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

    public String getSetor(){
        return setorInstalado;
    }

    public boolean setSetor (String novoSetor) {
        if(setorInstalado.equals(novoSetor))
            return false;
        setorInstalado = novoSetor;
        return true;
    }

    @Override
    public String toString() {
        return "Equipamento [id=" + id + ", descricao=" + descricao + ", dataAquisicao=" + dataAquisicao
                + ", setorInstalado=" + setorInstalado + "]";
    }
    
}
