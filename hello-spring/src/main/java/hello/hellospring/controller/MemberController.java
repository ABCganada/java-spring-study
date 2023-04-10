package hello.hellospring.controller;

import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MemberController {

    private final MemberService memberService;

    @Autowired  // 스프링 컨테이너에서 자동으로 연결. 멤버서비스를 가져옴.
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }
    /*
    멤버컨트롤러가 생성이 될 때, 스프링 빈에 등록되어 있는 멤버서비스객체를 가져다가 연결함.
    Dependency injection. DI
    */
}
