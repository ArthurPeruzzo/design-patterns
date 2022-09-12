/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Adapter;

/**
 *
 * @author rubia
 */
//
//Imagine que você está criando uma aplicação de monitoramento do mercado de ações da bolsa. A aplicação baixa os dados as ações de múltiplas fontes em formato XML e então mostra gráficos e diagramas maneiros para o usuário.
//
//        Em algum ponto, você decide melhorar a aplicação ao integrar uma biblioteca de análise de terceiros. Mas aqui está a pegadinha: a biblioteca só trabalha com dados em formato JSON.
// quando você quer usar uma classe existente, mas sua interface não for compatível com o resto do seu código.
public class Main {
    public static void main(String[] args) {
        Conta c1 = new ContaSalario();
        Conta c2 = new ContaCorrente();
        Conta c3 = new PoupancaAdapter(new ContaPoupanca());
        
        c1.getSaldo();
        c2.getSaldo();
        c3.getSaldo();
    }
}
