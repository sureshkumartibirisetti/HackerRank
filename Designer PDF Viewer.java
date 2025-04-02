class Result {

    /*
     * Complete the 'designerPdfViewer' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY h
     *  2. STRING word
     */

    public static int designerPdfViewer(List<Integer> n, String s) {
    // Write your code here
    int c=0;
        for(int i=0;i<s.length();i++){
            int a=s.charAt(i)-97;
            if(c<n.get(a)){
                c=n.get(a);
            }
        }
        return (c*s.length());

    }

}
