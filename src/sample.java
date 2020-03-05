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
			System.out.println("xはyより小さく、かつ、xとyは共に偶数である。");
		} else if ((x == y) && (x < 0)){
			System.out.println("xとyは等しく、かつ、負の数である。");
		} else if ((x < y) || (x / 2 == 0) && (y / 2 == 0)) {
			System.out.println("xはyより小さい、または、xは偶数である。");
		} else if ((x <= 10) || (x >= 100) && (y >= 10) && (y <= 100)) {
			System.out.println("xは10以下、または、100以上で、かつ、yは10以上、かつ、100以下である。");
		} else if (x < 0) {
			System.out.println("xもyも負の数である、ではない");
		}
			
	}
}