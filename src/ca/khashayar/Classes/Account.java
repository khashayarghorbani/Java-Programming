package ca.khashayar.Classes;
import org.w3c.dom.ls.LSOutput;

import java.util.*;
public class Account {
    private double checkingAccount;
    private double savingAccount;
    private String name;
    private static final double interestRate = 0.01;
    public enum type {checking, saving}

    public Account() {
        this("unknown", 0, 0);
    }

    public Account(String name, double checkingAccount, double savingAccount) {
        this.name = name;
        this.checkingAccount = checkingAccount;
        this.savingAccount = savingAccount;

    }

    public double deposit(double amount , type account) {
        if (account == type.checking) {
            if (amount < 0) {
                System.out.println("amount can't be negative");
                return this.checkingAccount;

            }
            this.checkingAccount += amount;
            return checkingAccount;

        } else if (account == type.saving){
            if (amount < 0) {
                System.out.println("amount can't be negative");
                return this.savingAccount;
            }
            this.savingAccount += amount;
            return savingAccount;
        }
        else {
            return -1;
        }
    }

    public double getCheckingAccount() {
        return checkingAccount;
    }


    public double getSavingAccount() {
        return savingAccount;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double withdraw(double amount , type account) {

        if (account == type.checking) {
            if (this.checkingAccount < amount) {
                System.out.println("insufficient amount, you have " + this.checkingAccount + " in your checking account");
                return this.checkingAccount;
            }
            this.checkingAccount -= amount;
            return checkingAccount;
        } else if (account == type.saving){
            if (this.savingAccount < amount) {
                System.out.println("insufficient amount, you have " + this.savingAccount + " in your savings account");
                return this.savingAccount;

            }
            this.savingAccount -= amount;
            return savingAccount;
        }
        else {
            return -1;
        }


    }
    public void transferMoney(type from , type to , double amount){

        if (from == type.checking && to == type.saving){
            if (checkingAccount >= amount){
                this.checkingAccount -= amount;
                this.savingAccount += amount;
                this.savingAccount += amount + amount*interestRate;
            } else {
                System.out.println("insufficient money. You have : " + this.checkingAccount + " in your checking account");
            }


        }
        if (from == type.saving && to == type.checking ){
            if (savingAccount >= amount){
                this.savingAccount -= amount;
                this.checkingAccount += amount;

            } else {
                System.out.println("insufficient money. You have : " + this.savingAccount + " in your saving account");
            }
        }

    }

    @Override
    public String toString() {
        return "Account{" +
                "checkingAccount=" + checkingAccount +
                ", savingAccount=" + savingAccount +
                ", name='" + name + '\'' +
                '}';
    }
}


