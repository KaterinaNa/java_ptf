package ru.stqa.pft.sandbox;

import javax.sound.midi.Soundbank;

public class MyFirstProgram1 {
	
	public static void main (String [] args) {
		hello("world");
		hello("user");
		hello("Alex");
		double l = 5;
		System.out.println( "Ploshad kvadrata si storonoj " + l + " = " +area(l));
		double a = 4;
		double b = 5;
		System.out.println("ploshad pryamougolnika so storonami " + a + " & " +b+ " = " + area (a,b));


	}

	public static void hello(String somebody) {

		System.out.println("Hello, " + somebody + "!");
	}
	public static double area (double len) {
		return len*len;
	}

	public static double area (double a, double b) {
		return a*b;

	}

	}
