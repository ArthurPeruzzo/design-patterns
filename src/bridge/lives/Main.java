/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bridge.lives;

/**
 *
 * @author rubia
 */
public class Main {
    
    public static void main(String[] args) {
        
        //Transmissão de Live (comum/avançada) 
        //(que são as duas abstrações possíveis)
        //usando três diferentes plataformas 
        //(que são as três implementações possíveis)
        startLive(new Youtube()); //Inicia a live nessa plataforma
        startLive(new Facebook()); 
        startLive(new TwichTV());
    }
    
    public static void startLive(IPlatform platform) {
        //Transmissão padrão
       /* System.out.println("...Aguarde");
        Live live = new Live(platform);
        live.broadcasting();
        live.result();
        */
        //Transmissão de Live avançada (que é uma segunda abstração)
        //usando uma das plataformas disponíveis (implementações)
        System.out.println("Transmissão avançada... Aguarde!");
        AdvancedLive advLive =  new AdvancedLive(platform);
        advLive.broadcasting();
        advLive.comments();
        advLive.subtitles();
        advLive.result();
    }
}
