package com.company;

public class Main {

    public static void main(String[] args) {
        String texto = "Dear Sally, " +
                "Please, please do it--it would please " +
                "Mary very, very much. And Mary would " +
                "do everything in Mary's power to make " +
                "it pay off for you. " +
                "-- Thank you very much --";
        System.out.println(compactarArquivo(texto));
    }

    public static String compactarArquivo(String arquivo) {
        String[] saida = arquivo.split(" ");
        String[] compare = new String[saida.length];
        String[] arqSaida = new String[saida.length];
        int count = 0;
        for (int i = 0; i < saida.length; i++) {
            compare[i] = saida[i];
        }

        for(int i = 0; i < saida.length; i ++) {
            for(int j = 0; j < compare.length; j++) {
                if(saida[i].equals(compare[j])) {
                    arqSaida[i] = compare[j];
                }
            }
        }

        for(String row : arqSaida) {
            System.out.println(row);
        }

        return "";
    }
}
