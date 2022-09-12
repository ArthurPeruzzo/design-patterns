/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Strategy;

/**
 *
 * @author rubia
 */
public abstract class Funcionario {
    protected Salario salario; //Atributo referente à estratégia Salario
    
    public void calcularSalario() {
        salario.calcularSalario();
    }
}
