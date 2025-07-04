package annotation.validator;

public class Team {

    @NotEmpty(message = "이름이 비었음")
    private String name;

    @Range(min = 1, max = 999, message = "회원 수는 1과 999 사이여야 합니다.")
    private int memberCount;

    public Team(String name, int age) {
        this.name = name;
        this.memberCount = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return memberCount;
    }
}
