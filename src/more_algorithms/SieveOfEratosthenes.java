package more_algorithms;

public class SieveOfEratosthenes {
	// 에라토스테네스의 체 알고리즘
	// 소수(prime number) 판별 알고리즘
	// 소수를 대량으로 빠르고 정확하게 구하는 방법
	static int number = 100000;
	static int a[] = new int[number+1];
	public static void main(String[] args) {
//		System.out.println(isPrimeNumber(97));
//		System.out.println(isPrimeNumberSqrt(97));
		primeNumberSieve();
		
	}
	// 기본적인 소수판별
	// 시간 복잡도 O(N)
	static boolean isPrimeNumber(int x) {
		for(int i = 2; i < x; i++) {
			if(x%i==0) return false;
		}
		return true;
	}
	// 제곱근을 이용한 소수판별
	// O(N * 1/2)
	static boolean isPrimeNumberSqrt(int x) {
		int end = (int) Math.sqrt(x);
		for(int i = 2; i <= end; i++) {
			if(x%i==0) return false;
		}
		return true;
	}
	// 에라토스테네스의 체
	// 소수를 판별할 범위만큼 배열을 할당, 그 인덱스에 해당하는 값을 넣어줌
	// 2부터 시작해서 특정 숫자의 배수에 해당하는 숫자를 모두 지운다.(자신은 지우지 않는다.)
	// 이미 지워진 수는 건너 뛴다.
	static void primeNumberSieve() {
		for(int i = 2; i <= number; i++) {
			a[i] = i;
		}
		for(int i = 2; i <= number; i++) {
			if(a[i] == 0) continue;
			for(int j = i + i; j <= number; j += i) {
				a[j] = 0;
			}
		}
		for(int i = 2; i <= number; i++) {
			if(a[i]!=0)
				System.out.print(a[i]+" ");
		}
	}
}
