class Print {
    public String delimiter = "";

    public Print(String delimiter){ // 생성자 정의. 자기 자신. 컨스트럭트 메서드.
        this.delimiter = delimiter; //this: 우리가 생성할 인스턴스를 가리킴.
    }

    public void A() {
        System.out.println(this.delimiter);
        System.out.println("A");
        System.out.println("A");
    }

    public void B() {
        System.out.println(this.delimiter);
        System.out.println("B");
        System.out.println("B");
    }
}
