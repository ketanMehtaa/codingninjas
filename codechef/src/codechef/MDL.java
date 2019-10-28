import java.util.*;
class TestPQ
{
	public static void main(String args[])
	{
		Scanner H = new Scanner(System.in);
		int T = H.nextInt();
		int b[][] = new int[T][2];
		int t1,t2,t3;
		int c = 0;
		for(int i=0;i<T;i++)
		{
			int N = H.nextInt();
			c = 0;
			t1 = H.nextInt();
			t2 = H.nextInt();
			if(t1>t2)
			{
				t3 = t2;
				t2 = t1;
				t1 = t3;
				c = 1;
			}
			for(int j=2;j<N;j++)
			{
				t3 = H.nextInt();
				if(t3>t2)
				{
					t2 = t3;
					c = 0;
				}
				else if(t3<t1)
				{
					t1 = t3;
					c = 1;
				}
			}
			if(c==0)
			{
				b[i][0] = t1;
				b[i][1] = t2;
			}
			else
			{
				b[i][0] = t2;
				b[i][1] = t1;
			}
		}
		for(int i=0;i<T;i++)
		{
			System.out.println(b[i][0]+" "+b[i][1]);
		}
	}
}
