import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int []arr=new int [10000];
        Random random=new Random();
        for (int i=0;i<10000;i++){
            arr[i]=random.nextInt(1000);
        }
        StopWatch stopWatch=new StopWatch();

        for (int i=0;i<9999;i++){
            for (int j=0;j<10000;j++){
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i=0;i<10000;i++){
            System.out.print(arr[i]+" ");
        }

        stopWatch.stop();
        long  time=stopWatch.getElapsedTime();
        System.out.println();
        System.out.println("Thời gian thực hiện là : "+time);

    }
}
