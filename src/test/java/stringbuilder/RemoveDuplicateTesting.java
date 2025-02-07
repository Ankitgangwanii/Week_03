package stringbuilder;

import com.tit.stringbuilder.RemoveDuplicate;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class RemoveDuplicateTesting {
    RemoveDuplicate obj;
    @BeforeEach
    void objectCreation(){
        obj = new RemoveDuplicate();
    }
    @Test
    void Test1(){
        assertEquals("abcde", obj.removeDuplicate("aaabbcccdddaaaeeee"));
        System.out.println("Test Case 1 successfully passed");
    }

    @Test
    void Test2(){
        assertEquals("abc de", RemoveDuplicate.removeDuplicate("aaabbccc  dddaaa  eeee"));
        System.out.println("Test Case 2 successfully passed");
    }

}
