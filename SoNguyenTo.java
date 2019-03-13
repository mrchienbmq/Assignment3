package lab1_session3;

import java.util.Scanner;

public class SoNguyenTo {
     int a = 0;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

     public SoNguyenTo(){

     }
     public SoNguyenTo(int a){
        Scanner scanner = new Scanner(System.in);
        int x = 0;
        if(a >= x){
            System.out.println("Nhập Số: ");
            x = scanner.nextInt();
        }


     }

      public void isSoNguyenTo(){
        if (this.a>1){
            System.out.println("X là số nguyên tố lưu : ");
            return;
          }
        System.out.println("Không phải số nguyên tố, không lưu trữ.");
        }


      }

