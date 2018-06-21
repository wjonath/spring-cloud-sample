package cn.iqoo.oauth2.entity;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Date;

@Data
@Accessors(chain = true)
public class UserBase {
    private Integer id;

    private String userName;

    private String nickName;

    private String userPwd;

    private Date createDate;

    private Date updateDate;

}