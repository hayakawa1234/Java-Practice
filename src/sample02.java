/**
 *�D����齁i�����j��I�������A����ɑΉ��������b�Z�[�W��\������A齐肢�v���O�������쐬���Ȃ����B
 * �� 	switch �����g�p����B
 * �� 	�I���́A�g1�F�܂���@2�F���с@3�F���͂��D�D�D�h�̂悤�ȃK�C�h��\���������œ��͂�����B
 * �� 	��ނ�齂łȂ��Ă��ǂ��B

 */

/**
 * @author hayak
 *
 */

import java.util.Scanner;

public class sample02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("齐肢 �D���ȃl�^��I��łˁH");
		System.out.println("1: �܂��� 2:�@���͂� 3: �T�[���� 4: ");
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("���͂��Ă�������");
		int num = scanner.nextInt();
		
		switch(num) {
			case 1:
				System.out.println("��g");
				break;
			case 2:
				System.out.println("���g");
				break;
			case 3:
				System.out.println("���g");
				break;
			case 4:
				System.out.println("��");
				break;
				
		}
		
		
		

	}

}
