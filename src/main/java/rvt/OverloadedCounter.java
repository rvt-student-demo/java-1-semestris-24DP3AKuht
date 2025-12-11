package rvt;

public class OverloadedCounter {
     public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter(10);

        c1.increase();
        c1.increase(5);
        System.out.println("c1 value: " + c1.value());

        c2.decrease();
        c2.decrease(3);
        System.out.println("c2 value: " + c2.value());

        c1.decrease();
        c1.decrease(2);
        System.out.println("c1 value after decrease: " + c1.value());

        c2.increase();
        c2.increase(4);
        System.out.println("c2 value after increase: " + c2.value());

        c1.increase(-5);
        c2.decrease(-3);
        System.out.println("c1 final value: " + c1.value());
        System.out.println("c2 final value: " + c2.value());
    }
}

class Counter {
    private int value;

    public Counter(int startValue) {
        this.value = startValue;
    }

    public Counter() {
        this(0);
    }

    public int value() {
        return value;
    }

    public void increase() {
        value++;
    }

    public void increase(int increaseBy) {
        if (increaseBy > 0) {
            value += increaseBy;
        }
    }

    public void decrease() {
        value--;
    }

    public void decrease(int decreaseBy) {
        if (decreaseBy > 0) {
            value -= decreaseBy;
        }
    }
}



