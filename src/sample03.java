import java.util.Scanner;

/**
 * ����\�����l����͂��A���̌��̓�����\������v���O�������쐬���Ȃ����B2 ���� 28 ���Ƃ��܂��B
 * �܂��A1 �` 12 �ȊO�̐��l�����͂��ꂽ�ꍇ�ɁA�g���͂��Ԉ���Ă��܂��h�ƕ\�����Ȃ����B
 * �� 	switch �����g�p���邱�ƁB

 */

/**
 * @author hayak
 *
 */
public class sample03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("�D���Ȍ�����͂��Ă�������");
		
		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();
		
		switch(num) {
		case 1:
			System.out.println("31��");
			break;
		case 2:
			System.out.println("28��");
			break;
		case 3:
			System.out.println("31��");
			break;
		case 4:
			System.out.println("30��");
			break;
		case 5:
			System.out.println("31��");
			break;
		case 6:
			System.out.println("30��");
			break;
		case 7:
			System.out.println("31��");
			break;
		case 8:
			System.out.println("31��");
			break;
		case 9:
			System.out.println("30��");
			break;
		case 10:
			System.out.println("31��");
			break;
		case 11:
			System.out.println("30��");
			break;
		case 12:
			System.out.println("31��");
			break;
			
		default:
			System.out.println("���͂��Ԉ���Ă��܂�");
			
		}
		

	}

}
