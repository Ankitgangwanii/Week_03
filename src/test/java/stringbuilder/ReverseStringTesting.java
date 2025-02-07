package stringbuilder;

import com.tit.stringbuilder.ReverseString;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class ReverseStringTesting {
    public ReverseString obj;
    @BeforeEach
    void objectCreation(){
        obj = new ReverseString();
    }

    @Test
    void Test1(){
        assertEquals("tiknA",obj.reverseString("Ankit"));
        System.out.println("Test Case 1 Passed Successfully");
    }

    @Test
    void Test2(){ //for space reversal too
        assertEquals("inimegepaC ni skrow tiknA",obj.reverseString("Ankit works in Capegemini"));
        System.out.println("Test Case 2 Passed Successfully");
    }

}
