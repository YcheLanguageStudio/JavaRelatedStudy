package demo;

import org.junit.Assert;

public class Mono implements Cloneable {

	public static void main(String[] args) {
		System.out.println(new Mono());
	}
	/*
	public static void main4Randoop(String[] args) {
		main(args);
	}
	*/

	public int num, den, exp;
	public static final int MAX = 10;
	
	public Mono() {
		num = 0;
		den = 1;
		exp = 0;
	}
	
	public Mono(int num, int den, int exp) throws IllegalArgumentException {
		if (den <= 0 || exp >= MAX  || exp < 0) throw new IllegalArgumentException();
		this.num = num;
		this.den = den;
		this.exp = exp;
	}
	
	public Mono clone() throws CloneNotSupportedException {
		try {
			return (Mono) super.clone();
		} catch (CloneNotSupportedException e) {
			throw e;
		} 
	}

	public String toString() {
		return ("(" + num + "/" + den + ")x^" + exp);
	}
}
