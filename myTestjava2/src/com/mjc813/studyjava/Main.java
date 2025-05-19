package com.mjc813.studyjava;

public class Main {
    public static void main(String[] args) {
        Problem13 result = new Problem13();
        result.Member("홍길동", "mjc813", "a1234", 24);
        result.Member("홍길동", "hong");


        MemberService memberService = new MemberService();
        boolean result1 = memberService.login("hong", "12345");

        if (result1) {
            System.out.println("로그인 되었습니다");
            memberService.logout("hong");
        }else{
            System.out.println("id 또는 password가 올바르지 않습니다.");
        }

        Printer printer = new Printer();
//        printer.println(10);
//        printer.println(true);
//        printer.println(5.7);
//        printer.println("홍길동");
//

        Printer.println(10);
        Printer.println(true);
        Printer.println(5.7);
        Printer.println("홍길동");
        
        ShopService obj1 = ShopService.getInstance();
        ShopService obj2 = ShopService.getInstance();
        
        if (obj1.equals(obj2)) {
            System.out.println("같은 ShopService 객체입니다.");
        }else{
            System.out.println("다른 ShopService 객체입니다.");
        }
        
    }
}