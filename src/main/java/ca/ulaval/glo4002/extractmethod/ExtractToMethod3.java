package ca.ulaval.glo4002.extractmethod;

import java.util.Arrays;
import java.util.List;

public class ExtractToMethod3 {

  public void swapFruitsForVeggies(List<String> basket) {
    removeFruits(basket);
    addVeggies(basket);
  }

  private void addVeggies(List<String> basket) {
    basket.addAll(Arrays.asList("tomato", "spinach", "sweet potato", "cauliflower", "adirondack blue potatoes"));
  }

  private void removeFruits(List<String> basket) {
    basket.removeAll(Arrays.asList("apple", "kiwi", "orange", "dragon fruit", "blueberry"));
  }
}
