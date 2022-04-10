
import java.util.Date;

public class SumTotal {
	public static void main(String[] args) {
		//sum1 시작
		try {
			long sum=0;
			long n=10;
			long start = System.currentTimeMillis();
			System.out.println(new Date());
			for(long i=1; i<=n; i++) {
				sum+=i;
			}
			System.out.println("1부터 " + n + "까지의 합 :" + sum);
			System.out.println(new Date());
			long end = System.currentTimeMillis();
			long diff = end - start;
			System.out.println("Differnce: " + diff);
		} catch (Exception e)	{
			System.out.println("An exception occurs");
		}
		//sum2 시작
		try {
			long sum=0;
			long n=10;
			long start = System.currentTimeMillis();
			System.out.println(new Date());
			for(long i = 1; i<=n; i++) {
				for(long j = 1; j<=i; j++) {
					sum = sum + 1;
				}
			}
			System.out.println("1부터 " + n + "까지의 합 :" + sum);
			System.out.println(new Date());
			long end = System.currentTimeMillis();
			long diff = end - start;
			System.out.println("Differnce: " + diff);
		} catch (Exception e)	{
			System.out.println("An exception occurs");
		}
		//sum3 시작
		try {
			long sum=0;
			long n=10;
			long start = System.currentTimeMillis();
			System.out.println(new Date());
			for(long i = 1; i<=n; i++) {
				for(long j = 1; j<=i; j++) {
					sum = sum + 1;
					for(long k = 1; k<=j; k++) {
						sum = sum + 0;
					}
				}
			}
			System.out.println("1부터 " + n + "까지의 합 :" + sum);
			System.out.println(new Date());
			long end = System.currentTimeMillis();
			long diff = end - start;
			System.out.println("Differnce: " + diff);
		} catch (Exception e)	{
			System.out.println("An exception occurs");
		}
	}
}
