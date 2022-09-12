/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bridge.lives;

/**
 *
 * @author rubia
 */
//ABSTRAÇÃO REPRESENTADA NO PADRÃO BRIDGE

public class Live implements ITransmission {
    protected IPlatform platform;
    
    public Live() {
        //
    }
    
    //Poliformismo
    public Live(IPlatform platform) {
        this.platform = platform;
    }
    
    @Override
    public void broadcasting() {
        System.out.println("Iniciando a transmissão.");
    }
    
    @Override
    public void result() {
        System.out.println("NO AR");
    }
}
