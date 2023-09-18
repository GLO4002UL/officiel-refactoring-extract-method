package ca.ulaval.glo4002.extractmethod;

import java.util.List;

public class ExtractToMethod {

  public void swapFruitsForVeggies(List<String> basket) {
    swapRed(basket);
    swapGreen(basket);
    swapOrange(basket);
    swapWhite(basket);
    swapBlue(basket);
  }

  private void swapBlue(List<String> basket) {
    basket.remove("blueberry");
    basket.add("adirondack blue potatoes");
  }

  private void swapWhite(List<String> basket) {
    basket.remove("dragon fruit");
    basket.add("cauliflower");
  }

  private void swapOrange(List<String> basket) {
    basket.remove("orange");
    basket.add("sweet potato");
  }

  private void swapGreen(List<String> basket) {
    basket.remove("kiwi");
    basket.add("spinach");
  }

  private void swapRed(List<String> basket) {
    basket.remove("apple");
    basket.add("tomato");
  }
}
