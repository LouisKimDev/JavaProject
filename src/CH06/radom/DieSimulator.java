package CH06.radom;

public class DieSimulator {
    public static void main(String[] args)
    {
        int a=0;
        int b;
        int c;
        int g;
        int e;
        int f;
        Die d = new Die(6);
        final int TRIES = 100;
        for (int i = 1; i <= TRIES; i++)
        {
            int n = d.cast();
            if ( n == 1)
            {
                a++;
            }
            System.out.print(n+" ");

        }
        System.out.println();
        System.out.print(a);
    }
}
