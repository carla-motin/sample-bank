package com.training.main;

import com.training.controller.AccountController;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        AccountController ac = new AccountController();
        int option = 0;
        Scanner in = new Scanner(System.in);

        System.out.println("Sample Bank\n");

        do {
            System.out.println("Escolha uma opção: ");
            System.out.println("1 - Abrir conta");
            System.out.println("2 - Saque");
            System.out.println("3 - Depósito");
            System.out.println("4 - Consultar saldo");
            System.out.println("5 - Sair");
            System.out.println("----------------------------------------\n");
            option = in.nextInt();

            if(option == 1) {
                System.out.println("Digite o id da conta\n");
                int id = in.nextInt();
                System.out.println("Digite o saldo inicial\n");
                double balance = in.nextDouble();
                ac.createAccount(id, balance);
            } else if(option == 2) {
                System.out.println("Digite o id da conta para saque\n");
                int id = in.nextInt();
                System.out.println("Digite o valor que deseja sacar\n");
                int amount = in.nextInt();
                ac.withdraw(id, amount);
            } else if(option == 3) {
                System.out.println("Digite o id da conta para depósito\n");
                int id = in.nextInt();
                System.out.println("Digite o valor que deseja depositar\n");
                int amount = in.nextInt();
                ac.deposit(id, amount);
            } else if(option == 4) {
                System.out.println("Digite o id da conta que deseja consultar\n");
                int id = in.nextInt();
                ac.getAccountBalance(id);
            } else if(option == 5){
                System.out.println("Encerrando!!!");
            }
        } while(option < 5);
    }
}
