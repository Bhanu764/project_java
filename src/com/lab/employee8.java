package com.lab;
import java.math.BigInteger;

public class employee8 {
	
	public static void main(String[] args) {
		String emp = "King";
		BigInteger s = new BigInteger("27000");
		BigInteger pf =s.multiply(BigInteger.valueOf(5)).divide(BigInteger.valueOf(100));
		BigInteger cgst =s.multiply(BigInteger.valueOf(7)).divide(BigInteger.valueOf(100));
		BigInteger da =s.multiply(BigInteger.valueOf(3)).divide(BigInteger.valueOf(100)); 
		BigInteger netSalary=s.add(da).subtract(pf).subtract(cgst);
		BigInteger m=new BigInteger("12");
		BigInteger annualS=s.multiply(m);
		
		System.out.println("Emp Name: "+emp);
		System.out.println("PF Deduction = "+pf);
		System.out.println("CGST Deduction = "+cgst);
		System.out.println("DA Credits = "+da);
		System.out.println("Net Monthly Salary = "+netSalary);
		System.out.println(s);

	}

}
