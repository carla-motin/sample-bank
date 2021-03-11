package com.training.controller;

import com.training.model.Account;

import java.util.HashSet;
import java.util.Set;

public class AccountController {

    Set<Account> accounts = new HashSet<>();

    public void createAccount(int acctId, double initialBalance) {
        Account account = new Account();
        account.setAcctId(acctId);
        account.setBalance(initialBalance);
        accounts.add(account);
        System.out.println("Conta criada!\n");
    }

    public void withdraw(int acctId, double amount) {
        for(Account a: accounts) {
            if(a.getAcctId() == acctId) {
                a.setBalance(a.getBalance() - amount);
                System.out.println("Saldo: " + a.getBalance() + "\n");
                break;
            }
        }
    }

    public void deposit(int acctId, double amount) {
        for(Account a: accounts) {
            if(a.getAcctId() == acctId) {
                a.setBalance(a.getBalance() + amount);
                System.out.println("Saldo: " + a.getBalance() + "\n");
                break;
            }
        }
    }

    public void getAccountBalance(int acctId) {
        for(Account a: accounts) {
            if(a.getAcctId() == acctId) {
                System.out.println("Saldo atual: " + a.getBalance() + "\n");
                break;
            }
        }
    }
}
