public class Main
{
    public static void main( String[] args )
    {
        StringSet a = new StringSet();
        System.out.println(a.PrintChars( "%$*&^%*^%%%$£ " ));
        System.out.println(a.PrintChars( "rrrrrrrrrrrrr" ));
        System.out.println(a.getElementNumbers(  "erwedfdfrgdfbsdcdfrgth" ));
    }
}
