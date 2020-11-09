package com.web.theaddemo;

public class TicketTask001 implements Runnable {
    private int ticket=10;
    public static void main(String[] args) {


        TicketTask001 task1=new TicketTask001();
        Thread t1=new Thread(task1);
        Thread t2=new Thread(task1);
        Thread t3=new Thread(task1);
        t3.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        t3.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("票卖完了");

    }

    @Override
    public void run() {
        for (int i=1;i<=15;i++){
            if(ticket>0){
                System.out.println(Thread.currentThread().getName()+"买票，还剩余"+ticket--);
            }else
            {
                System.out.println(Thread.currentThread().getName()+"票卖完了");
                break;
            }
        }
    }
}
