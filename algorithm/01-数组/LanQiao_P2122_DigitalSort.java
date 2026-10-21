
import java.util.Scanner;
import java.util.Arrays;

public class LanQiao_P2122_DigitalSort {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //在此输入您的代码...
        int n = scan.nextInt();
        int m = scan.nextInt();

        // 定义一个数组存整数
        Integer[] nums = new Integer[n];
        // 先存再排序
        for (int i = 0; i < n; i++) {
            nums[i] = i + 1;
        }
        // //  冒泡排序  （超时了）
        //  for(int i = 0;i < n - 1;i++){
        //    for(int j = 0;j < n - 1 -i;j++){
        //      int sum1 = DigitalSum(nums[j]);
        //      int sum2 = DigitalSum(nums[j + 1]);
        //      if(sum1 > sum2 || (sum1 == sum2 && nums[j] > nums[j + 1])){
        //        int temp = nums[j];
        //        nums[j] = nums[j + 1];
        //        nums[j + 1] = temp;
        //      }
        //    }
        //  }
// 自动排序+lambda比较器
        Arrays.sort(nums, (a, b) -> {
            int sum1 = DigitalSum(a);
            int sum2 = DigitalSum(b);
            if (sum1 != sum2) return sum1 - sum2;//负数：a排在b前面；正数：反之；相等：不变
            return a - b;
        });
        System.out.println(nums[m - 1]);
        scan.close();
    }

    // 定义一个方法求数位和
    public static int DigitalSum(int i) {
        int x = i;
        int sum = 0;
        while (x > 0) {
            sum += x % 10;
            x /= 10;
        }
        return sum;
    }
}

