package newjava;

public class tax {
	
	public void calc(demo o)
	{
		if(o.getIncome()<30000) {
			o.setTax(0);
			
		}
		else if(o.getIncome()>=30000 && o.getIncome() <50000)
		{
			o.setTax(5);
		}
		else {
			
			o.setTax(10);
		}
		
	}

	

}
