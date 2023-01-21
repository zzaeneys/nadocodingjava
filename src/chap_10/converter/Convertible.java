package chap_10.converter;

@FunctionalInterface
public interface Convertible {
    void convert(int USD);
    // void convert2(int USD); -> 함수형 인터페이스라 하나만 가능
}
