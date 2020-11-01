package com.Capgemini.Regex;

import java.util.regex.*;

import java.util.*;

public class PinCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Pincode To Validate");
		String pin = sc.nextLine();
		PinCode p = new PinCode();
		p.checkPinCode(pin);
		sc.close();
	}

	public void checkPinCode(String str) {
		String regex = "^[1-9]{1}[0-9]{2}\\s{0,1}[0-9]{3}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(str);
		boolean valid = matcher.matches();
		if (valid == true) {
			System.out.println("Valid Pin Code");
		} else if (valid == false) {
			System.out.println("Invalid Pin Code");
		}

	}
}
/* UC-4 */