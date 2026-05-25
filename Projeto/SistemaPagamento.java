import java.util.Scanner;

public class SistemaPagamento {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Colaborador.dadosMock();

        boolean loop = true;

        System.out.println("===== SISTEMA DE FOLHA DE PAGAMENTO =====");

        do {

            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Cadastrar colaborador");
            System.out.println("2 - Listar colaboradores");
            System.out.println("3 - Buscar por registro");
            System.out.println("0 - Sair");

            int escolha = sc.nextInt();

            switch (escolha) {

                case 1:
                    Colaborador.cadastrar(sc);
                    break;

                case 2:
                    Colaborador.listarTodos();
                    break;

                case 3:
                    Colaborador.buscarPorRegistro(sc);
                    break;

                case 0:
                    loop = false;
                    System.out.println("Encerrando sistema...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        } while (loop);

        sc.close();
    }
}