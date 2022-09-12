/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factory;
/**
 *
 * @author rubia
 */
public class ComFerias implements Ferias {

    @Override
    public void calcularFerias() {
        System.out.println("Férias calculadas");
        SingletonLog.getInstance().doLog("Realizado "
                + "cálculo de férias");
    }
}
