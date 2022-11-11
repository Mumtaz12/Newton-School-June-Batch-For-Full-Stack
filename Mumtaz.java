public class Mumtaz {
  static int Findigit(int n,int k){
    while(n!=0){
      n=n%10;
    }

  }
  public static void main(String[] args) {
    int n=1234;
    int k=2;
    System.out.println(Findigit(n,k));

  }
}
}