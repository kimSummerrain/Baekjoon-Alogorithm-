
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.Stack;

public class Main{
    public static void main(String[] args) throws IOException {
        //몇번할겨?
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();

        int n=Integer.parseInt(br.readLine());
        Stack<Integer> stack=new Stack<>();

        for(int i=0; i<n;i++){
            String line=br.readLine();
            String[] cmd=line.split(" ");

            switch(cmd[0]){
                case "push":
                    stack.push(Integer.parseInt(cmd[1]));
                    break;
                    case "pop":
                        if(!stack.isEmpty()){
                            System.out.println(stack.pop());
                        }else{
                            System.out.println(-1);
                        }
                        break;
                case "size":
                    System.out.println(stack.size());
                    break;
                case "empty":
                    System.out.println(stack.isEmpty()? 1:0);
                    break;
                case "top":
                    System.out.println(stack.isEmpty()? -1:stack.peek());
                    break;

            }
        }

    }
}
