package dom.jagadish.com;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import dom.jagadish.com.model.Registration;
import dom.jagadish.com.repository.RegisterRepository;
import dom.jagadish.com.service.RegisterService;

@RunWith(SpringJUnit4ClassRunner.class)
public class RegistrationApplicationTests {
	
	@Mock
	private RegisterRepository registerRepository;
	
	@InjectMocks
	private RegisterService registerService;
	
	/*
	 * private void setup() { MockitoAnnotations.initMocks(this);
	 * 
	 * }
	 */
	@Test
	public void testAddUser() throws Exception {
		Registration user=new Registration("jai3497","Jagadish","H","123456","123456",949292694,"jai@gmail.com");
		
		when(registerRepository.save(user)).thenReturn(user);
		
		Registration result=registerService.addUser(user);
		
		assertEquals("jai3497", result.getUserId());
		System.out.println(result.getUserId());
		assertEquals("Jagadish", result.getFirstName());
		System.out.println(result.getFirstName());
		assertEquals("jai@gmail.com", result.getEmailId());
		System.out.println(result.getEmailId());
	}


}
