class Solution {
    public double solution(int[] numbers) {
//         int sum1 = 0;
        
//         for(int num:numbers) {
//             sum1 += num;
//         }
//         double average = (double)sum1 / numbers.length;
//         return average;
        double answer = 0;
        int sum = 0;
        for(int n : numbers) {
            sum += n;
        }
        return (double) sum / numbers.length;
    }
}