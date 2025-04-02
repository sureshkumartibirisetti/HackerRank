class Result {

    /*
     * Complete the 'dayOfProgrammer' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts INTEGER year as parameter.
     */

    public static String dayOfProgrammer(int year) {
    // Write your code here
    int feb=28;
    if(year>1918 && year<=2700){
    if(year%4==0 && (year%100!=0 || year%400==0) ){
        feb=29;
    }
    
    }
    if(year==1918){
        feb=15;
    }
    if(year>=1700 && year<=1917){
        if(year%4==0){
            feb=29;
        }
    }
    int s=256-(215+feb);
    return s+".09."+year;

    }

}
