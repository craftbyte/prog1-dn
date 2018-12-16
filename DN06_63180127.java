import java.util.*;

public class DN06_63180127 {

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int height = in.nextInt();
		int width = in.nextInt();
		int[][] map = new int[height][width];
		int nrOfCountries = 0;
		int seaArea = 0;
		HashMap<Integer, Integer> coasts = new HashMap<Integer, Integer>();
		HashMap<Integer, ArrayList<Integer>> bordering = new HashMap<Integer, ArrayList<Integer>>();
		for (int m = 0; m < height; m++) {
			for (int n = 0; n < width; n++) {
				int cell = in.nextInt();
				if (cell == 0) {
					seaArea++;
					map[m][n] = 0;
					// if (n > 0 && map[m][n-1] > 0) {
					// 	coasts.put(map[m][n-1], coasts.get(map[m][n-1])+1);
					// }
					// if (m > 0 && map[m-1][n] > 0) {
					// 	coasts.put(map[m-1][n], coasts.get(map[m-1][n])+1);
					// }
				} else {
					map[m][n] = cell;
					if (cell > nrOfCountries) nrOfCountries = cell;
					if (!coasts.containsKey(cell)) {
						coasts.put(cell, 0);
						bordering.put(cell, new ArrayList<Integer>());
					}
					// if (m == 0 || m == height-1  || map[m-1][n] == 0 || n == 0 || n == width-1 || map[m][n-1] == 0) {
					// 	coasts.put(cell, coasts.get(cell)+1);
					// }
					if (n > 0 && map[m][n-1] > 0 && map[m][n-1] != cell) {
						ArrayList<Integer> borders = bordering.get(cell);
						ArrayList<Integer> neighbour = bordering.get(map[m][n-1]);
						if(!borders.contains(map[m][n-1])) borders.add(map[m][n-1]);
						if(!neighbour.contains(cell)) neighbour.add(cell);
					}
					if (m > 0 && map[m-1][n] > 0 && map[m-1][n] != cell) {
						ArrayList<Integer> borders = bordering.get(cell);
						ArrayList<Integer> neighbour = bordering.get(map[m-1][n]);
						if(!borders.contains(map[m-1][n])) borders.add(map[m-1][n]);
						if(!neighbour.contains(cell)) neighbour.add(cell);
					}
				}
				//System.out.printf("[%d, %d] = %d, C: %s, CC: %s%n", m, n, cell, coasts, countedCoasts);
			}
		}
		switch (in.nextInt()) {
			case 1:
				System.out.println(nrOfCountries);
				break;
			case 2:
				System.out.println(seaArea);
				break;
			case 3:
				for (int m = 0; m < height; m++) {
					for (int n = 0; n < width; n++) {
						if (map[m][n] != 0) {
							if (m == 0 || n == 0 || n == width-1 || m == height-1 || map[m-1][n] == 0 || map[m][n-1] == 0 || map[m+1][n] == 0 || map[m][n+1] == 0) coasts.put(map[m][n], coasts.get(map[m][n])+1);
						}
					}
				}
				for (int i = 1; i <= nrOfCountries; i++) {
					System.out.println(coasts.get(i));
				}
				break;
			case 4:
				int largest = 0;
				int largestC = 0;
				for (int i = 1; i <= nrOfCountries; i++) {
					int neighbours = bordering.get(i).size();
					if (neighbours > largest) {
						largest = neighbours;
						largestC = i;
					}
				}
				System.out.printf("%d%n%d%n", largestC, largest);
				break;
		}
	}	

}