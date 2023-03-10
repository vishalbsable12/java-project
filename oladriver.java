class oladriver 
{
	ola o;
	public void choose(ola o) // mini,prime,sweden
	{
		this.o=o;
		if (o instanceof mini)
		{
			mini m1=(mini)o;
			m1.bill();
		}
		else if (o instanceof prime)
		{
			prime p1=(prime)o;
			p1.bill();
		}
		else 
		{
			sweden s1=(sweden)o;
			s1.bill();
		}
	}
}
