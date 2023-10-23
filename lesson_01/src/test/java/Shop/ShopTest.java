package Shop;

import homework_01.Shop.Product;
import homework_01.Shop.Shop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class ShopTest {
    /*
   1. Напишите тесты, чтобы проверить, что магазин хранит верный список продуктов (правильное количество продуктов, верное содержимое корзины).
   2. Напишите тесты для проверки корректности работы метода getMostExpensiveProduct.
   3. Напишите тесты для проверки корректности работы метода sortProductsByPrice (проверьте правильность сортировки).
   */
    public static void main(String[] args) {

        Shop shop = new Shop();

        Product product1 = new Product();
        product1.setTitle("Огурцы");
        product1.setCost(90);

        Product product2 = new Product();
        product2.setTitle("Помидоры");
        product2.setCost(200);

        Product product3 = new Product();
        product3.setTitle("Бананы");
        product3.setCost(130);

        Product product4 = new Product();
        product4.setTitle("Сок");
        product4.setCost(150);

        Product product5 = new Product();
        product5.setTitle("Пельмени");
        product5.setCost(350);

        List<Product> productList = new ArrayList<Product>();
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
        productList.add(product4);

        shop.setProducts(productList);

        System.out.println(shop.getProducts());
        System.out.println(shop.sortProductsByPrice());
        System.out.println(shop.getMostExpensiveProduct());

        // Правильное количество товаров
        assertThat(shop.getProducts()).hasSize(4);
        // Правильный состав товаров
        assertThat(shop.getProducts()).contains(product1, product2, product3, product4);
        // Правильная сортировка по цене
        assertThat(shop.sortProductsByPrice()).isEqualTo(new ArrayList(Arrays.asList(product1, product3, product4, product2)));
        // Правильный самый дорогой продукт
        assertThat(shop.getMostExpensiveProduct()).isEqualTo(product2);

    }



}
