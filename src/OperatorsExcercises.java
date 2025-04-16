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
        System.out.println(suma >= 10 && multiplicacion != 1);

        // 6. Utiliza el operador lógico or.
        System.out.println(suma >0 || resta <100);

        // 7. Combina ambos operadores lógicos.
        System.out.println((suma+resta >10 && div ==2) || (resta==0 && suma<100));

        // 8. Añade alguna negación.
        System.out.println((suma+resta >10 && div ==2) || (resta!=0 && suma<100));

        // 9. Imprime 3 ejemplos de uso de operadores unarios.
        System.out.println(suma++);
        System.out.println(resta--);
        System.out.println(++multiplicacion);
        System.out.println(div++);
        System.out.println(div);


        // 10. Combina operadores aritméticos, de comparación y lógicos.
        System.out.println((suma+resta >10 && div ==2) || (resta!=0 && suma<100)== false);
    }
}
