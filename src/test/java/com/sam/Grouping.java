package com.sam;

import org.testng.annotations.Test;

public class Grouping {
@Test(groups= {"fruit"})
public void Apple() {
	System.out.println("appple");
}

@Test(groups= {"fruit"})
public void mango() {
	System.out.println("mango");
}

@Test(groups= {"fruit"})
public void orange() {
	System.out.println("organge");
}


@Test(groups= {"veggi"})
public void carrot() {
	System.out.println("carrot");
}
@Test(groups= {"veggi"})
public void Beans() {
System.out.println("beans");
}
}

