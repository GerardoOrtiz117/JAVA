public class OperatorsExcercises {
    public static void main(String[] args) {
        // 1. Crea una variable con el resultado de cada operación aritmética.
        var suma=0;
        var resta=0;
        var multiplicacion=0;
        var division=0;
        int a =3;
        int b=123;
        int div=0;

        suma = a+b;
        resta = a-b;
        multiplicacion = a*b;
        division = b/a;
        div = b%2;

        // 2. Crea una variable para cada tipo de operación de asignación.
        a= b;
        suma = a+ multiplicacion;
        b += 32;
        multiplicacion *= 4;
        division /= 2;
        resta -=3;

        // 3. Imprime 3 comparaciones verdaderas con diferentes operadores de comparación.

        System.out.println(resta >109 || multiplicacion> 200);
        System.out.println(resta <109 && multiplicacion> 200);
        System.out.println(!(resta >109 == multiplicacion> 200));

        // 4. Imprime 3 comparaciones falsas con diferentes operadores de comparación.
        System.out.println(suma >= multiplicacion);
        System.out.println(division == resta);
        System.out.println(a!=(a));

        // 5. Utiliza el operador lógico and.

        // 6. Utiliza el operador lógico or.

        // 7. Combina ambos operadores lógicos.

        // 8. Añade alguna negación.

        // 9. Imprime 3 ejemplos de uso de operadores unarios.

        // 10. Combina operadores aritméticos, de comparación y lógicos.
    }
}
