import java.util.Scanner;

class olaapplication {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		oladriver od = new oladriver();
		boolean b = true;
		do {
			System.out.println("1.mini 2.prime 3.sweden 4.exit");
			switch (sc.nextInt()) {
				case 1: {
					System.out.println("Enter name");
					String name = sc.next();
					System.out.println("Enter age");
					int age = sc.nextInt();
					System.out.println("Enter KM");
					int km = sc.nextInt();
					mini m = new mini(name, age, km);
					od.choose(m);
					break;
				}
				case 2: {
					System.out.println("Enter name");
					String name = sc.next();
					System.out.println("Enter age");
					int age = sc.nextInt();
					System.out.println("Enter KM");
					int km = sc.nextInt();
					prime p = new prime(name, age, km);
					od.choose(p);
					break;
				}
				case 3: {
					System.out.println("Enter name");
					String name = sc.next();
					System.out.println("Enter age");
					int age = sc.nextInt();
					System.out.println("Enter KM");
					int km = sc.nextInt();
					sweden s = new sweden(name, age, km);
					od.choose(s);
					break;
				}

				case 4: {
					b = false;
				}
			}

		} while (b);
	}
}
