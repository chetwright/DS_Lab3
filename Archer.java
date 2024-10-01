public class Archer implements Job
{
	@Override
	public int attack(int val,Hero x)
	{
		return (x.getDEX()+x.getINT()*val);
	}
}