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

        int saldo = 0;
        int sacar;

        while (opcao != 4) {
            switch (opcao) {

                case 1: {
                    System.out.println("Qual valor deseja depositar: ");
                    saldo = scanner.nextInt();

                    System.out.println("Valor de " + saldo + " depositado com sucesso");
                    break;
                }
                case 2: {
                    System.out.println("Qual valor deseja sacar: ");
                    sacar = scanner.nextInt();

                    if (sacar > saldo ) {
                        System.out.println("Saldo insuficiente");
                    }else {
                        saldo = saldo - sacar;
                        System.out.println("Valar de " + saldo + " sacado com sucesso");
                    }
                    break;
                }
                case 3: {
                    System.out.println("Seu saldo é de " + saldo);
                    break;
                }
                default: {
                    System.out.println("Indefido");
                }
            }

            System.out.println("Opção: ");
            opcao = scanner.nextInt();
        }

        System.out.println("Obrigado");
    }
}
