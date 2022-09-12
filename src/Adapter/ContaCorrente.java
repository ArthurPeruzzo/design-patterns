/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Adapter;

/**
 *
 * @author rubia
 */
public class ContaCorrente implements Conta {
    
    @Override
    public void getSaldo() {
        System.out.println("Saldo da conta corrente");
    }
}
