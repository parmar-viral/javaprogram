import java.io.*;
public class file {
    public static void main(String[] args) throws IOException{
        /*
            // code for creating a new file or check file is exixsting or not
            File f=new File("f1.txt");
            if (f.createNewFile()) {
                System.out.println("New file is created..........");
            }else{
                System.out.println("File is already existing.............");
            } 
            f.close();
         */
        /*
            // code for writing string into a file using FileWriter class

            FileWriter w=new FileWriter("f1.txt");
            w.write("java is a high level programming language............");
            System.out.println("successfully written into a file");

            w.close();
         */

        // code for RandomAccessFile .....................

        RandomAccessFile RAF=new RandomAccessFile("RandomFile.txt","rw"); 
       // RAF.write("RandomAccessFile Example".getBytes());
       RAF.write("hello".getBytes());
       RAF.write("\njava".getBytes());
       RAF.write("\nlanguage".getBytes());

      // RAF.seek(6);
      // RAF.write("JAVA".getBytes());
        System.out.println("successfully written into file using RandomAccessFile...."); 

        RAF.close();
            
    }
}
