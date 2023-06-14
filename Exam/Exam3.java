package Exam;

public class Exam3 {
    public static void main(String[] args) {
        오리 a오리 = new 청둥오리();// 청둥오리가 만들어집니다. 청둥오리는 기본 날개를 가지고 태어납니다.
        a오리.날다(); // 오리가 날개로 날아갑니다.

        a오리.a날개 = new 불사조날개();
        a오리.날다(); // 오리가 불사조 날개로 불타오르며 날아갑니다.

        a오리 = new 고무오리();// 고무오리가 만들어집니다. 고무오리는 고무 날개를 가지고 태어납니다.

        a오리.날다(); // 고무 날개로는 날 수 없어요..

        a오리.a날개 = new 로켓날개();
        a오리.날다(); // 오리가 로켓날개로 놀라운 속도로 굉음을 내며 날아갑니다.

    }
}
class 오리 {
    날개 a날개;
    void 날다() {
        a날개.사용();
    }
}

class 청둥오리 extends 오리 {
    청둥오리() {
        System.out.println("청둥오리가 만들어집니다. 청둥오리는 기본 날개를 가지고 태어납니다.");
        a날개 = new 기본날개();
    }
}

class 고무오리 extends 오리 {
    고무오리() {
        System.out.println("고무오리가 만들어집니다. 고무오리는 고무 날개를 가지고 태어납니다.");
        a날개 = new 고무날개();
    }
}
class 날개 {
    void 사용(){}
}
class 기본날개 extends 날개 {
    void 사용() {
        System.out.println("오리가 날개로 날아갑니다.");
    }
}

class 고무날개 extends 날개 {
    void 사용() {
        System.out.println("고무 날개로는 날 수 없어요..");
    }
}

class 불사조날개 extends 날개 {
    void 사용() {
        System.out.println("오리가 불사조 날개로 불타오르며 날아갑니다.");
    }
}

class 로켓날개 extends 날개 {
    void 사용() {
        System.out.println("오리가 로켓날개로 놀라운 속도로 굉음을 내며 날아갑니다.");
    }
}