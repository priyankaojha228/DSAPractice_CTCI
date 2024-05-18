package Math;
/*Good approach to solve in O(n)*/
public class SumOfAllDivisors {
    static long sumOfDivisors(int N){
        // code here
        long sum=0;
        for(int i=1;i<=N;i++){
            sum=sum+(N/i)*i;
        }
        return sum;
    }
}
