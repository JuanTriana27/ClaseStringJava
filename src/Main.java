import java.util.Date;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String miCadena = "Mi nombre es Juan Triana";
        String miCadena2 = new String("mi nombre es Juan Triana");

        //Metodo Length
        System.out.println("Cadena = " + miCadena.length()); //Esto Funciona para saber el Largo de la cadena
        System.out.println("Cadena 2 = " + miCadena2.length());

        //Metodo charArt
        System.out.println("Caracter: " + miCadena.charAt(1));//Este metodo devuelve el caracter de la posicion que uno indiqque en el parentesi

        //Metodo Equals
        System.out.println("Comparar 2 cadenas " + miCadena.equals(miCadena2));

        //Metodo Equals Ingnore Case
        System.out.println("Comparar Cadenas " + miCadena.equalsIgnoreCase(miCadena2)); //Ignora mayusculas y minusculas

        //Metodo starWith y endsWith
        System.out.println("Empieza con un Mi? " + miCadena.startsWith("Mi"));
        System.out.println("Termina con un na? " + miCadena2.endsWith("na"));

        //Metodo indexOf
        System.out.println("La posicion de Triana es: " + miCadena.indexOf("Triana"));

        //Metodo substring
        System.out.println("Cadena: " + miCadena2.substring(1)); //Corta la cadena y me muestra desde el indice
        System.out.println("Desde el indice hasta: " + miCadena2.substring(14, 19));

        //Metodo concat
        String nombre = "Juan ";
        String apellido = "Triana";
        System.out.println("Concatenar = " + nombre.concat(apellido));

        //Metodo Replace
        System.out.println("Reemplazar Mi: " + miCadena.replace("Mi", "Su"));
        System.out.println("Reemplazar Letras: " + miCadena.replace("a", "o"));

        //Metodo toUpperCase y toLoweCase
        String ciudades = "Estas son todas la ciudades";
        System.out.println("Mayusculas: " + ciudades.toUpperCase()); //Minusculas a Mayusculas
        System.out.println("Minusculas: " + ciudades.toLowerCase()); //Mayusculas a Minusculas

        //Metodo Trin
        String conEspacios = "         E s t a C a d e na T i en e E s p a c i o s";
        System.out.println("Eliminar Espacios: " + conEspacios.trim()); //Solo quita los espacios del principio


        //Metodo toString
        Integer numero = 45;
        String cadenaNum = numero.toString();
        Date fecha = new Date();
        System.out.println("Transformar a String un Objeto: " + fecha.toString());
        
        //Metodo toCharArray
        String cadenaAseparar = "La vida es bella";
        char [] arreglo = cadenaAseparar.toCharArray();//Almacena en el arreglo todas la letras por separado
        char a = arreglo[0];
        System.out.println("Primer Letra: " + a);
        for (char c: arreglo){
            System.out.println("Letras: " + c);
        }

        //Metodo valueOf
        System.out.println("Numero a cadena de Texto: " + String.valueOf(43.423));

        //Metodo Split
        String colores = "Rojo, Amarillo, Azul";
        String [] arregloColores = colores.split(",");//separar las cadenas por comas o por espacios (" ")
        for (String color:arregloColores){
            System.out.println("colores: " + color);
        }
    }
}