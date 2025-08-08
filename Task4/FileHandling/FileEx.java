package FileHandling;
import java.io.*;
class FileEx{
    public static void main(String[] args) {
        File f=new File("report.txt");
        /*try{
        BufferedWriter bw=new BufferedWriter(new FileWriter(f,true));
        bw.write("hello");
        bw.newLine();
        bw.write("Written using the Buffered writer");
        bw.close();
        }
        catch(IOException e){
            System.err.println(e.getMessage());
        } */ //content written to file using BufferedWriter

       try{
        FileWriter fw=new FileWriter(f,true);
        fw.write("Hello !");
        fw.write("\n"+"This is a text written by using file writer");
        fw.close();
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }

      /*   try{
            FileReader fr=new FileReader(f);
            StringBuilder sb=new StringBuilder();
            int ch;
            while((ch=fr.read())!=-1){
                //System.out.println((char)ch);
                sb.append((char)ch);
            } 
            System.out.println(sb.toString());
        }
        catch(IOException e){
            System.err.println(e.getMessage());
        }  */  //using file reader
        
        try{
            BufferedReader br=new BufferedReader(new FileReader(f));
            String line;
            while((line=br.readLine())!=null){
                System.out.println(line);

            }
        }
        catch(IOException e){
            System.err.println(e.getMessage());
        }
    }
}