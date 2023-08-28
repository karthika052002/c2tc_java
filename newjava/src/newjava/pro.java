package newjava;

import java.util.Scanner;

public class pro {
	public static void main(String[] args)
	{
		Scanner obj =new Scanner(System.in);
		int income;
		String name;
		System.out.println("enter name");
		name=obj.nextLine();
		System.out.println("enter income");
		income=obj.nextInt();
		demo d=new demo();
		d.setName(name);
		d.setIncome(income);
		System.out.println(d);
		tax t=new tax();
		t.calc(d);
		
		System.out.println("Name:"+d.getName());
		System.out.println("Income:"+d.getIncome());
		System.out.println("Tax:"+d.getTax());
		
	}

}
