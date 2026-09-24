public class FishCute {
    public static void main(String[] args) {
/*由于所有的鱼头都朝向左边，
所以每只鱼只能看见在它左边的鱼的可爱程度，它们心里都在计算，在自己的眼力范围内有多少只鱼不如自己可爱呢。
请你帮这些可爱但是鱼脑不够用的小鱼们计算一下。*/
        /*输入格式
第一行输入一个正整数 n，表示鱼的数目。

第二行内输入 n 个非负整数，用空格间隔，
依次表示从左到右每只小鱼的可爱程度 a i
 。

输出格式
一行，输出 n 个整数，用空格间隔，依次表示每只小鱼眼中有多少只鱼不如自己可爱。*/

//        题意：有一个数组，记录每一个数左边大于它的数的个数
//        思路：两层循环，外循环遍历数组，内循环遍历数组至所在值，遇到比自己小的count+,最后输出count
        int[] arr = {1, 3, 2, 4, 5};
        int n = arr.length;
//        定义一个新数组记录目标值
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < i; j++) {
                if (arr[j] < arr[i]) {
                    count++;
                }
            }
            result[i] = count;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
