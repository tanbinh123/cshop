package com.javachen.service;

import com.javachen.entity.User;
import com.javachen.model.form.PasswordChange;
import com.javachen.model.form.PasswordReset;
import com.javachen.model.form.UserLogin;
import com.javachen.model.form.UserRegister;

/**
 * 账号管理的接口
 *
 * @author june
 * @createTime 2019-06-27 10:41
 * @see
 * @since
 */
public interface AccountService {
    User login(UserLogin userLogin);

    User changePassword(PasswordChange passwordChange);

    User resetPassword(PasswordReset passwordReset);

    User register(UserRegister userRegister);

    void sendVerifyCode(String phone);

    void sendForgotPasswordNotification(String email, String forgotPasswordUrl);
}
