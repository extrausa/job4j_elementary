package ru.job4j.pojo;
//3.2. Удаление моделей из массива. [#363158]
public class ShopDrop {
    public static Product[] leftShift(Product[] products, int index) {
        //roduct[] rsl = new Product[products.length + 1];
        for (int i = 0; i < products.length - 1; i++) {

            if(i == index) {
                products[i] = null;
            }
            if (products[i] == null) {
                products[i]  = products[i + 1];

            }

        }
        products[products.length - 1] = null;
        return products;
    }
}
