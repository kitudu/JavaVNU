
import prac03less11.ATM;
import prac03less11.BankAccount;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author kieut
 */
public class Prac03Less11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BankAccount account = new BankAccount();
        account.deposit(1000);

        ATM atm = new ATM();
        atm.withdrawMoney(account, 500);
    }
    
}
