import java.util.Scanner;
class sweden extends ola 
{
	Scanner sc=new Scanner(System.in);
	int pricekm1=37;
	sweden (String name, int age, int km)
	{
		super(name, age, km);
		this.name=name;
		this.age=age;
		this.km=km;
	}
	public void bill()
	{
		int pay=pricekm1*km;
		System.out.println("User you have to pay "+ pay);
		System.out.println("Enter Your money to Book");
		int money=sc.nextInt();
		if (money>=pay)
		{
			System.out.println("Payment is Succesfull");
			System.out.println("Order is Confirmed");
		}
		else 
		{
			System.out.println("Order is not confirmed");
		}
	}

}
