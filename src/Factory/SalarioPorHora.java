/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factory;

/**
 *
 * @author rubia
 */
public class SalarioPorHora implements Salario {
    
    @Override
    public void calcularSalario() {
        System.out.println("Salario por Hora");
        SingletonLog.getInstance().doLog("Cálculo de salário "
                + "por hora");
    }
}
