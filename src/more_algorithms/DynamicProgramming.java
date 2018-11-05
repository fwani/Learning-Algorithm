package more_algorithms;

public class DynamicProgramming {
	// 하나의 문제를 단 한 번만 풀도록 하는 알고리즘 
	// 피보나치 수열을 보면 여러번 같은 계산을 하게 된다.
	// 이것을 memorize해서 한 번만 계산 하는 것
	static int d[] = new int[100];
	public static void main(String[] args) {
//		System.out.println(dp2(10));  // 간단하게 55가 나온다.
//		System.out.println(dp2(30));  // 30번째 피보나치수를 계산하는데 엄청 오래걸린다.
		
		System.out.println(dp(10));
		System.out.println(dp(30));
		
	}
//	static int dp2(int x) {
//		if(x==1) return 1;
//		if(x==2) return 1;
//		return dp(x-1) + dp(x-2);
//	}
	static int dp(int x) {
		if(x==1) return 1;
		if(x==2) return 1;
		if(d[x] != 0) return d[x];
		return d[x] = dp(x-1) + dp(x-2);
	}
}
