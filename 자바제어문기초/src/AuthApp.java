import java.util.Scanner;
public class AuthApp {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String[][] users = {
                {"egoing", "1111"},
                {"jinhyuk", "2222"},
                {"youbin", "3333"}
        };

        String inputId = input.next();
        String inputPass = input.next();

        boolean isLogin = false;

        for(int i=0; i< users.length; i++){
            String[] currentId = users[i];
            if(currentId[0].equals(inputId) && currentId[1].equals(inputPass)){
                isLogin = true;
                break;
            }
        }
        System.out.println("Hi,");
        if(isLogin){
            System.out.println("Master");
        } else{
            System.out.println("Who are you");
        }
    }
}
