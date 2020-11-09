package com.web.theaddemo;

public class TicketThead001  extends  Thread{
    private int ticket=10;

    @Override
    public void run() {
         for (int i=1;i<=15;i++){
             if(ticket>0){
             System.out.println(this.getName()+"买票，还剩余"+ticket--);
             }else
             {
                 System.out.println(this.getName()+"票卖完了");
                 break;
             }
         }
    }

    public static void main(String[] args) {

        TicketThead001 t1=new TicketThead001();
        t1.start();
        TicketThead001 t2=new TicketThead001();
        t2.start();
        TicketThead001 t3=new TicketThead001();
        t3.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("票卖完了");

    }
}
