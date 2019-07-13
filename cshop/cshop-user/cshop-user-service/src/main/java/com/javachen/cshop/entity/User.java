package com.javachen.cshop.entity;

import com.javachen.cshop.model.vo.UserVo;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.beans.BeanUtils;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Data
@NoArgsConstructor
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;

    private String phone;

    private String email;

    private Boolean active = false;

    @CreationTimestamp
    private Date createTime;// 创建时间

    @UpdateTimestamp
    private Date updateTime;// 最后修改时间

    public UserVo toVo(){
        UserVo userVo=new UserVo();
        BeanUtils.copyProperties(this,userVo);
        return userVo;
    }

}