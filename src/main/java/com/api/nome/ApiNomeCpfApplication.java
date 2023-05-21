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

        while (true) {
            System.out.println("*** BEM VINDO AO PROJETO CARONA! ***");
            System.out.println("******* Selecione uma opção: *******");
            System.out.println("1. Adicionar pessoa");
            System.out.println("0. Sair");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome do pai:");
                    nome = scanner.next();
                    System.out.println("Digite o número da sua carteira de habilitação:");
                    cnh = scanner.next();                
                    System.out.println("Digite o atestado de antecedentes criminais:");
                    criminais = scanner.next();
                    System.out.println("Digite o nome do filho:");
                    nomeFilho = scanner.next();
                    addPerson(nome, cnh, criminais, nomeFilho);
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

    public static void addPerson(String nome, String cnh , String criminais, String nomeFilho) {
        Person person = new Person(nome, cnh, criminais, nomeFilho);
        personService.savePerson(person);
        System.out.println("Pessoa adicionada com sucesso!");
    }
}
