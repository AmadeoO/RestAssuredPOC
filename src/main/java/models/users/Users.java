package models.users;

import lombok.*;

import java.util.List;

@Setter
@Getter
public class Users {
    public Integer page;
    public Integer per_page;
    public Integer total;
    public Integer total_pages;
    public List<Datum> data = null;
}
