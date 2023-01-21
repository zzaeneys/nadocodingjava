package chap_10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class _Quiz_10 {
    public static void main(String[] args) {
        System.out.println("미술관 입장료");
        System.out.println("-------------------------");
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("챈들러", 50));
        customers.add(new Customer("레이첼", 42));
        customers.add(new Customer("모니카", 21));
        customers.add(new Customer("벤자민", 18));
        customers.add(new Customer("제임스", 5));

        customers.stream()
                .map(x -> x.age >= 20 ? x.name + " 5000원" : x.name + " 무료")
                .forEach(System.out::println);
    }
}

class Customer {
    public String name;

    public int age;
    public Customer(String name, int age) {
        this.name = name;
        this.age = age;
    }

}
