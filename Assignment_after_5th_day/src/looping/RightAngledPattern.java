package looping;

public class RightAngledPattern {

	public static void main(String[] args) {
		int i,j,n = 1;
		for(i=0;i<6;i++)
		{
			for(j=0;j<n;j++)
			{
				System.out.print("@ ");
			}
			n=n+1;
			System.out.println();
		}
	}

}
