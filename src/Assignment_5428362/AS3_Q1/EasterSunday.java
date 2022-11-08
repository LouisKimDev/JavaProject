package Assignment_5428362.AS3_Q1;

public class EasterSunday {
    public int y;
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int g;
    private int h;
    private int j;
    private int k;
    private int m;
    private int r;
    public int n;
    public int p;


    public EasterSunday(){
        y = 0;
    }

    public void enterYear(int year){
        y = y + year;
        a = y % 19;
        b = y / 100;
        c = y % 100;
        d = b / 4;
        e = b % 4;
        g = ( 8 * b + 13 ) / 25;
        h = ( 19 * a + b - d - g + 15) % 30;
        j = c / 4;
        k = c % 4;
        m = ( a + 11 * h ) / 319;
        r = ( 2 * e + 2 * j - k - h + m + 32) % 7;
        n = ( h - m + r + 90) / 25;
        p = ( h - m + r + n + 19) % 32;
    }
    public int giveMonth(){
        return n;
    }
    public int giveDate(){
        return p;
    }



}
