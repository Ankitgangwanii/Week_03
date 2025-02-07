package stringbuffer;

import com.tit.stringbuffer.ComparePerformance;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ComparePerformanceTesting {
    static ComparePerformance obj;
    @BeforeEach
    void objectCreation(){
        obj = new ComparePerformance();
    }
    @Test
    void Test1(){
        long timeByStringBuilder = obj.timeTakenByStringBuilder(new StringBuilder());
        long timeByStringBuffer = obj.timeTakenByStringBuffer(new StringBuffer());

        assertEquals(true, ComparePerformance.comparePerformance(timeByStringBuilder, timeByStringBuffer));
        System.out.println("Test Case 1 is successfully passed");
    }
}
