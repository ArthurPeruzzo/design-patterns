/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factory;



/**
 *
 * @author rubia
 */
public abstract class Funcionario {

    protected Salario salario; //Atributo referente à estratégia Salario
    protected Ferias ferias;

    public void calcularSalario() {
        salario.calcularSalario();
    }

    public void calcularFerias() {
        ferias.calcularFerias();
    }
}
