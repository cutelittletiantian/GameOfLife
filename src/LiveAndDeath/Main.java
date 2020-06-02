package LiveAndDeath;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // 输入概率
        System.out.println("请输入每个细胞死亡的概率");
        java.util.Scanner scan  =new Scanner(System.in);
        double i;
        i = scan.nextDouble();
        scan.close();

        // 生成对象
        TimeCtrl timeCtrl = new TimeCtrl(i);

        // 开始运行
        timeCtrl.run();
    }
}