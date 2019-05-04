public class JumpIt {
	public static void main(String[] args) {
		int initial_cost;
		int nextCost;
		int[] initial_board = { 0, 3, 80, 6, 57, 10 };

		initial_cost = 0;
		initial_cost = lowestCost(initial_board, 0, initial_cost);
		
		for (int i=0; i<initial_board.length; i++) 
		{
			System.out.print(initial_board[i] + " ");
		}
		
		System.out.println();
		System.out.println("The least amount of steps: " + initial_cost);
		System.out.println();

		int board2[] = { 0, 3, 8, 21, 90, 34, 52, 101, 7, 99, 23 };
		nextCost = 0;
		nextCost = lowestCost(board2, 0, nextCost);
		
		for (int i=0; i<board2.length; i++) 
		{
			System.out.print(board2[i] + " ");
		}
		
		System.out.println();
		System.out.println("The least amount of steps: " + nextCost);

	}

	public static int lowestCost(int[] board, int current, int total_cost) {
		int first_path;
		int second_path;
		
		total_cost += board[current];

		if (current == board.length-1) {
			return total_cost;
		} else if (current == board.length-2) {
			return lowestCost(board, current + 1, total_cost);
		} else {
			first_path = lowestCost(board, current + 1, total_cost);
			second_path = lowestCost(board, current + 2, total_cost);
			return Math.min(first_path, second_path);
		}
	}
}