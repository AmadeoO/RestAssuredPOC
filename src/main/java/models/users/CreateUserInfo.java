package models.users;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateUserInfo {
    private String name;
    private String job;

    public CreateUserInfo(String name, String job){
        this.name = name;
        this.job = job;
    }
}
