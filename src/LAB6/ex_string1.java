package LAB6;

public class ex_string1 {
    public static void main(String[] args) {
        String msg;
        msg = new String("Hello");
        System.out.println(msg);

        String msg2 = "OOP";
        System.out.println(msg2);

        String msg3 = "OOP";

        //compare String
        if (msg2 == msg3){
            System.out.println("True.");
        }else
            System.out.println("False");

        boolean b = msg2.equals(msg3);
        System.out.println(b);

        if (msg2.equals(msg3))
        {
            System.out.println("True.");
        } else
            System.out.println("False");

        System.out.println(msg2.equals(msg3)?"True_":"False");

        msg2 = "RMUTSV";
        msg3 = "RUTS";
        int x = msg2.compareTo(msg3);
        if (x == 0)
        {
            System.out.println("Same Message");
        }else if (x<0){
            System.out.println("Difference Message (-)");
            System.out.println(x);
        }
        else
            System.out.println("Difference Message (+)");
            System.out.println(x);
    }
}
