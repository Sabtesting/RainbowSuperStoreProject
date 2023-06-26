package utilities;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class FileUploadRobotClass {

	public void fileUpload() throws AWTException
	{
		Robot rb = new Robot();

		StringSelection filePath = new StringSelection(System.getProperty("user.dir")+"\\src\\test\\resources\\RobotFileUpload.txt");

		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filePath, null);

		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.delay(2);
		rb.keyPress(KeyEvent.VK_V);

		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.delay(2);
		rb.keyRelease(KeyEvent.VK_V);

		rb.keyPress(KeyEvent.VK_ENTER);
		rb.delay(2);
		rb.keyRelease(KeyEvent.VK_ENTER);

		System.out.println("file uploaded..");

		
	}

}
