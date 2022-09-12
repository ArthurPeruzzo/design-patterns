/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factory.violao;

/**
 *
 * @author rubia
 */
public class Main {
    public static void main(String[] args) {
        ViolaoFactory fabrica = new ViolaoFactoryConcreto();
        System.out.println("Preço do Violão Giannini: ");
        Violao g = fabrica.calcularPreco("Giannini");
        System.out.println(g.getPreco());
        
        System.out.println("Preço do Violão Eagle: ");
        Violao e = fabrica.calcularPreco("Eagle");
        System.out.println(e.getPreco());
        
        System.out.println("Preço do Violão Tagima: ");
        Violao t = fabrica.calcularPreco("Giannini");
        System.out.println(t.getPreco());
    }
}
