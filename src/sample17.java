/*
 * ���K��� 5 - 4
 * ���l���J��Ԃ��ē��͂��A���v�� 100 �𒴂����ꍇ�A�܂��͓��͂� 10 ��s��ꂽ�ꍇ�A
 * ���͂��~�ߓ��͂��ꂽ���l�����ׂĕ\������v���O�������쐬���Ȃ����B
 */
public class sample17 {

	public static void main(String[] args) {

		int[] values = new int[13];
		values[0] = 2;
		values[1] = 4;
		values[2] = 4;
		values[3] = 5;
		values[4] = 7;
		values[5] = 12;
		values[6] = 16;
		values[7] = 11;
		values[8] = 8;
		values[9] = 3;
		values[10] = 22;
		values[11] = 3;
		values[12] = 5;
		

		int sum = 0;
		for (int i = 0; i < values.length; i++) {
			sum += values[i];
			System.out.println(values[i]);
			if (sum >= 100) {
				System.exit(values[i]);
			} else if (i >= 10) {
				System.exit(values[i]);

			}
		}
	}

}
