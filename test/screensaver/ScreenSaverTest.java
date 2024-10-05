package screensaver;

import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class ScreenSaverTest {
	
	@org.junit.jupiter.api.Test
	void launch() {
		Assertions.assertEquals(0, ScreenSaver.launch());
	}
}