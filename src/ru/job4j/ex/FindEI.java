package ru.job4j.ex;
//0.4. Пользовательские исключения. [#363101]

public class FindEI {

    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        for (int i = 0; i < value.length; i++) {
            if (value[i].equals(key)) {
                rsl = i;
                break;
            }
        }
        if (rsl == -1) {
            throw new ElementNotFoundException("not found");
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
