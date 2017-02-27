package base;

public class MyInteger {
	private int iValue;

	public MyInteger(int iValue) {
		this.iValue = iValue;
	}

	public int getiValue() {
		return iValue;
	}
	
	public boolean isEven() {
		if(iValue % 2 == 0) {
			return true;
		}
		return false;
	}
	
	public boolean isOdd() {
		if(iValue % 2 != 0) {
			return true;
		}
		return false;
	}
	
	public boolean isPrime() {
		if(iValue == 2 || iValue == 3) {
			return true;
		}
		int k = (int) Math.sqrt(iValue);
		for(int i = 2; i <= k; i ++) {
			if(iValue % i == 0) {
				return false;
			}
			if(i == k) {
				return true;
			}
		}
		return false;
	}
	
	public static boolean isEven(int value) {
		if(value % 2 == 0) {
			return true;
		}
		return false;
	}
	
	public static boolean isOdd(int value) {
		if(value % 2 != 0) {
			return true;
		}
		return false;
	}
	
	public static boolean isPrime(int value) {
		if(value == 2 || value == 3) {
			return true;
		}
		int k = (int) Math.sqrt(value);
		for(int i = 2; i <= k; i ++) {
			if(value % i == 0) {
				return false;
			}
			if(i == k) {
				return true;
			}
		}
		return false;
	}
	
	public static boolean isEven(MyInteger myInteger) {
		if(myInteger.getiValue() % 2 == 0) {
			return true;
		}
		return false;
	}
	
	public static boolean isOdd(MyInteger myInteger) {
		if(myInteger.getiValue() % 2 != 0) {
			return true;
		}
		return false;
	}
	
	public static boolean isPrime(MyInteger myInteger) {
		if(myInteger.getiValue() == 2 || myInteger.getiValue() == 3) {
			return true;
		}
		int k = (int) Math.sqrt(myInteger.getiValue());
		for(int i = 2; i <= k; i ++) {
			if(myInteger.getiValue() % i == 0) {
				return false;
			}
			if(i == k) {
				return true;
			}
		}
		return false;
	}
	
	public boolean equals(int value) {
		if(value == iValue) {
			return true;
		}
		return false;
	}
	
	public boolean equals(MyInteger myInteger) {
		if(this.getiValue() == myInteger.getiValue()){
			return true;
		}
		return false;
	}
}


