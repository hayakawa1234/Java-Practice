import java.util.Scanner;

/**
 * /**
 * ���K��� 4 - 21
 * �T�C�Y���������l����͂��A���̃T�C�Y�́~����������̕����ŕ\������v���O�������쐬���Ȃ����B
 * �T�C�Y 3 �̗�
 * X X
 *  X
 * X X

 */

/**
 * @author hayak
 *
 */
public class sample05 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("�T�C�Y����͂��Ă�������");
		Scanner scanner = new Scanner(System.in);

		int num = scanner.nextInt();

		int i;
		int j;

		for (i = 0; i < num; i++) {
			System.out.print("");
			for (j = 0; j < num; j++) {
				if ((i + j) % 2 == 0) {
					System.out.print("x");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
	}
}
