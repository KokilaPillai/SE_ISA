package INDIAN_PLANTS;


import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

class testing {

	@Test
	 void test() {
		register reg= new register("Kokila","Pillai@123","kokila.Pillai@gmail.com");
		Boolean response = reg.user_register("Kokila", "Pillai@123", "kokila.Pillai@gmail.com");
		Boolean actualresponses = true;
		assertEquals(actualresponses,response);
		
	}

}
