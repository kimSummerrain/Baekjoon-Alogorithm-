package project_1;

public class Customer extends User {
   public Customer(){
       super();
       //고객 관리 기능의 확장 가능성
       //super(account,password);
   }
   @Override
    public void showInfo(){
       System.out.println("고객님 어서오고!");
   }
}
