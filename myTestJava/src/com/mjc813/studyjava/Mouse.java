package com.mjc813.studyjava;

public class Mouse {
   int pointX = 0;
   int pointY = 0;

   public void leftClick(int x, int y) {
       pointX = x;
       pointY = y;

       System.out.println("마우스 ("+ x +", " +y+") 왼쪽버튼 클릭됨");
   }
   public void rightClick(int x, int y) {
       pointX = x;
       pointY = y;

    System.out.println("마우스 ("+ x +", " +y+") 오른쪽버튼 클릭됨");
   }
}
