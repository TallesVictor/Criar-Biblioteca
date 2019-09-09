package bibliotecaLTP2;

import java.util.Scanner;

public class LTP2Utils {

    static Scanner leia = new Scanner(System.in);

    public static int getInt(String texto) {
        System.out.println(texto);
        return leia.nextInt();
    }

    public static float getFloat(String texto) {
        System.out.println(texto);
        return leia.nextFloat();
    }

    public static float getChar(String texto) {
        System.out.println(texto);
        return leia.next().charAt(0);
    }

    public static String getString(String texto) {
        System.out.println(texto);
        return leia.nextLine();
    }

    public static boolean confirmarSaida() {
        System.out.println("Deseja sair? [S] --  [N]");
        String sair;
        sair = leia.next();
        if (sair.equalsIgnoreCase("S")) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean validarNumeroPositivoInt(int num) {
        if (num >= 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean validarNumeroPositivoFloat(float num) {
        if (num >= 0) {
            return true;
        } else {
            return false;
        }
    }

    public static float getFloatEntreintervalos(String texto, int num1, int num2) {
        float valor = 0;

        if (valor > num1 && valor < num2) {
            return valor;
        } else {
            System.out.println("O valor não está entre os números " + num1 + " e " + num2);
            return 0;
        }
    }

    public static char getCharUpperCase(char letra) {
        letra -= 32;
        return letra;
    }

    public static String capitalize(String nome) {
        nome = " " + nome + " ";
        String letra = "";
        String palavra = "";
        String y;
        int contador = 2;
        for (int i = 0; i < nome.length(); i++) {
            if (!String.valueOf(nome.charAt(i)).equals(" ")) {
                if (contador == 0) {
                    letra += String.valueOf(nome.charAt(i)).toUpperCase();
                } else {
                    letra += String.valueOf(nome.charAt(i));
                }
                contador = 1;

                palavra += String.valueOf(nome.charAt(i));
            } else {
                if (palavra.equalsIgnoreCase("os") || palavra.equalsIgnoreCase("as") || palavra.equalsIgnoreCase("ou") || palavra.equalsIgnoreCase("e") || palavra.equalsIgnoreCase("em") || palavra.equalsIgnoreCase("pelo") || palavra.equalsIgnoreCase("da") || palavra.equalsIgnoreCase("de")) {
                    String x = String.valueOf(nome.charAt(i - 2)).toLowerCase() + String.valueOf(nome.charAt(i - 1)).toLowerCase();
                    palavra = palavra.replaceAll(String.valueOf(palavra.charAt(0)), String.valueOf(palavra.charAt(0)).toUpperCase());
                    y = letra.replace(palavra, x);
                    letra = y;
                }

                if (contador > 0) {
                    letra += " ";
                    palavra = "";
                }
                contador = 0;
            }
        }
        return letra.trim();
        
    }
}
