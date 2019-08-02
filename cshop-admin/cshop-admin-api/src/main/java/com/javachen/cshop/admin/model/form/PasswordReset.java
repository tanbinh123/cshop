/*
 * #%L
 * BroadleafCommerce Framework Web
 * %%
 * Copyright (C) 2009 - 2016 Broadleaf Commerce
 * %%
 * Licensed under the Broadleaf Fair Use License Agreement, Version 1.0
 * (the "Fair Use License" located  at http://license.broadleafcommerce.org/fair_use_license-1.0.txt)
 * unless the restrictions on use therein are violated and require payment to Broadleaf in which case
 * the Broadleaf End Admin License Agreement (EULA), Version 1.1
 * (the "Commercial License" located at http://license.broadleafcommerce.org/commercial_license-1.1.txt)
 * shall apply.
 *
 * Alternatively, the Commercial License may be replaced with a mutually agreed upon license (the "Custom License")
 * between you and Broadleaf Commerce. You may not use this file except in compliance with the applicable license.
 * #L%
 */
package com.javachen.cshop.admin.model.form;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Data
public class PasswordReset implements Serializable {
    private static final long serialVersionUID = 1L;

    private String username;

    private String token;

    @NotNull(message = "新密码不能为空")
    @Length(min = 6, max = 25, message = "新密码长度需要在6和25之间")
    private String newPassword;

    @NotNull(message = "确认密码不能为空")
    @Length(min = 6, max = 25, message = "确认密码长度需要在6和25之间")
    private String newPasswordConfirm;
}