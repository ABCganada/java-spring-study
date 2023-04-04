class Foo{
    public static String classVar = "I class var";
    public String instanceVar = "I instance var";
    public static void classMethod(){
        System.out.println(classVar);
//        System.out.println(instanceVar);    // Error
    }
    public void instanceMethod(){
        System.out.println(classVar);
        System.out.println(instanceVar);    // 모두 접근 가능
    }
}
public class StaticApp {
    public static void main(String[] args){
        // instnace를 통한 접근 실험
        System.out.println("--- class TEST ---");
        System.out.println(Foo.classVar);   // class를 통해 class 변수 접근 된다.
//        System.out.println(Foo.instanceVar);    // class를 통해 instance 번수 접근 안 됨.
        Foo.classMethod();
//        Foo.instanceMethod(); // class를 통해 instance 메서드 접근 안 됨.

        // instnace를 통한 접근 실험
        System.out.println("--- instance TEST ---");
        Foo f1 = new Foo();
        Foo f2 = new Foo();
        System.out.println(f1.classVar);
        System.out.println(f1.instanceVar);

        System.out.println("--- classVar change TEST ---");
        f1.classVar = "change classVar";     // 바꾸면 클래스변수 자체가 바뀜.
        System.out.println(Foo.classVar);
        System.out.println(f1.classVar);
        System.out.println(f2.classVar);

        System.out.println("--- instanceVar change TEST ---");
        f1.instanceVar = "change instanceVar";  // 바꾸면 f1에 대해서만 바뀜.
        System.out.println(f1.instanceVar);
        System.out.println(f2.instanceVar);

        System.out.println("--- call method by instance TEST ---");
//        f1.classMethod(); // instance를 통해 class 메서드 접근 안 됨.
        f1.instanceMethod();
    }
}
