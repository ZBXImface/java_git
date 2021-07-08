package com.gree.thread.base;

class NewThreadExtendThreadEntity extends Thread{
    private String threadName;
    //构造函数
    public NewThreadExtendThreadEntity(String threadName) {
        super();
        this.threadName=threadName;
    }

    @Override
    public void run() {
        super.run();
        for (int num=0;num<10;num++){
            try{
                //this.sleep(1000);
            }catch (Exception e){
                e.printStackTrace();
            }
            System.out.println(threadName+"运行 num=" + num);
        }
    }
};
class NewThreadImplementRunnableEntity implements Runnable{
    private String threadRunnableName;
    //定义构造函数

    public NewThreadImplementRunnableEntity(String threadRunnableName) {
        this.threadRunnableName = threadRunnableName;
    }

    @Override
    public void run() {
        for (int num=0;num<10;num++){
            System.out.println(threadRunnableName+"运行 num=" + num);
        }
        while (true);
    }
}
public class ThreadTestMain{
    public static void main(String[] args) {
        //实例化线程对象1
        NewThreadExtendThreadEntity thread1=new NewThreadExtendThreadEntity("线程1");
        NewThreadExtendThreadEntity thread2=new NewThreadExtendThreadEntity("线程2");
        NewThreadExtendThreadEntity thread3=new NewThreadExtendThreadEntity("线程3");
        NewThreadExtendThreadEntity thread4=new NewThreadExtendThreadEntity("线程4");
        NewThreadExtendThreadEntity thread5=new NewThreadExtendThreadEntity("线程5");
        NewThreadExtendThreadEntity thread6=new NewThreadExtendThreadEntity("线程6");
        //调用线程主体
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
        thread6.start();
        //测试实现Runnable接口的Java线程
        NewThreadImplementRunnableEntity thread11=new NewThreadImplementRunnableEntity("实现Runnable接口的线程1");
        NewThreadImplementRunnableEntity thread22=new NewThreadImplementRunnableEntity("实现Runnable接口的线程2");
        NewThreadImplementRunnableEntity thread33=new NewThreadImplementRunnableEntity("实现Runnable接口的线程3");
        NewThreadImplementRunnableEntity thread44=new NewThreadImplementRunnableEntity("实现Runnable接口的线程4");
        NewThreadImplementRunnableEntity thread55=new NewThreadImplementRunnableEntity("实现Runnable接口的线程5");
        NewThreadImplementRunnableEntity thread66=new NewThreadImplementRunnableEntity("实现Runnable接口的线程6");
        Thread thread111=new Thread(thread11);
        Thread thread222=new Thread(thread22);
        Thread thread333=new Thread(thread33);
        Thread thread444=new Thread(thread44);
        Thread thread555=new Thread(thread55);
        Thread thread666=new Thread(thread66);
        thread111.start();
        thread222.start();
        thread333.start();
        thread444.start();
        thread555.start();
        thread666.start();
        while (true){
            //创建新的线程
            NewThreadImplementRunnableEntity newThreadImplementRunnableEntity=new NewThreadImplementRunnableEntity("新的线程");
            Thread newThreadImplementRunnableEntityThread=new Thread(newThreadImplementRunnableEntity);
            newThreadImplementRunnableEntityThread.start();
        }
    };
}

