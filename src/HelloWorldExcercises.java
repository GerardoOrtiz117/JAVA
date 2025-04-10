public class HelloWorldExcercises {
    public static void main(String[] args){
        // 1. Imprime un mensaje que diga que tu nombre en lugar de "Hola Mundo!".
        // 2. Imprime 2 lineas: "Hola" y luego "Mundo" con un solo println.
        // 3. Añade un comentario sobre lo que hace cada linea del programa.
        // 4. Crea un comentario en varias lineas.
        // 5. Imprime tu edad, tu color favorito y tu ciudad.
        // 6. Explora los diferentes System.XXX.println(); ,as allá de un "out".
        // 7. utiliza varios println para imprimir una frase.
        // 8. Imprime un diseño ASCII (por ejemplo, una cara feliz usando simbolos).
        // 9. Intenta ejecutar el programa sin el método "main" y observa el error
        // 10. Intenta cambiar el nombre del archivo a uno diferente del de la clase y compilalo.
        System.out.println("Hola, mi nombre es Gerardo Ortiz"); //Imprime la presentacion y mi nombre.
        System.out.println("Hola \\n Mundo"); /* Imprime "Hola Mundo" en 2 lineas con "\\n",
        que es el salto de linea de un string */
        System.out.println("Edad: 26 años\\n Color Fav: Azul y Negro \\n Ciudad: Aguascalientes\\n");
        /*Imprime mi 26 años, Azul y negro y Aguascalientes */
        System.gc();//solicita reciclar espacios de memoria sin usar en la VM de Java
        System.err.println("Este muestra errores"); //en Rojo
        //System.in.reset();

        String emoji = "\uD83D\uDE00";
        System.out.println(emoji + "\n :) ");


    }
}
