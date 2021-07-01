import java.util.Arrays;
import java.util.Random;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
			int Arr[]=new int[2000];
			Random random = new Random();
			for(int i=0;i<Arr.length ;i++) {
				Arr[i]=random.nextInt(100000);
				
			}
			
			
			//element = Arr[1500];
					//random.nextInt(100000);
			Arrays.sort(Arr);
			int element =Arr[random.nextInt(2000)]; 
			MyThread t1=new MyThread("linear", Arr, element);
			MyThread t2=new MyThread("binary", Arr, element);
			t1.start();
			t2.start();
	}

}
