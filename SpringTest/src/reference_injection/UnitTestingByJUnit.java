/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reference_injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

/**
 *
 * @author Abhishek.Sehgal
 */
@ContextConfiguration
public class UnitTestingByJUnit {
//  final Logger logger = LoggerFactory.getLogger(SetterMessageTest.class);

    @Autowired
    private SetterMessage message = null;

    /**
     * Tests message.
     */
//    @Test
//    public void testMessage() {
//        assertNotNull("Constructor message instance is null.", message);
//        String msg = message.getMessage();
//        assertNotNull("Message is null.", msg);
//        String expectedMessage = "Spring is fun.";
//        assertEquals("Message should be '" + expectedMessage + "'.", expectedMessage, msg);
//        logger.info("message='{}'", msg);
//    }
}
