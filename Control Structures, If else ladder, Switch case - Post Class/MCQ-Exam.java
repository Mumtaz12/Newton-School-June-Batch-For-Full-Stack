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
		Scanner sc = new Scanner(System.in);
        int arr[]=new int[4];
        for(int i=0;i<4;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);

        System.out.println(arr[3]);
	}
}
/******************************************************************************************************************************************/
/***********End****************/
