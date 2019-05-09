package src.annotation.demo;

public class UserVO {

    @isYoung(maxAge = 31)
    private int age;
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return "UserVO{" +
                "age=" + age +
                '}';
    }
}

