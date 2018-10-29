package UBS;
class ubs_int_dimond__stars
{
	public static void main(String[] args)
	{
		final int n = 5;

		// Print upper half
		for (int i = 1; i <= n; i++)
		{
			// Print space
			for (int j = i; j < n; j++) {
				System.out.print(' ');
			}

			// Print '*'
			for (int k = 1; k < 2*i; k++) {
				System.out.print('*');
			}

			// Move to the next line
			System.out.print(System.lineSeparator());
		}

		// Print lower half
		for (int i = n - 1; i >= 1; i--)
		{
			// Print space
			for (int j = n; j > i; j--) {
				System.out.print(' ');
			}

			// Print '*'
			for (int k = 1; k < (i * 2); k++) {
				System.out.print('*');
			}

			// Move to the next line
			System.out.print(System.lineSeparator());
		}
	}
}