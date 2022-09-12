/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factory;

/**
 *
 * @author rubia
 */
public class SemSalario implements Salario {

    @Override
    public void calcularSalario() {
        System.out.println("Não possui salário");
        SingletonLog.getInstance().doLog("Cálculo de salário "
                + "não realizado");
    }
}
