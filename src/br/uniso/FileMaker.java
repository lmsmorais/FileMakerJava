package br.uniso;

import java.io.*;

public class FileMaker {
    public static void main (String[] args) {
        //definir strings
        String s = "String0";
        String s1 = "String1";
        String s2 = "String2";
        String s3 = "String3";

        //definindo um vetor
        String vetor[] = new String[4];

        //atribuir dados ao vetor
        vetor[0] = s;
        vetor[1] = s1;
        vetor[2] = s2;
        vetor[3] = s3;

        //criar novo arquivo
        File f = new File("arquivoTeste");

        //tratar exceção
        try {
            f.createNewFile();

            OutputStream is = new FileOutputStream(f);
            OutputStreamWriter isr = new OutputStreamWriter(is);
            BufferedWriter br = new BufferedWriter(isr);

            //escrever o conteudo da string no arquivo
            for(String cada : vetor){
                br.write(cada + "\n");
            }
            //zerar o buffer
            br.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
