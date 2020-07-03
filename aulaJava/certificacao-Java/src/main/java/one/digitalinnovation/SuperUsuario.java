package one.digitalinnovation;

public class SuperUsuario {
    public static void main(String[] args) {

        byte a = 127; //bytes no máximo faixa de -128 a 127;
        byte a1 = -128;

        char b = 'b'; //alfanumerico de 16bit

        short c = 32767;  //numerico de 16bits faixa 32767 a -32768

        int d = 2147483647; //numerico de 32bits

        long e = 9223372036854775807L;  //64bits, por um L no final para declaclar que é um long

        float f = 65f; //32bits

        double g = 1024.99;  //64bits

        boolean h = true;

        boolean h1 = false;

        //void v; //palavra reservada

    }
}