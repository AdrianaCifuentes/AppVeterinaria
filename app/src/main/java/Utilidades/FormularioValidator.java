/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utilidades;

import java.util.regex.Pattern;

public class FormularioValidator {

    // Valida que un campo no esté vacío
    public static boolean campoNoVacio(String valor) {
        return valor != null && !valor.trim().isEmpty();
    }

    // Valida un correo electrónico usando expresión regular
    public static boolean correoValido(String correo) {
        String regex = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
        return Pattern.matches(regex, correo);
    }

    // Valida la longitud mínima de una contraseña
    public static boolean contrasenaValida(String contrasena, int longitudMinima) {
        return contrasena != null && contrasena.length() >= longitudMinima;
    }

    // Valida que un número de teléfono tenga solo dígitos y 10 caracteres
    public static boolean telefonoValido(String telefono) {
        return telefono != null && telefono.matches("\\d{10}");
    }

    // Valida que la edad sea un número dentro de un rango razonable
    public static boolean edadValida(String edadTexto) {
        try {
            int edad = Integer.parseInt(edadTexto);
            return edad >= 0 && edad <= 120;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    // Método principal para probar las validaciones
    public static void main(String[] args) {
        String nombre = "Juan";
        String correo = "juan@example.com";
        String contrasena = "abc123";
        String telefono = "1234567890";
        String edad = "25";

        if (!campoNoVacio(nombre)) {
            System.out.println("El nombre no puede estar vacío.");
        } else if (!correoValido(correo)) {
            System.out.println("Correo electrónico inválido.");
        } else if (!contrasenaValida(contrasena, 6)) {
            System.out.println("La contraseña debe tener al menos 6 caracteres.");
        } else if (!telefonoValido(telefono)) {
            System.out.println("Número de teléfono inválido.");
        } else if (!edadValida(edad)) {
            System.out.println("Edad inválida.");
        } else {
            System.out.println("Todos los datos son válidos.");
        }
    }
}

