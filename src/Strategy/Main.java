/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Strategy;

/**
 *
 * @author rubia
 */
//Quando você quer executar o mesmo comando como "escrever" só que de maneiras diferentes, usando várias estratégias
//    podendo ser de lápis, de caneta...

    //Utilize o padrão Strategy quando você quer usar diferentes variantes
// de um algoritmo dentro de um objeto e ser capaz de trocar de um algoritmo para outro durante a execução.
public class Main {
    public static void main(String[] args) {
        Funcionario e = new Estagiario();
        e.calcularSalario();
        
        Funcionario c = new Contratado();
        c.calcularSalario();
    }
}
