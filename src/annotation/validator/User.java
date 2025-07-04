package annotation.validator;

public class User {

    @NotEmpty(message = "이름이 비었음")
    private String name;

    @Range(min = 1, max = 100, message = "나이는 1과 100 사이어야 함")
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
