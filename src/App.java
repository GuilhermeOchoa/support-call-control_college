import java.text.ParseException;
import java.time.LocalDate;
import java.util.Scanner;

class App {
    private Scanner entrada;
    private Sistema sistema;
    private Funcionario funcionario;

    public App() {
        sistema= new Sistema();
        entrada=new Scanner(System.in);
    }

    public void executa() {
        int opcao =10 ;
        do {
            menu();
            try {
                opcao = entrada.nextInt();
                entrada.nextLine();
                switch (opcao) {
                    case 0 -> selecionarFuncionario();
                    case 1 -> abrirNovoChamado();
                    case 2 -> atualizaStatusChamdo();
                    case 3 -> moveEquipamento();
                    case 4 -> pesquisaEquipamentoDesc();
                    case 5 -> listaTodosChamados();
                    case 6 -> localizarChamadoPalavraChave();
                    case 7 -> visualizarPainel();
                    case 8 -> novaFuncionalidade1();
                    case 9 -> novaFuncionalidade2();
                    case 10 -> System.out.println("Saindo do programa!");
                    default -> System.out.println("Opcao invalida.");
                }
            } catch (Exception e) {
                System.out.println("Entrada invalida: " + e.getMessage());
                entrada.nextLine();

            }
        }while (opcao != 10);

    }
    public void menu () {
        System.out.println("======================================");
        System.out.println("Opcoes:");
        System.out.println("[0] Selecionar o funcionário");
        System.out.println("[1] Abrir novo chamado");
        System.out.println("[2] Atualizar Status do chamado");
        System.out.println("[3] Mover equipamento de um setor para outro");
        System.out.println("[4] Pesquisar equipamento pela descrição");
        System.out.println("[5] Listar todos os chamados de um equipamento");
        System.out.println("[6] Localizar chamado por palavra chave");
        System.out.println("[7] Visualizar painel");
        System.out.println("[8] Funcionalidade a mais, à escolha do grupo");
        System.out.println("[9] Funcionalidade a mais, à escolha do grupo");

        System.out.println("[4] Sair do programa");
        System.out.println("Opcao desejada: ");

    }

    private void novaFuncionalidade2() {
    }

    private void novaFuncionalidade1() {
    }

    private void visualizarPainel() {
    }

    private void localizarChamadoPalavraChave() {
    }

    private void listaTodosChamados() {
    }

    private void pesquisaEquipamentoDesc() {
    }

    private void moveEquipamento() {
    }

    private void atualizaStatusChamdo() {

    }

    private void abrirNovoChamado() {

    }

    private void selecionarFuncionario() {
        // sistema.selecionarUsuario(funcionario);

    }




}
