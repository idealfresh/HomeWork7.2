
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// �������� ��������, ����� ��������� �� ����������� �� ������� ����� �
		// ������� 3�4. �������� ������ �� ������.

		Scanner scan = new Scanner(System.in);
		int[][] massive = new int[3][4];

		for (int i = 0; i < massive.length; i++) {
			for (int j = 0; j < massive[i].length; j++) {
				System.out.println("Input number: ");
				massive[i][j] = scan.nextInt();

			}
		}
		for (int i = 0; i < massive.length; i++) {
			for (int j = 0; j < massive[i].length; j++) {
				System.out.print(massive[i][j]+"\t");
			}
	System.out.println();
		}	

}
}