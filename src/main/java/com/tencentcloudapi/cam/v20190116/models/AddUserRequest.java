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

public class AddUserRequest  extends AbstractModel{

    /**
    * Sub-user’s Username
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Notes on Sub-users
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
    * Whether or not to generate keys for sub-users. 0: No; 1: Yes.
    */
    @SerializedName("UseApi")
    @Expose
    private Long UseApi;

    /**
    * Sub-user’s password to login to the console. This value only valid when the sub-user is allowed to use console. If you’ve not set up password rules, the default rules are: Your password 1. has to be at least 6 characters long; 2. must contain at least one lower case letter, one upper case letter, one digit, and one special characters. If no value is specified, the system will automatically generate passwords. The auto-passwords are 32 characters long and contain letters (both upper and lower cases), numbers, and special characters. 
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
    * Mobile Phone Number
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
     * Getting Sub-user’s Username
     * @return Name Sub-user’s Username
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Configuring Sub-user’s Username
     * @param Name Sub-user’s Username
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Getting Notes on Sub-users
     * @return Remark Notes on Sub-users
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Configuring Notes on Sub-users
     * @param Remark Notes on Sub-users
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
     * Whether or not the sub-user is allowed to log in to the console. 0: No; 1: Yes.
     * @param ConsoleLogin Whether or not the sub-user is allowed to log in to the console. 0: No; 1: Yes.
     */
    public void setConsoleLogin(Long ConsoleLogin) {
        this.ConsoleLogin = ConsoleLogin;
    }

    /**
     * Whether or not to generate keys for sub-users. 0: No; 1: Yes.
     * @return UseApi Whether or not to generate keys for sub-users. 0: No; 1: Yes.
     */
    public Long getUseApi() {
        return this.UseApi;
    }

    /**
     * Configure the setting: Whether or not to generate keys for sub-users. 0: No; 1: Yes.
     * @param UseApi Whether or not to generate keys for sub-users. 0: No; 1: Yes.
     */
    public void setUseApi(Long UseApi) {
        this.UseApi = UseApi;
    }

    /**
     * Getting sub-user’s password for logging into the console. This value only valid when the sub-user is allowed to use console. If you’ve not set up password rules, the default rules are: Your password 1. has to be at least 6 characters long; 2. must contain at least one lower case letter, one upper case letter, one digit, and one special characters. If no value is specified, the system will automatically generate passwords. The auto-passwords are 32 characters long and contain letters (both upper and lower cases), numbers, and special characters. 
     * @return Password Sub-user’s password to login to the console. This value only valid when the sub-user is allowed to use console. If you’ve not set up password rules, the default rules are: Your password 1. has to be at least 6 characters long; 2. must contain at least one lower case letter, one upper case letter, one digit, and one special characters. If no value is specified, the system will automatically generate passwords. The auto-passwords are 32 characters long and contain letters (both upper and lower cases), numbers, and special characters. 
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Creating a password for sub-user to login to the console. This value only valid when the sub-user is allowed to use console. If you’ve not set up password rules, the default rules are: Your password 1. has to be at least 6 characters long; 2. must contain at least one lower case letter, one upper case letter, one digit, and one special characters. If no value is specified, the system will automatically generate passwords. The auto-passwords are 32 characters long and contain letters (both upper and lower cases), numbers, and special characters. 
     * Sub-user’s password to login to the console. This value only valid when the sub-user is allowed to use console. If you’ve not set up password rules, the default rules are: Your password 1. has to be at least 6 characters long; 2. must contain at least one lower case letter, one upper case letter, one digit, and one special characters. If no value is specified, the system will automatically generate passwords. The auto-passwords are 32 characters long and contain letters (both upper and lower cases), numbers, and special characters. 
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Information about whether sub-users need to reset passwords to re-login to the console. 0: No; 1: Yes.
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
     * Getting Mobile Phone Number
     * @return PhoneNum Mobile Phone Number
     */
    public String getPhoneNum() {
        return this.PhoneNum;
    }

    /**
     * Configuring Mobile Phone Number
     * @param PhoneNum mobile number
     */
    public void setPhoneNum(String PhoneNum) {
        this.PhoneNum = PhoneNum;
    }

    /**
     * Getting Country/Area Code
     * @return CountryCode Country/Area Code
     */
    public String getCountryCode() {
        return this.CountryCode;
    }

    /**
     * Country/Area Code
     * @param CountryCode Country/Area Code
     */
    public void setCountryCode(String CountryCode) {
        this.CountryCode = CountryCode;
    }

    /**
     * Getting Email Address
     * @return Email Address
     */
    public String getEmail() {
        return this.Email;
    }

    /**
     * Configuring Mailbox
     * @param Email Mailbox
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
        this.setParamSimple(map, prefix + "UseApi", this.UseApi);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "NeedResetPassword", this.NeedResetPassword);
        this.setParamSimple(map, prefix + "PhoneNum", this.PhoneNum);
        this.setParamSimple(map, prefix + "CountryCode", this.CountryCode);
        this.setParamSimple(map, prefix + "Email", this.Email);

    }
}

