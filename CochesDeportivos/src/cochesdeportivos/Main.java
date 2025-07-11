/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cochesdeportivos;

public class Main {
    public static void main(String[] args) {
        // Crear instancias de CocheDeportivo usando diferentes constructores
        
        // Constructor por defecto
        CocheDeportivo coche1 = new CocheDeportivo();
        
        // Constructor parametrizado completo
        CocheDeportivo coche2 = new CocheDeportivo("Ferrari", "488 GTB", 2020, 330.5);
        
        // Constructor sobrecargado
        CocheDeportivo coche3 = new CocheDeportivo("Porsche", "911 Turbo S");
        
        // Modificamos un valor después de la creación
        coche3.setAnio(2022);
        coche3.setVelocidadMaxima(330);
        
        // Mostramos la información de los coches
        System.out.println("--- InformaciOn de Coches Deportivos ---");
        System.out.println(coche1.getInfo());
        System.out.println(coche2.getInfo());
        System.out.println(coche3.getInfo());
        
        // También podemos acceder a los atributos individualmente
        System.out.println("\n--- Detalles adicionales ---");
        System.out.println("El " + coche2.getMarca() + " " + coche2.getModelo() + 
                " alcanza " + coche2.getVelocidadMaxima() + " km/h");
    }
}

