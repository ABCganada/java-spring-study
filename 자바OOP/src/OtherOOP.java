import java.io.FileWriter;
import java.io.IOException;

public class OtherOOP {
    public static void main(String[] args) throws IOException {
        // class: System, Math, FileWriter
        // instance: f1, f2

        System.out.println(Math.PI);
        System.out.println(Math.floor(1.8));
        System.out.println(Math.ceil(1.8));

        FileWriter f1 = new FileWriter("data.txt");
        // FileWriter라는 클래스를 사용한 f1이라는 인스턴스
        f1.write("Hello");
        f1.write(" Java");
        f1.close();
    }
}
