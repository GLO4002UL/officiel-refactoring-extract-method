package ca.ulaval.glo4002.extractmethod;

import java.util.List;

public class ExtractToMethod2 {

  public void swapFruitsForVeggies(List<String> basket) {
    removeFruits(basket);
    addVeggies(basket);
  }

  private void addVeggies(List<String> basket) {
    basket.add("tomato");
    basket.add("spinach");
    basket.add("sweet potato");
    basket.add("cauliflower");
    basket.add("adirondack blue potatoes");
  }

  private void removeFruits(List<String> basket) {
    basket.remove("apple");
    basket.remove("kiwi");
    basket.remove("orange");
    basket.remove("dragon fruit");
    basket.remove("blueberry");
  }
}
