/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testromanos;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 *
 * @author Darien
 */
class NumerosRomanos {

    //Creación de arreglo que almacenará el número y su conversión en romano
    private static final HashMap<Integer, String> conversion = new LinkedHashMap<Integer, String>();

    
    
    static { //Para acceder al Hashmap y agregar elementos

        conversion.put(1000, "M");
        conversion.put(900, "CM");
        conversion.put(500, "D");
        conversion.put(400, "CD");
        conversion.put(100, "C");
        conversion.put(90, "XC");
        conversion.put(50, "L");
        conversion.put(40, "XL");
        conversion.put(10, "X");
        conversion.put(9, "IX");
        conversion.put(5, "V");
        conversion.put(4, "IV");
        conversion.put(1, "I");

    }

    String convertir(int i) {
        /*
         // El simbolo == significa comparación, diferente se escribe !=
         if(i==1){ //Se pone llaves cuando tienes más de una linea de código dentro del if
         return "I";
         }else if(i==2){
         return "II";
         }else{ //Todos los demás casos por ejemplo i==3
         return "";
         }*/

        //Refactoring
        if (i == 0 || i > 2999) { // Valida si el número es cero O es mayor a 2999, en este caso arroja una excepción
            throw new IllegalArgumentException("Solo numeros de 1 a 3000 son permitidos");
        }

        return convertirARomano(i).toString(); //Convierte a cadena para retornar
    }

    private StringBuilder convertirARomano(int i) {
        StringBuilder resultado = new StringBuilder(); //Instancias el StringBuilder
        Iterator<Map.Entry<Integer,String>> iterador = conversion.entrySet().iterator();
        while (iterador.hasNext()) {
            Map.Entry<Integer, String> entry = iterador.next(); //obtiene el número y romano del hashmap
            while (i >=entry.getKey()){
                resultado.append(entry.getValue());
                i -= entry.getKey();
            }
        }
        return resultado;
    }

}
