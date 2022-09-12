/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Adapter;

/**
 *
 * @author rubia
 */
//Adaptador que permitirá a interação com a ContaPoupança
public class PoupancaAdapter implements Conta {
    private final ContaPoupanca poupanca;
    
    public PoupancaAdapter(ContaPoupanca poupanca) {
        this.poupanca = poupanca;
    }
    
    @Override
    public void getSaldo() {
        poupanca.valorAcumulado();
    }
}
