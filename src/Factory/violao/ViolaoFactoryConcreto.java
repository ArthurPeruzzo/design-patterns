/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factory.violao;

/**
 *
 * @author rubia
 */
public class ViolaoFactoryConcreto extends ViolaoFactory {
    
    @Override
    public Violao createViolao(String marca) {
        return switch(marca) {
            case "Giannini"-> new Giannini();
            case "Eagle"-> new Eagle();
            case "Tagima"-> new Tagima();
            default->null;
        };
    }
}
