package hello.hellospring.domain;


import javax.persistence.*;

@Entity // 자바가 관리하는 엔티티
public class Member {

    @Id //primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)     // Id를 자동으로 생성해주는 전략
    private Long id;        //id 식별자. 고객이 정하는 id가 아닌 시스템이 저장하는 id

    private String name;    //이름

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
