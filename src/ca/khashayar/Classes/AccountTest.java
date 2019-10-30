package ca.khashayar.Classes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {


    void depositAndWithdraw(){
        Account testAccount = new Account("saygin" , 100 , 200);
        testAccount.deposit(200, Account.type.checking);
        testAccount.withdraw(500 , Account.type.saving);


    }

    @org.junit.jupiter.api.Test
    void deposit() {
        Account testAccount = new Account("test account" , 250 , 500);
        assertEquals(500, testAccount.deposit(250,Account.type.checking));
        assertEquals(750, testAccount.deposit(250,Account.type.saving));



    }

    @org.junit.jupiter.api.Test
    void withdraw() {
        Account test2 = new Account("khashayar" , 1000 , 100);
        assertEquals(500 , test2.withdraw(500 , Account.type.checking));
        assertEquals(0 , test2.withdraw(100 , Account.type.saving));
    }

    @org.junit.jupiter.api.Test
    void getCheckingAccount() {
        Account test1 = new Account("ardi" , 1000 , 500);
        assertEquals(1000 , test1.getCheckingAccount());
    }

    @org.junit.jupiter.api.Test
    void getSavingAccount() {
        Account test1 = new Account("ardi" , 1000 , 500);
        assertEquals(500 , test1.getSavingAccount());
    }

    @org.junit.jupiter.api.Test
    void getName() {
        Account test1 = new Account("ardi" , 1000 , 500);
        assertEquals("ardi" , test1.getName());
    }

    @org.junit.jupiter.api.Test
    void transferMoney() {
        Account transfer = new Account("khashayar" , 1000 , 500);
        transfer.transferMoney(Account.type.checking , Account.type.saving , 500);
        assertEquals((500 +500 * 0.01 ) ,  Account.type.saving);
        assertEquals( 500 ,  Account.type.checking);

        Account transfer2 = new Account("ardi" , 500 , 1000);
        transfer2.transferMoney(Account.type.saving , Account.type.checking , 500);
        assertEquals(1000 , Account.type.checking);
        assertEquals(500 , Account.type.saving);
    }
}