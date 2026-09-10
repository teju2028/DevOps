public class Factorial{
    public static long compute(int n)
    {
        if(n<0)
        {
            throw new IllegalArgumentException("Negative numbers not allowed");
        }
        int result=1;
        for(int i=2;i<=n;i++)
        {
            result*=i;
        }
        return result;
    }
    public static void main(String args[])
    {
        int number=7;
        System.out.println("Factorial of number "+number+"is "+compute(number));
    }
}