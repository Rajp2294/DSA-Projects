package driver;

import java.util.Scanner;

import service.Construction;

public class SkyScrapper {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the total no of floors in the building");
		int floorNos = sc.nextInt();
		int [] floorSize = new int[floorNos];
		int day = 0;

		while (floorNos > 0) {
			System.out.println("Enter the floor size given on day: " + (day + 1));
			floorSize[day] = sc.nextInt();
			day++;
			floorNos--;
		}
		if(floorSize.length > 0) {
			System.out.println("The order of construction is as follows");
			Construction order = new Construction();
			order.constructionOrder(floorSize);
		} else {
			System.out.println("Invalid No of Floors");
		}
		sc.close();
	}
}
