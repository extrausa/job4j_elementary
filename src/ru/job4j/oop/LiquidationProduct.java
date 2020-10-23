package ru.job4j.oop;
//6. Почему наследование - это плохо [#363146]
public final class LiquidationProduct {
    private Product product;

    public LiquidationProduct(String name, int price) {
        product = new Product(name, price);
    }

    public String label() {
        return product.label();
    }
}
