package pkg2;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		// HelloWorldの表示
		String greeting = "Hello World";
		System.out.println(greeting);


		System.out.println();


		// 1～10まで足し算
		int sum = 0;
		for(int i = 1; i <= 10; i++) {
			sum += i;
		}
		System.out.println("合計値：" + sum);


		System.out.println();


		// 3年後の今日の曜日取得
		LocalDateTime now = LocalDateTime.now();
		// 曜日取得
		System.out.println(now.getDayOfWeek());
		// nowに3年足して曜日取得
		System.out.println(now.plusYears(3).getDayOfWeek());




		System.out.println();


		// if文
		int num = 0;
		judgeNum(num);


		System.out.println();

		// List, Map
		List<String> season = new ArrayList<String>();
		season.add("春");
		season.add("夏");
		season.add("秋");
		season.add("冬");

		for(int i = 0; i < season.size(); i++) {
			System.out.println(season.get(i));
		}

		System.out.println();

		Map<String, String> nation = new HashMap<String, String>();
		nation.put("千葉県", "千葉市");
		nation.put("北海道", "札幌市");
		nation.put("東京都", "新宿区");
		nation.put("大阪府", "大阪市");
		nation.put("愛知県", "名古屋市");
		nation.put("福岡県", "福岡市");
		for(String key : nation.keySet()) {
			String city = nation.get(key);
			System.out.println(key + "の県庁所在地は" + city);
		}

	}

	// if文
	public static  void judgeNum(int num) {
		if(num == 0) {
			System.out.println("偽");
		} else {
			System.out.println("真");
		}
	}

}
