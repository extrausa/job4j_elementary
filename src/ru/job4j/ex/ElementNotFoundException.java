package ru.job4j.ex;
//0.4. Пользовательские исключения. [#363101]
public class ElementNotFoundException extends Exception {
    public ElementNotFoundException(String message) {
        super(message);
    }

    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        for (String v: value
             ) {
            if (v.equals(key)) {
                rsl = 1;
                break;
            } else {
                throw new ElementNotFoundException("not found");
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        String[] word = {"car", "dog", "monkey", "elphant"};
        String transport = "car";
        String air = "aircraft";
        try {
            System.out.println(indexOf(word, transport));
            System.out.println(indexOf(word ,air));
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }


}
