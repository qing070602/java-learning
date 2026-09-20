public class ArrayTwoSum {
    public static void main(String[] args) {
//        给定一个整数数组nums和一个整数目标值target,请你在该数组中找出和为目标值target的
//那两个 整数,并输出它们的数组索引。
//
//提示:先不用考虑效率问题,两层循环即可完成
//
//要求1:只要输出第一对满足要求的情况
//
//要求2:输出所有满足要求的情况


//        1.定义一个整数数组和目标值
        int[] nums = {2, 7, 11, 15, 3, 6};
        int target = 9;
//        我的思路：先定义0,1两个索引，然后判断索引对应的值是否等于目标值，如果不等于就让第二个索引加1，如果第二个索引到达数组末尾，就让第一个索引加1，第二个索引回到第一个索引的下一个位置，继续判断，直到找到满足条件的两个索引
//        2.定义两个索引
//        int index1 = 0;
//        int index2 = 1;
//        3.循环遍历数组
//        要求一：只要输出第一对满足要求的情况
       /* while(true){
            if(nums[index1] + nums[index2] != target){
                index2++;
                if(index2 == nums.length) {
                    index1++;
                    index2 = index1 + 1;
                }
            } else {
                System.out.println(index1 + " " + index2);
                break;
            }
        }*/

//        要求二：输出所有满足的情况
//        while(index1 < nums.length - 1) {
//            if(nums[index1] + nums[index2] == target) {
//                System.out.println(index1 + " " + index2);
//            }
//            index2++;
//            if(index2 == nums.length) {
//                index1++;
//                index2 = index1 + 1;
//            }
//        }
//    }
//}
//for循环


        for (int index1 = 0; index1 < nums.length - 1; index1++) {
            for (int index2 = index1 + 1; index2 < nums.length; index2++) {
                if (nums[index1] + nums[index2] == target) {
                    System.out.println(index1 + " " + index2);
                }
            }
        }
    }
}

