package day_01;

import java.util.Scanner;

public class Number_10250 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T=sc.nextInt();
        //횟수
        for(int i = 0; i <T; i++){
            //Y축
            int H=sc.nextInt();
            //X축
            int W=sc.nextInt();
            //그래서 어디?
            int N=sc.nextInt();
            //일단 x축이 호수 층-y가 층수

            int floor;//층
            int room;//호수

            //층수 구하기
            //층 수랑 뭔하는 방 위치가 같으면 층 레벨이 바닥 아님?
            //방이 손님/층 수하면 위치 나옴
            if (N%H==0) {
                floor=H;
                room=N/H;
            } else {
                // 둘이 다르다??
                // 일단 개수%층하고 나머지
                // 룸 1번째부터니까 +1해주는겨
                floor=N%H;
                room=N/H+1;
            }

            System.out.println(floor*100+room);

        }
    }
}
