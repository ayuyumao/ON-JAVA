
class ValA {
    int i;
}

public class EqualsMethod {
    public static void main(String[] args) {
        ValA va1 = new ValA();
        ValA va2 = new ValA();
        va1.i = va2.i = 100;
        System.out.println(va1.equals(va2));
        ValB vb1 = new ValB();
        ValB vb2 = new ValB();
        System.out.println(vb1.equals(vb2));
    }
}

class ValB {
    int i;

    public boolean equals(Object o) {
        ValB rval = (ValB) o; // 将对象o转型为ValB
        return i == rval.i;
    }
}