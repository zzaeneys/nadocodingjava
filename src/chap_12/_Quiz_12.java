package chap_12;

public class _Quiz_12 {
    public static void main(String[] args) {
        ThreadA threadA = new ThreadA();
        ThreadB threadB = new ThreadB();
        threadA.start();
        threadB.start();

//        while (threadA.isAlive() || threadB.isAlive()) {
//
//        }

        try {
            threadA.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        try {
            threadB.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        setWrap();
    }

    public static void setWrap() {
        System.out.println(" == 세트 상품 포장 시작 == ");
        for (int i = 1; i <= 5; i++) {
            System.out.println("세트 상품 포장 " + i + "/5");
        }
        System.out.println(" == 세트 상품 포장 완료 == ");
    }


}

class ThreadA extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("A 상품 준비 " + i + "/5");
        }
        System.out.println(" -- A 상품 준비 완료 -- ");
    }
}
class ThreadB extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("B 상품 준비 " + i + "/5");
        }
        System.out.println(" -- B 상품 준비 완료 -- ");
    }
}


