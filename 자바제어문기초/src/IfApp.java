import java.util.Scanner;
public class IfApp {
    public static void main(String[] args) {
        System.out.println("a");

//        if(false){
//            System.out.println(1);
//        } else{
//            if(true){
//                System.out.println(22);
//            } else{
//                System.out.println(33);
//            }
//            System.out.println(2);
//        }
        if(false){
            System.out.println(1);
        } else if(true) {
            System.out.println(2);
        } else {
            System.out.println(3);
        }

        Scanner input = new Scanner(System.in);

        String id = "SMK";
        String password = "aaaa";

        System.out.print("아이디: ");
        String inputId = input.next();
        System.out.print("비밀 번호: ");
        String inputPass = input.next();

        System.out.println("Hi.");
        if(inputId.equals(id) && inputPass.equals(password)){
            System.out.println("master!");
        } else{
            System.out.println("Who are you?");
        }




    }
}
