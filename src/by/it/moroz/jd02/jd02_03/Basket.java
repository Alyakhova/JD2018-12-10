package by.it.moroz.jd02.jd02_03;

import java.util.HashMap;
import java.util.Map;

class Basket {

    Map<String, Integer> basket = new HashMap<>();

    void putGoodInBasket (Map<String, Integer> basket, String good, int price){
        basket.put(good, price);
    }


}
