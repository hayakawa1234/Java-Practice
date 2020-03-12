/**
 * 練習問題 7 - 1
以下の Dog クラスを使用して、次のプログラムを作成しなさい。

Dog クラスのインスタンスを作成する。
SetName メソッドで名前を設定する。
ShowProfile メソッドで名前を表示する
class Dog
{
    private String Name;

    public void SetName( String nm )
    {
        Name = nm;
    }

    public void ShowProfile()
    {
        System.out.println( "名前は、" + Name + "です。" );
    }
}
 */

/**
 * @author hayak
 *
 */


public class sample14 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("こんにちは");
		Dog dog1 = new Dog();
		dog1.SetName("mike");
		dog1.ShowProfile();
	}

}
