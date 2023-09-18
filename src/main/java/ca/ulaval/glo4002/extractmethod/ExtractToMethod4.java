package ca.ulaval.glo4002.extractmethod;

import java.util.Arrays;
import java.util.List;

public class ExtractToMethod4 {

  private static final List<String> FRUITS = Arrays.asList("apple", "kiwi", "orange", "dragon fruit", "blueberry");

  private static final List<String> VEGGIES = Arrays.asList("tomato", "spinach", "sweet potato", "cauliflower", "adirondack blue potatoes");

  public void swapFruitsForVeggies(List<String> basket) {
    basket.removeAll(FRUITS);
    basket.addAll(VEGGIES);
  }
}
