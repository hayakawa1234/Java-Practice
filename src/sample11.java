/**
 *���K��� 6 - 2
 *�Q�̐����̕��ς��v�Z���郁�\�b�h���쐬���Ȃ����B�Q�� int �^���������A���ʂ� int �^�̖߂�l�Ƃ��ĕԂ����ƁB
 *
 *�܂��A���\�b�h�̓�������؂ł���悤�Ƀv���O�������쐬���Ȃ����B
 *
 *�� 	���ς̌v�Z�͐����ōs���A�����_�ȉ��͐؂�̂ĂĂ悢�B
 
 */

/**
 * @author hayak
 *
 */
public class sample11 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int value, value2;
		double av;

		value = 40;
		value2 = 50;
		
		
		av = avarage(value, value2);

		System.out.println(av);
		
		int value3, value4;
		double av1;
		value3 = 10;
		value4 = 100;
		
		av1 = avarage1(value3, value4);
		System.out.println(av1);
		
	}

	public static double avarage(int a, int b) {
		return ((a + b) / 2.0);
	}
	public static double avarage1(int c, int d) {
		return ((c + d) / 2.0);
	}
}
