import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WhyMethod {
    public static void main(String[] args) throws IOException {

//        printTwoTimes("E", "-");
//        printTwoTimes("A", "&");
//        printTwoTimes("T", "!");

        System.out.println(twoTimes("a", "-"));

        FileWriter fw = new FileWriter("out.txt");
        fw.write(twoTimes("a", "*"));
        fw.close();

//        printSomething();

    }
    public static String twoTimes(String text, String delimiter){
        String out = "";
        out += delimiter + "\n";
        for(int i=0; i<2; i++){
            out += text + "\n";
        }
        return out;
    }
    public static void printTwoTimes(String text, String delimiter){
        System.out.println(delimiter);
        System.out.println(text);
        System.out.println(text);
    }
    private static void printSomething() {
        System.out.println("asd");
        System.out.println("asd");
        System.out.println("***");
    }
}
