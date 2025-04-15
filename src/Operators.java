public class Operators {
    public static void main(String[] args) {
        //Operadores
        // Aritmeticos

        var a = 5;
        var b= 3;

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);

        //Asignacion
        a= 2*b;

        System.out.println(a);
        a = 6+b;
        System.out.println(a);
        a += 1;
        System.out.println(a);
        a -= 1;
        System.out.println(a);
        a *= 2;
        System.out.println(a);
        a /= 3;
        System.out.println(a);

        //Comparadores de Comparacion

        System.out.println(a == b);
        System.out.println(a == 6);
        System.out.println(a == 0);
        System.out.println(a != b);
        System.out.println(a >= b);
        System.out.println(a <= b);
        System.out.println(a < b);
        System.out.println(a > b);


        //Operadores Logicos
        //Y AND
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);//tabla de verdad de And

        System.out.println(2>3 && 54==12);

        //OR
        System.out.println(true || true);
        System.out.println(false || true);
        System.out.println(true || false);
        System.out.println(false || false);

        System.out.println(2>3 || 54==12);

        //No NOT
        System.out.println(!true);
        System.out.println(!false);

        System.out.println(!(2>3) || 54==12);

        //operadores Unarios
        System.out.println(+b);
        System.out.println(-b);
        System.out.println(b++);
        System.out.println(++b);
        System.out.println(b--); //Imprime el valor y luego incrementa.
        System.out.println(--b);//Incrementa el valor y luego imprime.





    }
}
