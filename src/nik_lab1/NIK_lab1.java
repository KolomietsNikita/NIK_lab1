
package nik_lab1;

import java.util.Scanner;


public class NIK_lab1 {
    
public static void main(String[] args) {
 try {
Scanner scan = new Scanner(System.in);

System.out.println("Cоздание простой консольной программы");
System.out.print("Введите число X: " );
double x = scan.nextDouble();
System.out.print("Введите А (число больше нуля): ");
double a = scan.nextDouble();
System.out.print("Введите B(число более нуля): ");
double b = scan.nextDouble();
double y;

if (x >= 8) {
y = (((a*a)*(x*x))+b) / (2 * x);
} else {
y = (Math.pow(a, 2))-2*(Math.pow(x, 2));

}
System.out.format("Y=%.3f", y);
//System.out.print("Y="+ y);
System.out.println();
} catch (Exception e) {
System.out.println("Входные параметры заданы неверно!");
}

    }
    
}
