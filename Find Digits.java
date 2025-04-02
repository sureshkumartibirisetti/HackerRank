class Result {

    /*
     * Complete the 'findDigits' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER n as parameter.
     */

    public static int findDigits(int n) {
    // Write your code here
    int temp=n;
        int c=0;
        while(n>0){
           int x=n%10;
           if(x!=0 && temp%x==0){
               c++;
           }
           n/=10;
        }
       return c;
    }

}
