package practiceconcept;

import java.util.Base64;

import org.testng.annotations.Test;

public class EcodeAndDecode {
	@Test
	public void encode()
	{
		String name="shubham";
		byte[] data=Base64.getEncoder().encode(name.getBytes());
		System.out.println(data);
		System.out.println("Conflict");
	
	
	
	



}
}
