import java.time.LocalDate;

public class Chamado {
    private int id;
    private static int proximoID=0;
    private Funcionario funcionarioAbertura;
    private Equipamento equipamento;
    private LocalDate dataSolicitacao;
    private String descricao;
    private String resolucao;
    private StatusChamado status;

    public Chamado(Funcionario funcionarioAbertura, Equipamento equipamento, String descricao) {
        this.id = proximoID++;
        this.funcionarioAbertura = funcionarioAbertura;
        this.equipamento = equipamento;
        this.dataSolicitacao = LocalDate.now();
        this.descricao = descricao;
        this.status = StatusChamado.ABERTO;
    }

    public int getId() {
        return id;
    }

    public Funcionario getFuncionarioAbertura() {
        return funcionarioAbertura;
    }

    public Equipamento getEquipamento() {
        return equipamento;
    }

    public LocalDate getDataSolicitacao() {
        return dataSolicitacao;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getResolucao() {
        return resolucao;
    }

    // após terminar um chamado deve chamar esse método para descrever a resolução.
    public void setResolucao(String resolucao) {
        this.resolucao = resolucao;
    }

    public StatusChamado getStatus() {
        return status;
    }

    // após algum funcionário pegar o chamado ou terminar, deve-se alterar o status.
    public void setStatus(StatusChamado status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Chamado [id=" + id + ", funcionarioAbertura=" + funcionarioAbertura + ", equipamento=" + equipamento
                + ", dataSolicitacao=" + dataSolicitacao + ", descricao=" + descricao + ", resolucao=" + resolucao
                + ", status=" + status + "]";
    }
}
