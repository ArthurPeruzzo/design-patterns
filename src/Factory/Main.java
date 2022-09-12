/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factory;

/**
 *
 * @author rubia
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("***Exemplo de aplicação dos padrões"
                + "Strategy e Factory Method");
        FuncionarioFactory fabrica = new FuncionarioFactoryConcreto();
        System.out.println("---Estagiario ");
        Funcionario e = fabrica.fazerPagamento("ESTAGIARIO");
        System.out.println("---Contratado ");
        Funcionario c = fabrica.fazerPagamento("CONTRATADO");
        System.out.println("---Voluntario ");
        Funcionario v = fabrica.fazerPagamento("VOLUNTARIO");
        System.out.println("---Freelancer");
        Funcionario f = fabrica.fazerPagamento("FREELANCER");
        System.out.println("---HomeOffice");
        Funcionario h = fabrica.fazerPagamento("HOMEOFFICE");
    }
}
