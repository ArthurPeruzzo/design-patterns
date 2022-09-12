/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factory;


/**
 *
 * @author rubia
 */
public class SemFerias implements Ferias {

    @Override
    public void calcularFerias() {
        System.out.println("Não possui direito a férias");
        SingletonLog.getInstance().doLog("Não foi realizado "
                + " cálculo de férias");
    }
}
