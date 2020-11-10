package pkg2;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		// インスタンス化
		WorkPlaceCommunication wpc = new WorkPlaceCommunication();

		// 挨拶メソッド呼び出し
		String response = wpc.greet("Hello");
		System.out.println(response);

		// 職場判定メソッド呼び出し
		String response2 = wpc.checkWorkPlace();
		System.out.println(response2);

		// 例外練習メソッド呼び出し
		String response3 = wpc.checkGreetPerson("苦手な人");
	}

}
