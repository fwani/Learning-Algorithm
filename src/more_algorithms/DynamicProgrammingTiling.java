package more_algorithms;

import java.util.Scanner;

public class DynamicProgrammingTiling {
	// 문제 1
	// 2xn 크기의 직사각형을 1x2, 2x1 타일로 채우는 방법의 수를 구하는 프로그램을 작성하시오.
	// 입력: 첫째 줄에 n이 주어진다. (1 <= n <= 1000)
	// 출력: 첫째 줄에 2xn 크기의 직사각형을 채우는 방법의 수를 10,007로 나눈 나머지를 출력한다.
	
	// 문제 2
	// 2xn 크기의 직사각형을 1x2, 2x2 타일로 채우는 방법의 수를 구하는 프로그램을 작성하시오.
	// 입력: 첫째 줄에 n이 주어진다. (1 <= n <= 1000)
	// 출력: 첫째 줄에 2xn 크기의 직사각형을 채우는 방법의 수를 10,007로 나눈 나머지를 출력한다.

	// 문제 3
	// 3xn 크기의 직사각형을 1x2, 2x1 타일로 채우는 방법의 수를 구하는 프로그램을 작성하시오.
	// 입력: 첫째 줄에 n이 주어진다. (1 <= n <= 30)
	// 출력: 첫째 줄에 경우의 수를 출력한다.

	// 문제 4
	// 2xn 크기의 직사각형을 1x2, 2x1, 1x1 타일로 채우는 방법의 수를 구하는 프로그램을 작성하시오.
	// 입력: 첫째 줄에 n이 주어진다. (1 <= n <= 1,000,000)
	// 출력: 첫째 줄에 경우의 수를 1,000,000,007로 나눈 나머지를 출력한다.
	
	static int d[] = new int[1001];
	static int d4[][] = new int[1000001][2];
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		
		// 문제 1
//		System.out.println(dp(x));
		// 문제 2
//		System.out.println(dp2(x));
		// 문제 3
//		System.out.println(dp3(x));
		// 문제 4
//		System.out.println(dp4_fault(x));
		System.out.println(dp4(x));
				
	}

	static int dp(int x) {
		if(x==1) return 1;
		if(x==2) return 2;
		if(d[x] != 0) return d[x];
		return d[x] = (dp(x-1)+dp(x-2))%10007;
	}
	static int dp2(int x) {
		if(x==1) return 1;
		if(x==2) return 3;
		if(d[x] != 0) return d[x];
		return d[x] = (dp2(x-1)+dp2(x-2)*2)%10007;
	}
	static int dp3(int x) {
		if(x==0) return 1;
		if(x==1) return 0;
		if(x==2) return 3;
		if(d[x] != 0) return d[x];
		int result = 3 * dp3(x-2);
		for(int i=3; i<=x; i++) {
			if(i%2 == 0) {
				result += 2 * dp3(x-i);
			}
		}
		return d[x]=result;
	}
	static int dp4_fault(int x) {
		if(x==0) return 1;
		if(x==1) return 2;
		if(x==2) return 7;
		if(d[x] != 0) return d[x];
		int result = 3 * dp4_fault(x-2) + 2 * dp4_fault(x-1);
		for(int i=3; i<=x; i++) {
			result += (2 * dp4_fault(x-i)) % 1000000007;
		}
		return d[x]=result%1000000007;
	}
	static long dp4(int x) {
		d4[0][0] = 0;
		d4[1][0] = 2;
		d4[2][0] = 7;
		d4[2][1] = 1;
		for(int i=3; i<=x; i++) {
			d4[i][1] = (d4[i-1][1]+d4[i-3][0]) % 1000000007;
			d4[i][0] = (3*d4[i-2][0] + 2*d4[i-1][0] + 2*d4[i][1]) % 1000000007;
		}
		return d4[x][0];
	}

}
