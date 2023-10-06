public class Main {
    public static void main(String[] args) {
        /* tipos primitivos

        byte -> inteiro
        short -> inteiro 
        int -> inteiro
        long -> inteiro
        float -> numero com casas decimais
        char -> numero com casas decimais
        double -> caractere
        boolean -> verdadeiro ou falso
        */
        byte b = (byte)1;        
        short s = (short)5;
        int i = 15;
        long l = 10L;
        float f = 15.5F;
        char c = 'V';
        double d  = 15.55D;
        boolean boo  = true;

        // Casting
        
        double variavelDouble = (double) i;
        System.out.println(variavelDouble);

        int variavelInt = (int) d;
        System.out.println(variavelInt);
    }
}
