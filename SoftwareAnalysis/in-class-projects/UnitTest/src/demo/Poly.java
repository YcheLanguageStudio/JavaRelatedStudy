package demo;
import java.util.*;

public class Poly implements Cloneable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public Mono [] elements = new Mono[Mono.MAX];
	
	public Poly() {
		for (int i=0; i < Mono.MAX; ++i)
			elements[i] = new Mono(0,1,i);
	}
	
	public Poly sum(Mono m) throws IllegalArgumentException, CloneNotSupportedException {
		Poly p = this.clone();
		Mono e = p.elements[m.exp];
		e.num = e.num*m.den + m.num*e.den;
		e.den = e.den*m.den;
		return p;
	}
	
	public void add(Mono m) throws IllegalArgumentException, CloneNotSupportedException {
		elements = sum(m).elements;
	}
	
	public Poly multMono(Mono m) throws IllegalArgumentException {
		if (m == null) throw new IllegalArgumentException();
		Poly p = new Poly();
		for (int i=0; i<elements.length; ++i) {
			Mono e = elements[i];
			int j = e.exp + m.exp;
			if (e.num*m.num != 0) {
				if (j >= Mono.MAX) throw new IllegalArgumentException();
				p.elements[j].num = e.num*m.num;
				p.elements[j].den = e.den*m.den;
				p.elements[j].exp = j;
			}
		}
		return p;
	}
	
	public Poly mult(Poly p) throws IllegalArgumentException, CloneNotSupportedException {
		if (p == null) throw new IllegalArgumentException();
		Poly e = this.clone();
		for (Mono m: p.elements) {
			e = e.multMono(m);
		}
		return e;
	}
	
	public Poly clone() throws CloneNotSupportedException {
		try {
			Poly p = (Poly) super.clone();
			p.elements = elements.clone();
			return p;
		} catch (CloneNotSupportedException e) {
			throw e;
		}
	}
	
	public String toString() {
		String s = elements[0].toString();
		for (int i=1; i<elements.length; ++i) {
			s = s + " + " + elements[i].toString();
		}
		return s;
	}
}
