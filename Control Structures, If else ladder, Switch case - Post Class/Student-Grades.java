/* Author = Mohammad Mumtaz */
/* leetcode = mohammadmumtaz1997 */
/* GitHub Id = Mumtaz12 */
/* Language = JAVA */
/* Address = kupwara,J&k,INDIA (193225)*/

/******************************************************************************************************************************************/
/***********Start****************/
import java.util.*;
import java.io.*;
class Main {
    public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
        int s1 = input.nextInt();
        int s2 = input.nextInt();
        int s3 = input.nextInt();
        int s4 = input.nextInt();
        int s5 = input.nextInt();
        int marks=(s1+s2+s3+s4+s5)/5;
        if (marks >= 80){
            System.out.println("A");
        }else if(marks <80 && marks >=60 ){
            System.out.println("B");
        }else if (marks <60 && marks>=40){
            System.out.println("C");
        }else{
            System.out.println("D");
        }
    }
}
/******************************************************************************************************************************************/
/***********End****************/
