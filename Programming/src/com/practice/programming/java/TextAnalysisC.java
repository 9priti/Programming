package com.practice.programming.java;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class TextAnalysisC {

/**
 * @param args the command line arguments
 */
public static void main(String[] args) {
    Scanner sc = new Scanner( System.in );
    System.out.println( "Please enter a line of text" );
    String userInput = sc.nextLine();

    userInput = userInput.toLowerCase();

    userInput = userInput.replaceAll( "\\W", " " );     // strip out any non words.
    userInput = userInput.replaceAll( "  ", " " );      // strip out any double spaces
                                                        //   created from stripping out non words
                                                        //   in the first place!
    String[] tokens = userInput.split( " " );
    System.out.println( userInput );

    ArrayList< String > items = new ArrayList< String >();

    items.addAll( Arrays.asList( tokens ) );

    int count = 0;

    for( int i = 0; i < items.size(); i++ )
    {
        System.out.printf( "%s: ", items.get( i ) );
        for( int j = 0; j < items.size(); j++ )
        {
            if( items.get( i ).equals( items.get( j ) ) )
                count++;
            if( items.get( i ).equals( items.get( j ) ) && count > 1 )
                items.remove( j );                      // after having counted at least
        }                                               // one, remove duplicates from List        
        System.out.printf( "%d\n", count );
        count = 0;
    }
}
}