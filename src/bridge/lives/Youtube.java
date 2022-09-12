/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bridge.lives;

/**
 *
 * @author rubia
 */
public class Youtube implements IPlatform {
    public Youtube() {
        configureRMTP();
        System.out.println("Youtube! Transmissão iniciada.");
    }
    
    @Override
    public void configureRMTP() {
        authToken();
        System.out.println("Youtube: Configurando broadscating");
    }
    
    @Override
    public void authToken() {
        System.out.println("Youtube: Autorizando aplicação");
    }
}
