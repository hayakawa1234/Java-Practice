/**
 * 月を表す数値を入力し、その月の初めから年末までにある祝日を表示するプログラムを作成しなさい。
 * 表示する祝日は以下の日とします。
 * 
 * １月：元日、成人の日
 * ２月：建国記念の日
 * ３月：春分の日
 * ４月：昭和の日
 * ５月：憲法記念日、みどりの日、こどもの日
 * ７月：海の日
 * ９月：敬老の日、秋分の日
 * １０月：体育の日
 * １１月：文化の日、勤労感謝の日
 * １２月：天皇誕生日
※ 	switch 文を使用すること。
 */

/**
 * @author hayak
 *
 */

//北ソフト　練習問題3-11
public class sample01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int publicHoliday = 5;
		
		switch (publicHoliday) {
			case 1:
				System.out.println("1月: 元日、成人の日");
				break;
			case 2:
				System.out.println("2月: 建国記念日");
				break;
			case 3:
				System.out.println("3月: 春分の日");
				break;
			case 4:
				System.out.println("4月: 昭和の日");
			    break;
			case 5:
				System.out.println("5月: 憲法記念日、みどりの日、子どもの日");
				break;
			case 7:
				System.out.println("7月: 海の日");
				break;
			case 9:
				System.out.println("9月: 敬老の日、秋分の日");
				break;
			case 10:
				System.out.println("10月: 体育の日");
				break;
			case 11:
				System.out.println("11月: 文化の日、勤労感謝の日");
				break;
			case 12:
				System.out.println("12月: 天皇誕生日");
				break;
			default:
				System.out.println("その月に休日はありません!!!");
					
		}

	}

}
