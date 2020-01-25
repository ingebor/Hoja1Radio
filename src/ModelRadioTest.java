import static org.junit.Assert.*;

import org.junit.Test;

public class ModelRadioTest {

	ModelRadio rad = new ModelRadio();
	@Test
	public void test() {
		rad.onOff();
		boolean esto = rad.getOnOff();
		boolean prueba = esto;
		boolean resultado = true;
		assertEquals(resultado,prueba);
	}

}
