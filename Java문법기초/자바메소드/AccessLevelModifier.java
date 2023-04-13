class Greeting{
    // public, protected, default, private
    // private: 같은 클래스 안에서만 사용할 수 있음
    public static void hi(){
        System.out.println("HI");
    }
}
public class AccessLevelModifier {
    public static void main(String[] args){
        Greeting.hi();
    }
}
