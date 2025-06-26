package javaIO;

import java.util.function.BiFunction;

public class weightCalculator
{
	
	public static void weightOnEarth(int weight) 
	{
		System.out.println("Weight on earth is:"+weight);
	}
	
	
	public static void weightOnAnnotherPlanets(int weight)
	{
		String planets[]= {"mercury","venus","moon","mars"};
		double gravity[]= {3.7,8.87,1.62,3.71};
		double earthGravity=9.81;
		
		 BiFunction<Integer, Double, Double> calculateWeight = (w, g) -> w * (g / earthGravity);

	        System.out.println("Weight on other planets:");
	        for (int i = 0; i < planets.length; i++) {
	            double planetWeight = calculateWeight.apply(weight, gravity[i]);
	            System.out.printf("→ %s: %.2f kg\n", planets[i], planetWeight);
	        }
		
	}

	public static void main(String[] args)
	{
		weightCalculator.weightOnEarth(70);
		weightCalculator.weightOnAnnotherPlanets(70);
		
	}

}
