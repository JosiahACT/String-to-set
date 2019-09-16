import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * The type String set.
 */
public class StringSet
{
    private Set<String> Characters = new TreeSet<String>();
    private static Map<String, Integer> alphabet = new TreeMap<String, Integer>();


    /**
     * Instantiates a new String set with alphabet map initialised.
     */
    public StringSet()
    {
        initialiseAlphabet();
    }

    /*
    Puts entries into the map alphabet s.t. Key: " ", Value: 0, ... Key: "z", Value: 26.
     */
    private static void initialiseAlphabet()
    {
        String alphabet1 = " abcdefghijklmnopqrstuvwxyz";

        for ( int i = 0; i < 27; i++ )
        {
            alphabet.put( alphabet1.substring( i, i + 1 ), i );
        }
    }

    /*
    Converts a string to a tree set.
     */
    private void StringToSet( String in )
    {
        for ( int i = 0; i < in.length(); i++ )
        {
            Characters.add( in.substring( i, i + 1 ) );
        }
    }

    /**
     * Takes a string and returns as a string of the characters used in that string.
     *
     * @param in The input string.
     * @return a string of the characters used in that string.
     */
    public String PrintChars( String in )
    {
        Characters.clear();
        StringToSet( in );

        StringBuilder output = new StringBuilder( in.length() );

        for ( String interim : Characters )
        {
            output.append( interim );
        }

        return output.toString();
    }

    /**
     * Coverts a string to a set with all the characters from the string.
     *
     * @param in The string to be converted.
     * @return a set made up of the characters of the string.
     */
    Set<String> getElements( String in )
    {
        StringToSet( in );
        return Characters;
    }

    /**
     * Outputs a set of integers indexed against the set of characters used for the string.
     *
     * @param in The string to be converted.
     * @return a set of integers indexed against the set of characters used for the string.
     */
    Set<Integer> getElementNumbers( String in )
    {
        String lowerCaseIn = in.toLowerCase(); //can't be bothered to have numbers for upper case letters
        StringToSet( lowerCaseIn );
        Set<Integer> output = new TreeSet<Integer>();
        Iterator<String> iterator = Characters.iterator();

        while ( iterator.hasNext() )
        {
            String interim = iterator.next();

            if ( !alphabet.containsKey( interim ) )
            {
                output.add( 99 );
            }
            else
            {
                output.add( alphabet.get( interim ) );
            }
        }

        return output;

    }


}
