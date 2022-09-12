/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bridge.lives;

/**
 *
 * @author rubia
 */
public class TwichTV implements IPlatform {
    
    public TwichTV() {
        configureRMTP();
        System.out.println("TwichTV! Transmissão iniciada.");
    }
    
    @Override
    public void configureRMTP() {
        authToken();
        System.out.println("TwichTV: Configurando RMTP");
    }
    
    @Override
    public void authToken() {
        System.out.println("TwichTV: Validando canal");
    }
}