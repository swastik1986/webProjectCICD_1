package DevOps.Y14Maven;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int a =1;
        int b= 2;
        Addition_Y14 myadd = new Addition_Y14();
        int c = myadd.addition(a, b);
        System.out.println(c);
    }
}
