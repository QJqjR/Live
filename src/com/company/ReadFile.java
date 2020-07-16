package com.company;
import java.io.*;

public class ReadFile {
    public static void main(String[] args) throws IOException {
        File file = new File("text.txt");
        if (file.exists()){
            System.out.println("exist");
            try {
                FileInputStream fis = new FileInputStream(file);
                InputStreamReader isr = new InputStreamReader(fis,"utf-8");
                BufferedReader br = new BufferedReader(isr);
                String line;
                while ((line =  br.readLine())!=null){
                    System.out.println(line);
                }
                br.close();;
                isr.close();
                fis.close();

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }


        }
        File newfile = new File("newtext.txt");
        FileOutputStream fos = new FileOutputStream(newfile);
        OutputStreamWriter osw = new OutputStreamWriter(fos);
        BufferedWriter bw  =  new BufferedWriter(osw);

        bw.write("明月照沟渠");

        bw.close();
        osw.close();
        fos.close();
        System.out.println("写入完成");



    }
}
