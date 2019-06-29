/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.cam.v20190116.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateUserRequest  extends AbstractModel{

    /**
    * Sub-user username
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Sub-user note
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * Whether or not the sub-user is allowed to log in to the console. 0: No; 1: Yes.
    */
    @SerializedName("ConsoleLogin")
    @Expose
    private Long ConsoleLogin;

    /**
    * Sub-user’s password to login to the console. If you have not set up password rules, the default rules are: 1. have to be at least 8 characters long; 2. must contain at least one lower case letter, one upper case letter, one digit, and one special characters. This value is valid only when the sub-user is allowed to use console. If no value is specified, and console login is allowed, the system will automatically generate passwords. The auto-passwords are 32 characters long and contain letters (both upper and lower cases), numbers, and special characters. 
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * If the sub-user needs to reset the password to re-login the console. 0: No; 1: Yes
    */
    @SerializedName("NeedResetPassword")
    @Expose
    private Long NeedResetPassword;

    /**
    * Mobile Number
    */
    @SerializedName("PhoneNum")
    @Expose
    private String PhoneNum;

    /**
    * Area Code
    */
    @SerializedName("CountryCode")
    @Expose
    private String CountryCode;

    /**
    * Email
    */
    @SerializedName("Email")
    @Expose
    private String Email;

    /**
     * Obtain sub-user username
     * @return Name sub-user username
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set sub-user username
     * @param Name sub-user username
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Obtain sub-user note
     * @return Remark sub-user note
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set up sub-user note
     * @param Remark sub-user note
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Whether or not the sub-user is allowed to log in to the console. 0: No; 1: Yes.
     * @return ConsoleLogin Whether or not the sub-user is allowed to log in to the console. 0: No; 1: Yes.
     */
    public Long getConsoleLogin() {
        return this.ConsoleLogin;
    }

    /**
     * Set whether or not the sub-user is allowed to log in to the console. 0: No; 1: Yes.
     * @param ConsoleLogin Whether or not the sub-user is allowed to log in to the console. 0: No; 1: Yes.
     */
    public void setConsoleLogin(Long ConsoleLogin) {
        this.ConsoleLogin = ConsoleLogin;
    }

    /**
     * Sub-user’s password to login to the console. If you have not set up password rules, the default rules are: 1. have to be at least 8 characters long; 2. must contain at least one lower case letter, one upper case letter, one digit, and one special characters. This value is valid only when the sub-user is allowed to use console. If no value is specified, and console login is allowed, the system will automatically generate passwords. The auto-passwords are 32 characters long and contain letters (both upper and lower cases), numbers, and special characters. 
     * @return Password Sub-user’s password to login to the console. If you have not set up password rules, the default rules are: 1. have to be at least 8 characters long; 2. must contain at least one lower case letter, one upper case letter, one digit, and one special characters. This value is valid only when the sub-user is allowed to use console. If no value is specified, and console login is allowed, the system will automatically generate passwords. The auto-passwords are 32 characters long and contain letters (both upper and lower cases), numbers, and special characters. 
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set sub-user’s password to login to the console. If you have not set up password rules, the default rules are: 1. have to be at least 8 characters long; 2. must contain at least one lower case letter, one upper case letter, one digit, and one special characters. This value is valid only when the sub-user is allowed to use console. If no value is specified, and console login is allowed, the system will automatically generate passwords. The auto-passwords are 32 characters long and contain letters (both upper and lower cases), numbers, and special characters. 
     * @param Password Sub-user’s password to login to the console. If you have not set up password rules, the default rules are: 1. have to be at least 8 characters long; 2. must contain at least one lower case letter, one upper case letter, one digit, and one special characters. This value is valid only when the sub-user is allowed to use console. If no value is specified, and console login is allowed, the system will automatically generate passwords. The auto-passwords are 32 characters long and contain letters (both upper and lower cases), numbers, and special characters. 
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Obtain whether sub-users need to reset passwords to re-login to the console. 0: No; 1: Yes.
     * @return NeedResetPassword Whether sub-users need to reset passwords to re-login to the console. 0: No; 1: Yes.
     */
    public Long getNeedResetPassword() {
        return this.NeedResetPassword;
    }

    /**
     * Configure whether sub-users need to reset passwords to re-login to the console. 0: No; 1: Yes.
     * @param NeedResetPassword Whether sub-users need to reset passwords to re-login to the console. 0: No; 1: Yes.
     */
    public void setNeedResetPassword(Long NeedResetPassword) {
        this.NeedResetPassword = NeedResetPassword;
    }

    /**
     * Obtain mobile number 
     * @return PhoneNum mobile number
     */
    public String getPhoneNum() {
        return this.PhoneNum;
    }

    /**
     * Set mobile number
     * @param PhoneNum set mobile phone number.
     */
    public void setPhoneNum(String PhoneNum) {
        this.PhoneNum = PhoneNum;
    }

    /**
     * Obtain area code
     * @return CountryCode area code
     */
    public String getCountryCode() {
        return this.CountryCode;
    }

    /**
     * Set area code
     * @param CountryCode area code
     */
    public void setCountryCode(String CountryCode) {
        this.CountryCode = CountryCode;
    }

    /**
     * Obtain email
     * @return Email email
     */
    public String getEmail() {
        return this.Email;
    }

    /**
     * Configure Emailbox
     * @param Email mailbox
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    /**
     * For internal use only.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "ConsoleLogin", this.ConsoleLogin);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "NeedResetPassword", this.NeedResetPassword);
        this.setParamSimple(map, prefix + "PhoneNum", this.PhoneNum);
        this.setParamSimple(map, prefix + "CountryCode", this.CountryCode);
        this.setParamSimple(map, prefix + "Email", this.Email);

    }
}

