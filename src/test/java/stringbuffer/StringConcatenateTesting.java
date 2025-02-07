package stringbuffer;

import com.tit.stringbuffer.StringConcatenate;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringConcatenateTesting {
    static StringConcatenate obj;

    @BeforeEach

    void objectCreation(){
        obj = new StringConcatenate();
    }

    @Test
    void Test1()
    {
        assertEquals("AnkitAadarshAditya",obj.concatenateString(new String []{"Ankit", "Aadarsh", "Aditya"} ));
        System.out.println("TestCase 1 successfully passed");
    }

    @Test
    void Test2()
    {
        assertEquals("Ankit Aadarsh Aditya",obj.concatenateString(new String []{"Ankit"," ","Aadarsh"," ", "Aditya"} ));
        System.out.println("TestCase 2 successfully passed");
    }

}
