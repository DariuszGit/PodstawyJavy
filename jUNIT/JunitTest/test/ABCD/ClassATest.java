package ABCD;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class ClassATest {
    
    private ClassA a;
    
    public ClassATest()
    {
        a = new ClassA();
    }   
    
    @Test
    public void Test1()
    {
        assertEquals(7, a.Method1(5));
    }
    
    @Test
    public void Test2()
    {        
        a.Method1(7);
        assertFalse(a.Method2(7));
        assertTrue(a.Method2(15));
    }    
}
