public class BeginnerExcercises_Completed {
    public static void main(String[] args) {
        // 1. Declara una variable de tipo String y asígnale tu nombre.
        var name ="Gerardo";
        String lastname= "Ortiz";
        System.out.println(name + " " + lastname);

        // 2. Crea una variable de tipo int y asígnale tu edad.
        int age = 26;
        System.out.println(age);

        // 3. Crea una variable double con tu altura en metros.
        double height = 1.75;
        System.out.println(height);

        // 4. Declara una variable de tipo boolean que indique si te gusta programar.
        boolean confirmation = true;
        System.out.println(confirmation);

        // 5. Declara una constante con tu email.
        final String EMAIL = "capacitaciongo@outlook.com";
        System.out.println(EMAIL);

        // 6. Crea una variable de tipo char y guárdale tu inicial.
        char iniciales = 'G';
        System.out.println(iniciales);

        // 7. Declara una variable de tipo String con tu localidad, y a continuación cambia su valor y vuelve a imprimirla.
        String localidad = "Aguascalientes";
        System.out.println(localidad);
        localidad = "Zacatecas";
        System.out.println(localidad);

        // 8. Crea una variable int llamada a, otra b, e imprime la suma de ambas.
        int a, b;
        a= 1245; b=421;
        System.out.println(a+b);
        int suma= a+b;
        System.out.println(suma);

        // 9. Imprime el tipo de dos variables creadas anteriormente.
        System.out.println(localidad.getClass().getSimpleName());
        System.out.println(name.getClass().getSimpleName());

        // 10. Intenta declarar una variable sin inicializarla y luego asígnale un valor antes de imprimirla.
        int counter;
        counter = 18;
        System.out.println(counter);
    }
}
