package JavaBasics;
// Object example
import JavaBasics.City;
		public class City
		{
		
		public String name;
		public long population;
		
		
		public void display()
		{
		System.out.println("City name: " +name);
		System.out.println("Population: " +population);
		}
		
		
		public static void main(String args[])
		{
		
		City metro1,metro2;
		metro1 = new City();
		metro2 = new City();
		metro1.name ="Mumbai";
		metro1.population = 23409876;
		System.out.println("Details of metro city 1:");
		metro1.display();
		metro2.name ="Pune";
		metro2.population = 45874294;
		System.out.println("Details of metro city 2:");
		metro2.display(); 
		}
		}
		


