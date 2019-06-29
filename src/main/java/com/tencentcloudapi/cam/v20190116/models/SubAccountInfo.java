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

public class SubAccountInfo  extends AbstractModel{

    /**
    * Sub-user user ID
    */
    @SerializedName("Uin")
    @Expose
    private Long Uin;

    /**
    * Sub-user username
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Sub-user UID
    */
    @SerializedName("Uid")
    @Expose
    private Long Uid;

    /**
    * Sub-user note
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * Whether sub-user can login to Console
    */
    @SerializedName("ConsoleLogin")
    @Expose
    private Long ConsoleLogin;

    /**
    * Mobile number
    */
    @SerializedName("PhoneNum")
    @Expose
    private String PhoneNum;

    /**
    * Area code
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
     * Obtain sub-user user ID
     * @return Uin sub-user user ID
     */
    public Long getUin() {
        return this.Uin;
    }

    /**
     * Set up sub-user user ID
     * @param Uin sub-user user ID
     */
    public void setUin(Long Uin) {
        this.Uin = Uin;
    }

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
     * Obtain sub-user UID
     * @return Uin sub-user ID
     */
    public Long getUid() {
        return this.Uid;
    }

    /**
     * Set sub-user UID
     * @param Uid sub-user UID
     */
    public void setUid(Long Uid) {
        this.Uid = Uid;
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
     * Get whether sub-user can log in to the console 
     * @return ConsoleLogin Whether the sub-user can log in to the Console
     */
    public Long getConsoleLogin() {
        return this.ConsoleLogin;
    }

    /**
     * Set whether sub-user can log in to Console
     * @param ConsoleLogin whether sub-user can log in to Console
     */
    public void setConsoleLogin(Long ConsoleLogin) {
        this.ConsoleLogin = ConsoleLogin;
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
     * Configure Mailbox
     * @param Email mailbox
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    /**
     * For internal use only.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Uid", this.Uid);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "ConsoleLogin", this.ConsoleLogin);
        this.setParamSimple(map, prefix + "PhoneNum", this.PhoneNum);
        this.setParamSimple(map, prefix + "CountryCode", this.CountryCode);
        this.setParamSimple(map, prefix + "Email", this.Email);

    }
}

