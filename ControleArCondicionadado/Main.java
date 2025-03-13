package ControleArCondicionadado;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Splinter> list1 = new ArrayList<>();
        ArrayList<Portatil> list2 = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;
        int menu = 0;

        while (opcao != 3) {
            // Menu principal
            System.out.println("1 - CADASTRAR AR CONDICIONADO");
            System.out.println("2 - RELÁTORIOS");
            System.out.println("3 - FECHAR PROGRAMA");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    // Cadastro de ar condicionado
                    System.out.println("Você escolheu: Cadastrar Ar Condicionado\n");
                    System.out.println("Qual Modelo deseja Cadastrar?");
                    System.out.println("1 - ESPLINTER");
                    System.out.println("2 - PORTATIL");
                    menu = scanner.nextInt();

                    // Verificando a escolha do modelo e adicionando na lista
                    if (menu == 1) {
                        // Coleta de dados para cadastro de ESPLINTER
                        System.out.println("Modelo: ");
                        scanner.nextLine();  // Limpar o buffer do scanner
                        String modelo = scanner.nextLine();

                        System.out.println("Código: ");
                        String codigo = scanner.nextLine();

                        System.out.println("Marca: ");
                        String marca = scanner.nextLine();

                        System.out.println("Digite a potência (em W): ");
                        double btu = scanner.nextDouble();

                        System.out.println("Tamanho: ");
                        scanner.nextLine();  // Limpar o buffer do scanner
                        String tamanho = scanner.nextLine();

                        System.out.println("Tipo: ");
                        String tipo = scanner.nextLine();

                        Splinter splinter = new Splinter(modelo, codigo, marca, btu, tamanho, tipo);
                        list1.add(splinter);
                        System.out.println("Ar Condicionado ESPLINTER cadastrado com sucesso!");
                        
                    } else if (menu == 2) {
                         // Coleta de dados para cadastro de PORTÁTIL
                         System.out.println("Modelo: ");
                         scanner.nextLine();  
                         String modelo = scanner.nextLine();

                         System.out.println("Código: ");
                         String codigo = scanner.nextLine();

                         System.out.println("Marca: ");
                         String marca = scanner.nextLine();

                         System.out.println("Digite a potência (em W): ");
                         double btu = scanner.nextDouble();

                         System.out.println("Voltagem: ");
                         scanner.nextLine(); 
                         String voltagem = scanner.nextLine();

                         System.out.println("Cor: ");
                         String cor = scanner.nextLine();

                         Portatil portatil = new Portatil(modelo, codigo, marca, btu, voltagem, cor);
                         list2.add(portatil);
                         System.out.println("Ar Condicionado PORTÁTIL cadastrado com sucesso!");
                    } else {
                        System.out.println("Opção inválida para o modelo.");
                    }
                    break;

                case 2:
                    // Relatórios
                    System.out.println("Você escolheu: Relatórios\n");
                    System.out.println("Ar Condicionados ESPLINTER cadastrados:");
                    if (list1.isEmpty()){
                        System.out.println("Não há Ar condicionado Splinter cadastrado.");
                    }else {
                        for (Splinter splinter: list1){
                            splinter.ExibiInfo();
                        }
                    }

                    if (list2.isEmpty()){
                        System.out.println("Não há Ar condicionado Portatil cadastrado.");
                    } else {
                        for (Portatil portatil: list2){
                            portatil.ExibiInfo();
                        }
                    }

                    break;

                case 3:
                    System.out.println("Fechando o programa...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
        scanner.close();
    }
}
