import static org.junit.Assert.*;

import org.junit.Test;

import static org.hamcrest.Matchers.containsInAnyOrder;

public class StringSetTest
{
    StringSet a = new StringSet();

    @Test
    public void shouldWork()
    {
        assertEquals( "djrs", a.PrintChars( "jjjdddjrrrjsss" ) );
    }

    @Test
    public void shouldWorkSetwise()
    {
        assertThat( a.getElements( "dr5y5se4&" ), containsInAnyOrder( "d", "r", "5", "y", "s", "e", "4", "&" ) );
    }

    @Test
    public void shouldWorkNumberwise()
    {
        assertThat( a.getElementNumbers( "dr5y5se4&" ), containsInAnyOrder( 4, 18, 99, 25, 19, 5 ) );
    }


}