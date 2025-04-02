class Result {

    /*
     * Complete the 'birthday' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY s
     *  2. INTEGER d
     *  3. INTEGER m
     */

    public static int birthday(List<Integer> list, int d, int m) {
    // Write your code here
    int c=0;
        for(int i=0;i<=list.size()-m;i++){
            int s=0;
            for(int j=i;j<i+m;j++){
                s+=list.get(j);
            }
            if(s==d){
                c++;
            }
        }
        return c;

    }

}
