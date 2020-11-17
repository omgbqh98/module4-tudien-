package service;

import java.util.HashMap;
import java.util.Map;

public class TuDienService {
    static Map<String,String>tuDiens;
    static {
        tuDiens = new HashMap<>();
        tuDiens.put("hello", "xin chao");
        tuDiens.put("like", "thich");
        tuDiens.put("love", "yeu");
    }

    public String tuDien(String input) {
        String trans= tuDiens.get(input);
        if (trans != null) {
            return trans;
        }
        return null;
    }
}
