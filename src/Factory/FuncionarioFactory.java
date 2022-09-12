/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factory;

/**
 *
 * @author rubia
 */
public abstract class FuncionarioFactory {
    
    //Factory method
    protected abstract Funcionario createFuncionario(String tipo);
    
    public Funcionario fazerPagamento(String tipo) {
        Funcionario f = createFuncionario(tipo);
        f.calcularSalario();
        f.calcularFerias();
        return f;
    }
}
