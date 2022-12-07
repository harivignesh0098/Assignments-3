package assignment3;

public class FindInterSection 
{
	public static void main(String[] args) 
	{
		int[] numa={3,2,11,4,6,7};
		int[] numb={1,2,8,4,9,7};
		for(int i=0;i<=numa.length-1;i++) 
		{
			for(int j=0;j<=numb.length-1;j++) 
			{
				if(numa[i]==numb[j])
					System.out.println(numa[i]);
			}
		}

	}

}
