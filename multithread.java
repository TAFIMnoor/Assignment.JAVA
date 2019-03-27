package Multithreading;


public class Multithread {

    public static void main(String[] args) {
        int[] ar1 = {4, 12, 90, 15, 62};
        int[] ar2 = {3, 14, 29, 31, 57};
        int[] sum1=new int[5];
        int[] summ=new int[5];
        Sum obj = new Sum();
        Thread a=new Thread(obj);
        a.start();
        for (int i = 0; i < 5; i++) {
            sum1[i]=ar1[i]+ar2[i];
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {

            }
        }
        try {
            a.join();
        } catch (InterruptedException e) {
           
        }
        System.out.println("Summation of four arrays:");
        for(int i=0;i<5;i++)
        {
            summ[i]=sum1[i]+obj.sum2[i];
            System.out.print(summ[i]+" ");
        }
        System.out.println("");
       
    }
}

class Sum extends MoreArrays implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            sum2[i]=ar3[i]+ar4[i];
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {

            }
        }
    }
}
class MoreArrays{
    int[] ar3 = {100, 33, 78, 90, 7};
    int[] ar4 = {24, 51, 10, 25, 23};
    int[] sum2=new int[5];
}