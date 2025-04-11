public class DataTypes {

    //int myInt2; Error No es Estatico

    public static void main(String[] args) {
        //Tipos de datos primitivos
        int myInt=37; //Enteros
        System.out.println(myInt);
        //System.out.println(myInt2); //Error no es Estatico, no se puede acceder.
        double myDouble = 3.1416; //Decimales
        System.out.println(myDouble);
        char myChar = 'a';
        System.out.println(myChar);

        //float deciamales con mayor longitud
        //byte
        //long
        //Byte

        boolean myBoolean = true;
        //System.out.println(myBoolean);

        myBoolean = false;
        System.out.println(myBoolean);
        String myString = "Hola Java";
        //no es un dato primitivo en java, si en diferentes lenguajes

        //tipo de dato en tiempo de compilacion
        System.out.println(myString.getClass().getSimpleName());




    }
}
