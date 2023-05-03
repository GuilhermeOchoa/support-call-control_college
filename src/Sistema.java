import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sistema { // representa o sistema de acompanhamento de chamados de suporte a equipamentos
    private Funcionario usuarioAtual;
    private List<Funcionario> funcionarios;
    private List<Equipamento> equipamentos;
    private List<Chamado> chamados;

    public Sistema() {
        funcionarios = new ArrayList<Funcionario>();
        equipamentos = new ArrayList<Equipamento>();
        chamados = new ArrayList<Chamado>();

        // Inicializa o sistema com alguns DEPARTMAENTOS preenchidos
        Departamento rh = new Departamento(NomeDepartamento.RH);
        Departamento administrativo = new Departamento(NomeDepartamento.ADMINISTRATIVO);
        Departamento financeiro = new Departamento(NomeDepartamento.FINANCEIRO);
        Departamento operacional = new Departamento(NomeDepartamento.OPERACIONAL);
        Departamento comercial = new Departamento(NomeDepartamento.COMERCIAL);
        Departamento TI = new Departamento(NomeDepartamento.TI);

        // Inicializa o sistema com alguns FUNCIONÁRIOS preenchidos
        Funcionario f1 = new Funcionario("João", rh, false);
        Funcionario f2 = new Funcionario("Maria", administrativo, false);
        Funcionario f3 = new Funcionario("Pedro", financeiro, false);
        Funcionario f4 = new Funcionario("Pedro", operacional, false);
        Funcionario f5 = new Funcionario("Pedro", comercial, false);
        Funcionario f6 = new Funcionario("Pedro", TI, true);
        funcionarios.add(f1);
        funcionarios.add(f2);
        funcionarios.add(f3);
        funcionarios.add(f4);
        funcionarios.add(f5);
        funcionarios.add(f6);

        // Inicializa o sistema com alguns EQUIPAMENTOS preenchidos
        Equipamento e1 = new Equipamento("Computador", "RH");
        Equipamento e2 = new Equipamento("Impressora", "Secretaria");
        Equipamento e3 = new Equipamento("Projetor", "Sala de Reuniões");
        equipamentos.add(e1);
        equipamentos.add(e2);
        equipamentos.add(e3);

        // Inicializa o sistema com alguns CHAMADOS preenchidos
        Chamado c1 = new Chamado(f1, e1, "Computador lento");
        Chamado c2 = new Chamado(f2, e2, "Impressora com problema de papel");
        Chamado c3 = new Chamado(f3, e3, "Projetor não liga");
        chamados.add(c1);
        chamados.add(c2);
        chamados.add(c3);
    }

    // O sistema deverá permitir escolher de uma lista qual o funcionário que está
    // usando o sistema naquele momento (facilitando para não precisar implementar
    // mecanismos de login).
    public void selecionarUsuario(Funcionario usuarioAtual) {}



    // O sistema deverá permitir abrir um novo chamado. Cada chamado deve conter os
    // dados descritos na seção de detalhamento acima. O status de um chamado flui
    // apenas em uma direção: aberto -> em andamento -> concluído.
    public void abrirChamado(Equipamento equipamento, String descricao) {
        Chamado chamado = new Chamado(usuarioAtual, equipamento, descricao);
        chamados.add(chamado);
    }



    // O sistema deverá permitir que um funcionário da equipe de suporte atualize o
    // status de um chamado, mudando-o para “em andamento” ou para “concluído”.
    public void atualizarStatusChamado(Chamado chamado) {
        StatusChamado c= chamado.getStatus();
        if (c == StatusChamado.ABERTO){
            StatusChamado novoStatus=StatusChamado.EM_ANDAMENTO;
            chamado.setStatus(novoStatus);
            return;
        }
        if (c == StatusChamado.EM_ANDAMENTO){
            StatusChamado novoStatus=StatusChamado.CONCLUIDO;
            chamado.setStatus(novoStatus);
            return;
        }
    }



    // O sistema deverá permitir mover um equipamento de um setor para outro.
    // Somente funcionários da equipe de suporte poderão mover equipamentos
    public void moverEquipamento(Equipamento equipamento, String novoSetor) {
        if(usuarioAtual.isSuport()){
            equipamento.setSetor(novoSetor);
        }
    }



    // O sistema deverá permitir pesquisar equipamentos pela descrição (Ex.
    // pesquisar por “impressora”)
    public List<Equipamento> pesquisarEquipamentos(String descricao) {
        ArrayList<Equipamento> equipamentosEncontrados = new ArrayList<Equipamento>();

        for (Equipamento equipamento : equipamentos) {
            if (equipamento.getDescricao().contains(descricao)) {
                equipamentosEncontrados.add(equipamento);
            }
        }
        
        return equipamentosEncontrados;
    }



    // O sistema deverá permitir listar todos os chamados de um determinado
    // equipamento. A listagem deverá ocorrer da mais antiga à mais recente. Todos
    // os detalhes dos chamados deverão ser exibidos.
    public List<Chamado> listarChamadosPorEquipamento(Equipamento equipamento) { //TODO implementar a listagem disso no menu

        List<Chamado> chamadosPorEquipamento = new ArrayList<>();
        for (Chamado chamado : chamados) {
            if (chamado.getEquipamento().equals(equipamento)) {
                chamadosPorEquipamento.add(chamado);
            }
        }
        Collections.sort(chamadosPorEquipamento, new Comparator<Chamado>() {
            @Override
            public int compare(Chamado chamado, Chamado chamado2) {
                return chamado.getDataSolicitacao().compareTo(chamado2.getDataSolicitacao());
            }
        });

        return chamadosPorEquipamento;

    }



    // O sistema deverá permitir localizar chamados por uma palavra-chave. A busca
    // deverá ocorrer sobre os campos de nome do funcionário, descrição do
    // equipamento, nome do setor, texto da solicitação, texto da resolução
    public List<Chamado> localizarChamadosPorPalavraChave(String palavraChave) {}



    // O sistema deverá permitir ao usuário visualizar um painel com os seguintes
    // dados: (a) total de chamados registrados; (b) nro e percentual de chamados
    // atualmente no status de “aberto”; (c) idem para status de “em andamento”; (d)
    // idem para o status de “concluído”; (e) número médio de chamados concluídos
    // por dia
    public void exibirPainel() {}

    

    //  Deve-se criar duas funcionalidades a mais, à escolha do grupo.

}
