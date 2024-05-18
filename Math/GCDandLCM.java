package Math;

/*Given two numbers A and B. The task is to find out their LCM and GCD.
Example 1:
Input:
A = 5 , B = 10
Output:
10 5
Explanation:
LCM of 5 and 10 is 10, while
thier GCD is 5.*/
public class GCDandLCM {
    static Long[] lcmAndGcd(Long A , Long B) {
        // code here
        Long g = gcd(A,B);
        Long lcm = (Long)(A*B/g);
        Long[] res = new Long[2];
        res[0] = lcm;
        res[1] = g;
        return res;

    }
    public static Long gcd(Long a, Long b){
        if(a%b==0){
            return b;
        }
        return gcd(b,a%b);
    }
}
