/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package enumeradores;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Usuario
 */
public enum GeneroLibros {
    Ficcion,
    Poesia,
    Drama,
    Comedia,
    Aventura,
    Historia,
    Suspenso,
    Infantil,
    Fantasia,
    Realidad,
    Accion,
    Romance,
    Terror,
    Novela;

    @Override
    public String toString() {
        return this.name();
    }
    
    public static GeneroLibros convertirStringAGenero(String generoString) {
    // Supongamos que tienes una lista predefinida de géneros
    List<String> generos = Arrays.asList("Ficcion", "Poesia", "Drama", "Comedia", "Aventura", "Historia",
    "Suspenso", "Infantil", "Fantasia", "Realidad","Accion","Romance","Terror", "Novela");

    // Convertir el String a un valor de la lista predefinida
    for (GeneroLibros genero : GeneroLibros.values()) {
        if (genero.toString().equalsIgnoreCase(generoString)) {
            return genero;
        }
    }
    
    // Si el género no se encuentra en la lista predefinida, podrías lanzar una excepción o manejarlo de otra manera
    throw new IllegalArgumentException("Género no válido: " + generoString);
}
}
