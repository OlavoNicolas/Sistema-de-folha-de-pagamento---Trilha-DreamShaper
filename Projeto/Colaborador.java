import java.util.ArrayList;
import java.util.Scanner;

public class Colaborador {

    private int numeroRegistro;
    private String nome;
    private String tipoFuncionario;
    private double salario;

    private static final double SALARIO_BASE = 2000.0;

    private static ArrayList<Colaborador> colaboradores = new ArrayList<>();


    public Colaborador(int numeroRegistro, String nome, String tipoFuncionario, double salario) {

        this.numeroRegistro = numeroRegistro;
        this.nome = nome;
        this.tipoFuncionario = tipoFuncionario;
        this.salario = salario;
    }


    
    public static void cadastrar(Scanner sc) {

        System.out.println("\n===== CADASTRO DE COLABORADOR =====");

        System.out.print("Digite o número de registro: ");
        int numeroRegistro = sc.nextInt();
        sc.nextLine();

        
        for (Colaborador c : colaboradores) {

            if (c.numeroRegistro == numeroRegistro) {

                System.out.println("ERRO! Registro já cadastrado.");
                return;
            }
        }

        System.out.print("Digite o nome completo: ");
        String nome = sc.nextLine();

        int escolha;

        do {

            System.out.println("\nTipo de funcionário:");
            System.out.println("1 - Funcionário padrão");
            System.out.println("2 - Funcionário comissionado");
            System.out.println("3 - Funcionário produção");

            escolha = sc.nextInt();

        } while (escolha < 1 || escolha > 3);

        String tipoFuncionario = "";
        double salarioFinal = SALARIO_BASE;

        switch (escolha) {

            case 1:

                tipoFuncionario = "Funcionário Padrão";
                break;

            case 2:

                tipoFuncionario = "Funcionário Comissionado";
                salarioFinal = calcularSalarioComissionado(sc);
                break;

            case 3:

                tipoFuncionario = "Funcionário Produção";
                salarioFinal = calcularSalarioProducao(sc);
                break;
        }

        Colaborador novoColaborador =
                new Colaborador(numeroRegistro, nome, tipoFuncionario, salarioFinal);

        colaboradores.add(novoColaborador);

        System.out.println("\nColaborador cadastrado com sucesso!");
    }


    
    public static void listarTodos() {

        if (colaboradores.isEmpty()) {

            System.out.println("\nNenhum colaborador cadastrado.");
            return;
        }

        System.out.println("\n========== LISTA DE COLABORADORES ==========");

        for (Colaborador c : colaboradores) {

            System.out.printf(
                    "Registro: %-5d | Nome: %-25s | Tipo: %-28s | Salário: R$ %.2f%n",
                    c.numeroRegistro,
                    c.nome,
                    c.tipoFuncionario,
                    c.salario
            );
        }

        System.out.println("============================================");
    }


    
    public static void buscarPorRegistro(Scanner sc) {

        System.out.print("\nDigite o número de registro: ");
        int registroBusca = sc.nextInt();

        for (Colaborador c : colaboradores) {

            if (c.numeroRegistro == registroBusca) {

                System.out.println("\n===== REGISTRO ENCONTRADO =====");

                System.out.println("Registro: " + c.numeroRegistro);
                System.out.println("Nome: " + c.nome);
                System.out.println("Tipo: " + c.tipoFuncionario);
                System.out.printf("Salário: R$ %.2f%n", c.salario);

                return;
            }
        }

        System.out.println("Registro não encontrado.");
    }


    
    public static double calcularSalarioComissionado(Scanner sc) {

        System.out.print("Digite o valor das vendas: ");
        double vendas = sc.nextDouble();

        System.out.print("Digite o percentual de comissão: ");
        double percentual = sc.nextDouble();

        double comissao = vendas * percentual / 100;

        return SALARIO_BASE + comissao;
    }


    
    public static double calcularSalarioProducao(Scanner sc) {

        System.out.print("Digite o valor por peça: ");
        double valorPeca = sc.nextDouble();

        System.out.print("Digite a quantidade produzida: ");
        double quantidadeProduzida = sc.nextDouble();

        double bonus = valorPeca * quantidadeProduzida;

        return SALARIO_BASE + bonus;
    }


    
    public static void dadosMock() {

        colaboradores.add(new Colaborador(
                        
                        1001,
                        "Carlos Henrique Souza",
                        "Funcionário Padrão",
                        3500.00
                )
        );

        colaboradores.add(new Colaborador(
                  
                        1002,
                        "Mariana Oliveira Lima",
                        "Funcionário Comissionado",
                        4200.50
                )
        );

        colaboradores.add(new Colaborador(
                        
                        1003,
                        "João Pedro Martins",
                        "Funcionário Produção",
                        2800.75
                )
        );

        colaboradores.add(new Colaborador(

                        1004,
                        "Fernanda Alves Costa",
                        "Funcionário Padrão",
                        3900.00
                )
        );
    }
}