public class VariablesAndConstants {
    public static void main(String[] args) {
    //Variables
        String name = "Gerardo";
        System.out.println(name);

        int age = 26;
        System.out.println(age+ " years.");
        name =" Antonio";
        System.out.println(name);
        // name = 37; Eror: (No podemos cambiar el tipo de dato)
        // System.out.println(name);

                 //Inferencia de tipos
        String email = "ortizgerardo053@gmail.com"; //variable que determina el tipo de dato en automatico
        System.out.println("email");
        var year = 2025;
        System.out.println(year);


    //Constantes
        final String EMAIL = "ortigerardo053@gmail.com"; //Las constantes es practico declararlas en Mayusculas
        //email = "cap@edu.mx"; //Error (Ya se declaro como variable final, en la linea anterior)
        System.out.println(EMAIL);


    }
}
