package com.arclou;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] event = new String[3];
        int option = 0;

        do {
            System.out.println("========================");
            System.out.println("        ARCLOU          ");
            System.out.println("========================");
            System.out.println(" ");
            System.out.println("1 - Criar evento");
            System.out.println("2 - Listar eventos");
            System.out.println("3 - Buscar evento");
            System.out.println("4 - Sair");
            System.out.println(" ");

            System.out.print("Escolha: ");

            if (sc.hasNextInt()) {
                option = sc.nextInt();
                sc.nextLine();
                if (option <= 0 || option > 4) {
                    System.out.println("Erro: As opções são somente entre 1 a 4.");
                } else if (option > 1) {
                    System.out.println("Em construção...");
                } else {
                    System.out.println("Informe os dados do evento:");
                    System.out.print("Nome: ");
                    event[0] = sc.nextLine();

                    System.out.print("Data: ");
                    event[1] = sc.nextLine();

                    System.out.print("Local: ");
                    event[2] = sc.nextLine();

                    System.out.println("Evento registrado com sucesso: " + event[0] + " | " + event[1] + " | " + event[2]);
                }
            } else {
                String invalidInput = sc.next();
                System.out.println("Erro: '" + invalidInput + "' não é uma das opções acima.");
            }

        } while (option != 4);

        System.out.println("Obrigado!!!");

        sc.close();
    }
}
