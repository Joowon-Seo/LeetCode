class Solution {
    public double myPow(double x, int n) {
        if (n == 0){
            return 1;
        }


        double p = myPow(x, n/2);

        if (n%2 == 0){
            return p*p;
        } else if (n%2 > 0){
            return p*p*x;
        } else{
            return (p*p)/x;
        }
    }
}