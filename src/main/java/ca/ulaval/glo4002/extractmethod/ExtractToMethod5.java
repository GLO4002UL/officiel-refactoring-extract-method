package ca.ulaval.glo4002.extractmethod;

import java.util.List;

public class ExtractToMethod5 {

  public void swapFruitsForVeggies(List<String> basket) {
    swap(basket, "apple", "tomato");
    swap(basket, "kiwi", "spinach");
    swap(basket, "orange", "sweet potato");
    swap(basket, "dragon fruit", "cauliflower");
    swap(basket, "blueberry", "adirondack blue potatoes");
  }

  private void swap(List<String> basket, String apple, String tomato) {
    basket.remove(apple);
    basket.add(tomato);
  }
}
