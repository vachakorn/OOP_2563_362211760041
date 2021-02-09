package LAB3;
<<<<<<< HEAD

import java.util.Scanner;

=======
import java.util.Scanner;
>>>>>>> origin/master
public class ex_switch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
<<<<<<< HEAD
        System.out.println("ชอบผลไม้อะไรมากที่สุด : ");
=======

        System.out.println("ชอบผลไม้อะไรมากที่สุด ?");
>>>>>>> origin/master
        System.out.println("1.กล้วย");
        System.out.println("2.ส้ม");
        System.out.println("3.ทุเรียน");
        System.out.println("4.มะม่วง");
<<<<<<< HEAD
        System.out.println("เลือก 1-4");

        int select = sc.nextInt();
        switch (select){
            case 1: System.out.println("กล้วย เอาไปทำกล้วยกวนได้นะ");
            break;
            case 2: System.out.println("น้ำส้มคั้นสดชื่นมากๆ");
            break;
            case 3: System.out.println("ทุเรียนราคาแพงมากๆ");
            break;
            case 4: System.out.println("มะม่วงต้องทานกับข้าวเหนียวมูลเท่านั้น");
            break;
            default:
            System.out.println("โทดที ผลไม้มีแค่ 4 ชนิดเท่านั้นนะ");

        }
        System.out.println("Good Bye.");












=======
        System.out.print("เลือก (1-4)?");
        int select = sc.nextInt();

        switch (select){
            case 1: System.out.println("กล้วย เอาไปทำกล้วยกวนได้นะ");
                break;
            case 2: System.out.println("น้ำส้มคั้น สดชื่นมากๆ ");
                break;
            case 3: System.out.println("ทุเรียนส่งออกราคาแพงมากๆ ");
                break;
            case 4: System.out.println("มะม่วง ต้องทานกับข้าวเหนียวมูลเท่านั้น");
                break;

            default:System.out.println("ขอโทษที มีผลไม้แค่ 4 ชนิดเท่านั้นนะ");
        }

        System.out.println("Good Bye");
>>>>>>> origin/master




<<<<<<< HEAD
    }//main
}//class
=======
    }
}
>>>>>>> origin/master
