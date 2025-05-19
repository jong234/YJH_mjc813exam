package com.mjc813.studyjava;

public class MemberService {
    String id, pw;

    public boolean login(String id, String pw) {
        this.id = id;
        this.pw = pw;

        if("hong".equals(id) && "12345".equals(pw)) {
           return true;
        }else{
            return false;
        }
    }

    public void logout(String id) {
        this.id = id;
        if("hong".equals(id)) {
            System.out.println(id +"님이 로그아웃 되었습니다.");
        }
    }
}
