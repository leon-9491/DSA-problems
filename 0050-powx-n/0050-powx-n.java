class Solution {
    public double power(double x, Long N)
    {
        if(N==0)
        {
            return 1;
        }
        if(N==1)
        {
            return x;
        }
        if(N%2==0)
        {
            return power(x*x,N/2);
        }
        return x*power(x,N-1);
    }
    public double myPow(double x, int n)
     {
        long N=n;
      if(N<0)
        {
            return 1.0/ power(x,-N) ;
        }
        return power(x,N);
    }
}