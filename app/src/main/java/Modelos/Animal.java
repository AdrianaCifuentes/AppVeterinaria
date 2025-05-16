/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
//// *
 * @author fl1pc04
 */
public abstract class Animal {
    protected String nombre;
    protected LocalDate fechaVacuna;
    protected LocalDate fechaProximaVacuna;
    protected String sexo;
    protected String raza;
    protected double peso;
    protected int edad;

    public Animal(String nombre, LocalDate fechaVacuna, LocalDate fechaProximaVacuna, String sexo, String raza, double peso, int edad) {
        this.nombre = nombre;
        this.fechaVacuna = fechaVacuna;
        this.fechaProximaVacuna = fechaProximaVacuna;
        this.sexo = sexo;
        this.raza = raza;
        this.peso = peso;
        this.edad = edad;
    }
    
    public abstract LocalDate getProximaFechaDeVacuna();
//    public void mostrarInformacionVacuna (){
//        DateTimeFormatter formato=DateTimeFormatter.ofPattern("dd-MM-yyyy");
//        System.out.println("nombre: " + nombre);
//        System.out.println("primera vacuna: " + fechaVacuna.format(formato));
//        System.out.println("proxima vacuna: " + getProximaFechaDeVacuna().format(formato));
//        System.out.println("sexo de la mascota: " + sexo);
//        System.out.println("raza: " + raza);
//        System.out.println("peso: " + peso);
//        System.out.println("edad: " + edad);
//        
//        
//        
//    }
    
}
