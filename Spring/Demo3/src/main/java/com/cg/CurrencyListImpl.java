package com.cg;

import java.util.ArrayList;


public class CurrencyListImpl implements CurrencyList {
  ArrayList<String> currList=new ArrayList<String>();
	public void setCurrList(ArrayList<String> currList) {
	this.currList = currList;
}
	public ArrayList<String> getCurrList() {
	     
		return currList;
	}

}
