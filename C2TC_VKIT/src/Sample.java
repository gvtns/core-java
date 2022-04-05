
public class Sample 
{
	int i,j,k;
	
	public Sample(int i) {
		this.i = i;
	}

	public Sample(int i, int j) {
		this(i);
		this.j = j;
	}

	public Sample(int i, int j, int k) {
		this(i,j);
		this.k = k;
	}
	public void display()
	{
		System.out.println("i, j,k values are "+i+" "+j+" "+k);
	}

	public void m1()
	{
		this.display();
	}
}
