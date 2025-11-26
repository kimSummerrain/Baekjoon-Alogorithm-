package day_01;

import java.util.Scanner;

public class Number_11401 {

    //Mod 만들기
    static final long MOD= 1000000007;

    //소정리 만들기
    //k가 0 or K==N ->1출력
    static long pow(long base,long exp){
        if (exp==0){
            return 1;
        }else if (exp%2==0){
            long temp=pow(base,exp/2);
                    return (temp*temp)%MOD;
        }else{
            return(base*pow(base,exp-1))%MOD;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        int K=sc.nextInt();

        //팩토리얼 미리 정의 해서 모듈러함
        long[] fact=new long[N+1];
        fact[0]=1;

        for(int i=1;i<=N;i++){
            fact[i]=(fact[i-1]*i)%MOD;
        }

        long denom = (fact[K]*fact[N-K])%MOD;
        long inv=pow(denom,MOD-2);
        long result = (fact[N] * inv) % MOD;

        System.out.println(result);

    }
}
