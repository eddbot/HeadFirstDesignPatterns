import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {

        int c;

        try {
            InputStream in = new UpperCaseInputStream(
                    new BufferedInputStream(
                            new FileInputStream(
                                  "C:\\Users\\eddie\\code\\HeadFirstDesignPatterns\\Chapter3.DesignADecorator\\src\\test.txt"
                            )));
            while((c = in.read()) >=0 ) {
                System.out.print((char)c);
            }

        } catch (IOException e){
            e.printStackTrace();
            throw e;
        }
    }
}