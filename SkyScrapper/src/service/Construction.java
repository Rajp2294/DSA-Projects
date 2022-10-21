package service;

import java.util.LinkedList;
import java.util.Queue;

public class Construction {
	private Queue<Integer> queue = new LinkedList<>();

	public void constructionOrder(int []floorNos) {

		int size = floorNos.length;
		for (int i = 0; i < floorNos.length; i++) {
			System.out.println("Day: " + (i+1));
			if(floorNos[i] == size) {
				System.out.print(size + " ");
				size--;
				while (queue.contains(size)) {
					System.out.print(size + " ");
					size--;
				}
			} else {
				queue.add(floorNos[i]);
			}
			System.out.println();
		}
	}
}
