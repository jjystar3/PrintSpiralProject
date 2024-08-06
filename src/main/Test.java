package main;

public class Test {

	public static void main(String[] args) {

		int size = 5;

		printSpiral(size);
	}

	public static void printSpiral(int size) {

		int y = 0, x = 0;

		int boundary = size - 1;
		int sizeLeft = size - 1;
		Boolean flag = false;

		char move = 'r';

		int matrix[][] = new int[size][size];

		for (int i = 1; i < size * size + 1; i++) {

			matrix[y][x] = i;

			switch (move) {

			case 'r':
				x += 1;
				break;

			case 'l':
				x -= 1;
				break;

			case 'u':
				y -= 1;
				break;

			case 'd':
				y += 1;
				break;
			}

			if (i == boundary) {

				boundary += sizeLeft;

				if (!flag) {

					flag = true;
				} else {

					flag = false;
					sizeLeft -= 1;
				}

				switch (move) {

				case 'r':
					move = 'd';
					break;

				case 'd':
					move = 'l';
					break;

				case 'l':
					move = 'u';
					break;

				case 'u':
					move = 'r';
					break;
				}
			}
		}

		for (y = 0; y < size; y++) {
			for (x = 0; x < size; x++) {

				int n = matrix[y][x];
				System.out.print((n < 10) ? (" " + n + " ") : (n + " "));
			}

			System.out.println();
		}
	}

}
