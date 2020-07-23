package com.supraja.epamtask6_Supraja;

public class App {

	public static void main(String[] args) {
		NewlyCreatedCustumList<Integer> newCustList = new NewlyCreatedCustumList<Integer>();
		newCustList.add(8);
		newCustList.add(7);
		newCustList.add(6);
		newCustList.add(5);
		newCustList.add(4);
        System.out.println("List is : " + newCustList);
        newCustList.add(6);
        System.out.println("After ADD operation : " + newCustList);
        newCustList.remove(3);
        System.out.println("After REMOVE operation " + newCustList);
        System.out.println("Performing GET operation "  +  newCustList.get(1));
        System.out.println("Finding SIZE of list "  +  newCustList.size());
        newCustList.clear();
        System.out.println("After CLEAR operation " + newCustList);
	}

}
