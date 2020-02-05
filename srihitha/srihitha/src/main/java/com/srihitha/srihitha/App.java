package com.srihitha.srihitha;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    private static Scanner in;

	public static void main( String[] args )
    {

    	in = new Scanner(System.in);
    	LinkedList<sweet> sweets=new LinkedList<sweet>();
        sweets.add(new Candy("cand1",20,5));
        sweets.add(new Chocolate("choc1",20,10));
        sweets.add(new sweet("cand2",9,5) {   
        	@Override	protected String getType() {return "candy";}});
        sweets.add(new sweet("choc2",90,20) {   
        	@Override	protected String getType() {return "chocolate";}});
        sweets.add(new Candy("cand3",15,20));
        sweets.add(new Chocolate("choc3",45,10));
        Gift newyear=new Gift(sweets);
        Integer totweight=newyear.Weightssum();
        System.out.println("sum of weights is:"+totweight);
        newyear.sortChocolates("cost");  
        System.out.println("sorting the chocolates in gift by cost");
        for (sweet s : newyear.sweets) {
        	if(s.getType()=="chocolate") {
			System.out.println(s.name); 
		}
      	}
        int lowlimit,highlimit;
        System.out.println("enter the lower limit/boundary for cost of gifts ");
        lowlimit=in.nextInt();
        System.out.println("enter the high limit/boundary for cost of gifts ");
        highlimit=in.nextInt();
        for (sweet s : newyear.sweets) {
        	if(s.getType()=="candy" && s.cost>lowlimit && s.cost<highlimit) {
			System.out.println(s.name);
        	}
        }
    }
}
