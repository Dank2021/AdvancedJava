package javaA.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

public class Cabalistico {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.println("Digite su nombre");
        char nombre[] = leer.nextLine().toCharArray();
        System.out.println("Su numero cabalistico es: "+sumaRecursion(valoresLetras(nombre)));
    }

    static int numeroCabalistico(char letra) {
        letra = Character.toLowerCase(letra);
        int valor;

        switch (letra) {
            case 'a':
                valor = 1;
                break;
            case 'b':
                valor = 2;
                break;
            case 'c':
                valor = 3;
                break;
            case 'd':
                valor = 4;
                break;
            case 'e':
                valor = 5;
                break;
            case 'f':
                valor = 6;
                break;
            case 'g':
                valor = 7;
                break;
            case 'h':
                valor = 8;
                break;
            case 'i':
                valor = 9;
                break;
            case 'j':
                valor = 10;
                break;
            case 'k':
                valor = 11;
                break;
            case 'l':
                valor = 12;
                break;
            case 'm':
                valor = 13;
                break;
            case 'n':
                valor = 14;
                break;
            case 'ñ':
                valor = 15;
                break;
            case 'o':
                valor = 16;
                break;
            case 'p':
                valor = 17;
                break;
            case 'q':
                valor = 18;
                break;
            case 'r':
                valor = 19;
                break;
            case 's':
                valor = 20;
                break;
            case 't':
                valor = 21;
                break;
            case 'u':
                valor = 22;
                break;
            case 'v':
                valor = 23;
                break;
            case 'w':
                valor = 24;
                break;
            case 'x':
                valor = 25;
                break;
            case 'y':
                valor = 26;
                break;
            case 'z':
                valor = 27;
                break;
            default:
                valor = 0; // si la letra no es una letra del alfabeto, devolvemos -1
        }

        return valor;
    }

    static int[] valoresLetras(char letras[]){

        int convertido[] = new int[letras.length], i=0;

        for (char l :
                letras) {
            convertido[i] = numeroCabalistico(l);
            i++;
        }
        return convertido;
    }

    static int sumaRecursion(int[] nums){
        int res=-1;

        while(nums.length != 1){
            res = 0;
            for (int i = 0; i < nums.length; i++) {
                res = nums[i]+ res;
            }
            int nums2[] = new int[0];

            if (res >= 10) {
                String cadena = Integer.toString(res);
                nums2 = new int[cadena.length()];

                for (int i = 0; i < nums2.length; i++) {
                    nums2[i] = cadena.charAt(i)-'0';
                }

                nums = Arrays.copyOf(nums2, nums2.length);
            } else {
                return res;
            }
        }

        return res;
    }
}
