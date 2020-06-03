import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ApplicationStudentTest {
    ApplicationStudent app = new ApplicationStudent();

    @Test
    public void testPrice()
    {
        assertEquals(80.00,80.00,"Gurwinder");
        assertEquals(90.0,app.findPrice("xyz"));
    }
}