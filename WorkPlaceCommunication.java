package pkg2;

public class WorkPlaceCommunication implements Communication {

	// フィールド
	private boolean isWorkPlace = true;


	// 挨拶メソッド
	public String greet(String s) {

		String wk = null;
		if(s.equals("Hello")) {
			wk = "Hello";
		} else {
			wk = "";
		}

		return wk;

	}

	// 職場判定メソッド
	public String checkWorkPlace() {
		if(isWorkPlace == true) {
			String wk = this.greet("Hello");
			return wk;
		}

		return null;
	}


	// 例外練習メソッド
	public String checkGreetPerson(String s) {

		if(s.equals("苦手な人") || s.equals("嫌いな人")) {
			throw new IllegalArgumentException("適当に返答");
		}

		String greet = "お疲れ様です";

		return greet;
	}

	// setter
	public void setIsWorkPlace(boolean isWorkPlace) {
		this.isWorkPlace = isWorkPlace;
	}

	// getter
	public boolean getIsWorkPlace() {
		return isWorkPlace;
	}



}
