import java.util.Scanner;
class Task1 extends Thread
{
	public void run()
	{
		Scanner sc1= new Scanner(System.in);
        int n1 = sc1.nextInt();
        System.out.println(n1);
        sc1.close();
		
	}
}
class Task2 extends Thread
{
	public void run()
	{
		Scanner sc2= new Scanner(System.in);
        int m1 = sc2.nextInt();
        System.out.println(m1);
        sc2.close();
		
	}
}
class Task3 extends Thread {

	public void run()
	{
		 Scanner sc3= new Scanner(System.in);
        int p1 = sc3.nextInt();
        System.out.println(p1);
        sc3.close();
		
	}
}

public class ThreadAraay {

	public static void main(String[] args) {
		
     //  List<Object> mk = new ArrayList<>();
       Thread t1 = new Task1();
       Thread t2 = new Task2();
       Thread t3 = new Task3();
       t1.start();
       t2.start();
       t3.start();
         /*for(int z : mk)
         {
        	 System.out.println(z);
         } */
        
	}

}
