/**
 * 
 */

/**
 * @author hayak
 *
 */
public class sample {
	public static void main(String[] args) {
		
		int x = 2;
		int y = 3;
	
		if ((x < y) && ((x / 2 == 0) && (y /2 ==0))) {
			System.out.println("x��y��菬�����A���Ax��y�͋��ɋ����ł���B");
		} else if ((x == y) && (x < 0)){
			System.out.println("x��y�͓������A���A���̐��ł���B");
		} else if ((x < y) || (x / 2 == 0) && (y / 2 == 0)) {
			System.out.println("x��y��菬�����A�܂��́Ax�͋����ł���B");
		} else if ((x <= 10) || (x >= 100) && (y >= 10) && (y <= 100)) {
			System.out.println("x��10�ȉ��A�܂��́A100�ȏ�ŁA���Ay��10�ȏ�A���A100�ȉ��ł���B");
		} else if (x < 0) {
			System.out.println("x��y�����̐��ł���A�ł͂Ȃ�");
		}
			
	}
}