import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

class FarmTest {

	@Test
	<E> void test1() {
		Cow cow1 = new Cow("Cow1", true, 10, 20);
		Cow cow2 = new Cow("Cow2", true, 15, 15);
		Chicken chicken1 = new Chicken("Chicken1", true, 12, 18);
		Chicken chicken2 = new Chicken("Chicken2", true, 14, 16);
		ArrayList<E> animals = new ArrayList<E>() {{add((E) cow1); add((E) cow2); add((E) chicken1); add((E) chicken2);}};
		String str1 = Farm.inventory(animals);
		String str2 = "Name: Cow1 Age: 10 Weight: 20 Healthy: true	Name: Cow2 Age: 15 Weight: 15 Healthy: true	Name: Chicken1 Age: 12 Eggs: 18 Healthy: true	Name: Chicken2 Age: 14 Eggs: 16 Healthy: true	";
		assertEquals(str1, str2);
	}
	
	@Test
	<E> void test2() {
		Crop crop1 = new Crop("Crop1", true, 5, 20);
		Crop crop2 = new Crop("Crop2", true, 7, 19);
		ArrayList<E> crops = new ArrayList<E>() {{add((E) crop1); add((E) crop2);}};
		String str1 = Farm.inventory(crops);
		String str2 = "Name: Crop1 Age: 5 Bushels: 20 Healthy: true	Name: Crop2 Age: 7 Bushels: 19 Healthy: true	";
		assertEquals(str1, str2);
	}
	
	@Test
	<E extends Animal> void test3() {
		Cow cow1 = new Cow("Cow1", true, 10, 20);
		Cow cow2 = new Cow("Cow2", true, 15, 15);
		Chicken chicken1 = new Chicken("Chicken1", true, 12, 18);
		Chicken chicken2 = new Chicken("Chicken2", true, 14, 16);
		ArrayList<E> animals = new ArrayList<E>() {{add((E) cow1); add((E) cow2); add((E) chicken1); add((E) chicken2);}};
		String str1 = Farm.listen(animals);
		String str2 = "Mooooo	Mooooo	Cluck	Cluck	";
		assertEquals(str1, str2);
	}

	@Test
	<E extends Item> void test4() {
		Cow cow1 = new Cow("Cow1", true, 10, 20);
		Cow cow2 = new Cow("Cow2", true, 15, 15);
		Chicken chicken1 = new Chicken("Chicken1", true, 12, 18);
		Chicken chicken2 = new Chicken("Chicken2", true, 14, 16);
		ArrayList<E> animals = new ArrayList<E>() {{add((E) cow1); add((E) cow2); add((E) chicken1); add((E) chicken2);}};
		for(int i = 0; i < animals.size(); i++) {
			assertEquals(true, Farm.isSellable(animals.get(i)));
		}
	}
	
	@Test
	<E extends Item> void test5() {
		Crop crop1 = new Crop("Crop1", true, 5, 20);
		Crop crop2 = new Crop("Crop2", true, 7, 19);
		ArrayList<E> crops = new ArrayList<E>() {{add((E) crop1); add((E) crop2);}};
		for(int i = 0; i < crops.size(); i++) {
			assertEquals(true, Farm.isSellable(crops.get(i)));
		}
	}
	
	@Test
	<E extends Item> void test6() {
		Cow cow1 = new Cow("Cow1", true, 10, 20);
		Cow cow2 = new Cow("Cow2", true, 15, 15);
		Chicken chicken1 = new Chicken("Chicken1", true, 12, 18);
		Chicken chicken2 = new Chicken("Chicken2", true, 14, 16);
		ArrayList<E> animals = new ArrayList<E>() {{add((E) cow1); add((E) cow2); add((E) chicken1); add((E) chicken2);}};
		assertEquals(208, Farm.sell(animals));
	}
	
	@Test
	<E extends Item> void test7() {
		Crop crop1 = new Crop("Crop1", true, 5, 20);
		Crop crop2 = new Crop("Crop2", true, 7, 19);
		ArrayList<E> crops = new ArrayList<E>() {{add((E) crop1); add((E) crop2);}};
		assertEquals(195, Farm.sell(crops));
	}
	
	@Test
	<E extends Comparable<E>> void test8() {
		Cow cow1 = new Cow("Cow1", true, 10, 20);
		Cow cow2 = new Cow("Cow2", true, 15, 3500);
		ArrayList<E> animals = new ArrayList<E>() {{add((E) cow1); add((E) cow2);}};
		assertEquals(1, Farm.getMostValuable(animals));
	}
	
	@Test
	<E extends Comparable<E>> void test9() {
		Chicken chicken1 = new Chicken("Chicken1", true, 12, 1800);
		Chicken chicken2 = new Chicken("Chicken2", true, 14, 16);
		ArrayList<E> animals = new ArrayList<E>() {{add((E) chicken1); add((E) chicken2);}};
		assertEquals(0, Farm.getMostValuable(animals));
	}
	
	@Test
	<E extends Comparable<E>> void test10() {
		Crop crop1 = new Crop("Crop1", true, 5, 20);
		Crop crop2 = new Crop("Crop2", true, 7, 5000);
		ArrayList<E> crops = new ArrayList<E>() {{add((E) crop1); add((E) crop2);}};
		assertEquals(1, Farm.getMostValuable(crops));
	}
	
}
