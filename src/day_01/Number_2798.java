package day_01;


/*
<방법>
조합을 만들어볼까
조합을 가장 빠르게 구현하는 방법은?
만약 정렬을 시도한다면?
->
우선 M을 넘을 일이 없음
3장의 숫자의 합이 M에 가장 가까워야함
무조건 3장은 나온다는건디
-그냥 3개의 조합을 구하는 조합 구해야할 듯


1. 2 숫자 받기
2. 리스티에 담기
 */


import java.util.ArrayList;
import java.util.Scanner;

public class Number_2798 {
    public static  void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m=sc.nextInt();
        ArrayList<Integer> list = new ArrayList();
        for(int i=0; i<n;i++){
            list.add(sc.nextInt());
        }
        int result=findBestSum(list,n,m);
        System.out.println(result);

    }

    static int findBestSum(ArrayList<Integer> list,int n,int m){
        int maxsum=0;

        for(int i=0;i<n-2;i++){
            for(int j=i+1;j<n-1;j++){
                for(int k=j+1;k<n;k++){
                    int sum=list.get(i)+list.get(j)+list.get(k);

                    if(sum<=m && sum>maxsum){
                        maxsum=sum;
                    }
                }
            }
        }
        return maxsum;
    }


}
