package com.api.nome;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.util.Scanner;

@SpringBootApplication
@ComponentScan(basePackages = "com.api.nome")
public class ApiNomeCpfApplication {

    private static PersonService personService;

    public ApiNomeCpfApplication(PersonService personService) {
        ApiNomeCpfApplication.personService = personService;
    }

    public static void main(String[] args) {
        SpringApplication.run(ApiNomeCpfApplication.class, args);
        menu();
    }

    @SuppressWarnings("resource")
    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        String nome;
        String cnh;
        String criminais;
        String nomeFilho;
        String endereco;
        String placa;
        String nomeEscola;

        while (true) {
            System.out.println("\n*** BEM VINDO AO PROJETO CARONA! ***");
            System.out.println("******* Selecione uma opção: *******");
            System.out.println("1. Cadastrar");
            System.out.println("2. Consultar");
            System.out.println("0. Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do Scanner

            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome do pai/mãe:");
                    nome = scanner.nextLine();
                    System.out.println("Digite o número da sua carteira de habilitação (CNH):");
                    cnh = scanner.nextLine().substring(0, 11);
                    System.out.println("Digite o atestado de antecedentes criminais:");
                    criminais = scanner.nextLine();
                    System.out.println("Digite o nome do filho:");
                    nomeFilho = scanner.nextLine();
                    System.out.println("Digite o Endereço:");
                    endereco = scanner.nextLine();
                    System.out.println("Digite a placa do carro:");
                    placa = scanner.nextLine();
                    System.out.println("Digite o nome da Escola/Faculdade:");
                    nomeEscola = scanner.nextLine();

                    // Adicione a opção de escolha da disponibilidade de horário
                    System.out.println("Escolha a disponibilidade de horário:");
                    System.out.println("1. Escola (7:00)");
                    System.out.println("2. Futebol (14:00)");
                    System.out.println("3. Faculdade (18:00)");
                    System.out.print("Escolha uma opção (1, 2 ou 3): ");
                    int opcaoDisponibilidade = scanner.nextInt();
                    scanner.nextLine(); // Limpar o buffer do Scanner

                    String disponibilidade;
                    switch (opcaoDisponibilidade) {
                        case 1:
                            disponibilidade = "Escola (7:00)";
                            break;
                        case 2:
                            disponibilidade = "Futebol (14:00)";
                            break;
                        case 3:
                            disponibilidade = "Faculdade (18:00)";
                            break;
                        default:
                            disponibilidade = "Opção inválida";
                            break;
                    }

                    addPerson(nome, cnh, criminais, nomeFilho, endereco, placa, nomeEscola, disponibilidade);
                    break;
                case 2:
                    System.out.println("Favor, consultar os dados no banco MySQL!");
                    break;
                case 0:
                    System.out.println("Obrigado por usar o sistema Marta!");
                    return;
                default:
                    System.out.println("Opção inválida. Digite novamente.");
                    break;
            }
        }
    }

    public static void addPerson(String nome, String cnh, String criminais, String nomeFilho, String endereco, String placa, String nomeEscola, String disponibilidade) {
        Person person = new Person(nome, cnh, criminais, nomeFilho, endereco, placa, nomeEscola, disponibilidade);
        personService.savePerson(person);
        System.out.println("Pessoa adicionada com sucesso!");
    }
}
