import org.junit.*;

import static org.junit.Assert.assertTrue;
public class hello_worldTestTest {

    private hello_worldTest hello_worldTestUnderTest;

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Before Class");
    }

    @Before
    public void before() {
        System.out.println("Before Test Case");
    }

    @Test
    public void isGreaterTest() {
        System.out.println("Test");
        Hello_World helloWorld = new Hello_World();
        assertTrue("Num 1 is greater than Num 2", Hello_World.isGreater(4, 3));
    }

    @After
    public void after() {
        System.out.println("After Test Case");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("After Class");
    }
}
