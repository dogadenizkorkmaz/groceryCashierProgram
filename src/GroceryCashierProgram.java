import java.util.Scanner;
public class GroceryCashierProgram {

    public static void main(String[] args) {


        double a, e, d, m, p;

        //define Scanner
        Scanner doa=new Scanner(System.in);

        //get values from user
        System.out.print("Armut Kaç Kilo ? :");
        a= doa.nextDouble();

        System.out.print("Elma Kaç Kilo ? :");
        e= doa.nextDouble();

        System.out.print("Domates Kaç Kilo ? :");
        d= doa.nextDouble();

        System.out.print("Muz Kaç Kilo ? :");
        m= doa.nextDouble();

        System.out.print("Patlıcan Kaç Kilo ? :");
        p= doa.nextDouble();

        //Define value in TL per unit
        double x=a*2.14, y=e*3.67, z=d*1.11, w=m*0.95, i=p*5.00;

        //Total price calculation
        double total = x+y+z+w+i;

        System.out.println("Toplam Tutar :" +total + " TL");


    }
}
