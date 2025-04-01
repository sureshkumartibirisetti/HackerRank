class Result {

    /*
     * Complete the 'camelcase' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    public static int camelcase(String s) {
    // Write your code here
    int c=0;
    for(int i=0;i<s.length();i++){
        if(s.charAt(i)>='A' && s.charAt(i)<='Z'){
            c++;
        }
    }
    return c+1;

    }

}
