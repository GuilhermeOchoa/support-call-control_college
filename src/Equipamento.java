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

    public String getSetorInstalado(){
        return setorInstalado;
    }

    public boolean setSetorInstalado(String novoSetor){
        //Verifica se o equipamento já está no setor
        if(setorInstalado.equals(novoSetor))
            return false;
        //Altera o setor instalado pelo novo setor
        setorInstalado = novoSetor;
        return true;
    }

    @Override
    public String toString() {
        return "Equipamento [id=" + id + ", descricao=" + descricao + ", dataAquisicao=" + dataAquisicao
                + ", setorInstalado=" + setorInstalado + "]";
    }
    
}
