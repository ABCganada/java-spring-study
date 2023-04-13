public class LoopApp {
    public static void main(String[] args){

        int i = 0;
        // while문
        System.out.println("=== while ===");
        while(i<=5){
            System.out.println("Loop");
            i++;
        }
        System.out.println("external loop");

        System.out.println("=== for ===");
        for(i=0; i<5; i++){
            System.out.println("LOOP");
        }
        System.out.println("external loop");
    }
}
