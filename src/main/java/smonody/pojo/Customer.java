package smonody.pojo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Customer {
    private Integer user_id;
    private String user_code;
    private String user_name;
    private String user_password;
    private Integer user_state;

}
