/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prac03less11;

/**
 *
 * @author kieut
 */
public class ATM {
    public void withdrawMoney(Account account, double amount) {
        account.withdraw(amount);
    }
}