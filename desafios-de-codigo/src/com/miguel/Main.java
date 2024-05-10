package com.miguel;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha uma das quatros opções: ");

        System.out.println("1. Depositar");
        System.out.println("2. Sacar");
        System.out.println("3. Cosultar saldo");
        System.out.println("4. Encerrar");

        System.out.println("Opção: ");
        int opcao = scanner.nextInt();


        while (opcao != 4) {

            System.out.println("While funcionando");


            
            System.out.println("Opção: ");
            opcao = scanner.nextInt();
        }
    }
}
