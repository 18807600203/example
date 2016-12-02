package terence.web;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.servlet.view.InternalResourceView;

import terence.data.Spittle;
import terence.data.SpittleRepository;

public class HomeControllerTest {

	@Test
	public void test() throws Exception {
		HomeController controller = new HomeController();
		MockMvc mockMvc = MockMvcBuilders.standaloneSetup(controller).build();
		mockMvc.perform(MockMvcRequestBuilders.get("/")).andExpect(MockMvcResultMatchers.view().name("home"));
	}

	private List<Spittle> createSpittleList(int count) {
		List<Spittle> spittles = new ArrayList<Spittle>();
		for (int i = 0; i < count; i++) {
			spittles.add(new Spittle("Spittle" + i, new Date()));
		}
		return spittles;
	}

	@Test
	public void shouldShowRecentSpittles() {
//		List<Spittle> expectedSpittles = createSpittleList(20);
//		SpittleRepository mockRepository = MockMvcRepository.mock(SpittleRepository.class);
//		when(mockRepository.findSpittles(Long.MAX_VALUE, 20)).thenReturn(expectedSpittles);
//		SpittleController controller = new SpittleController(mockRepository);
//		MockMvc mockMvc = MockMvcBuilders.standaloneSetup(controller)
//				.setSingleView(new InternalResourceView("/WEB-INF/views/spittles.jsp")).build();
//		mockMvc.perform(MockMvcRequestBuilders.get("/spittles"))
//				.andExpect(MockMvcResultMatchers.view().name("spittles"))
//				.andExpect(MockMvcResultMatchers.model().attributeExists("spittleList")).andExpect(
//						MockMvcResultMatchers.model().attribute("spittleList", hasItems(expectedSpittles.toArray())));
	}

}
