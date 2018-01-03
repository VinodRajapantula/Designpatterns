package com.epam;

public class PattersnTest {

	public static void main(String[] args) {
		OsFactory osFactory = new OsFactory();
		osFactory.getOs("ios").spec();

	}

}
