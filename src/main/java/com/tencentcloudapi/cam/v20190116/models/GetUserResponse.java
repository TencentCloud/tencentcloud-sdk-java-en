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

public class GetUserResponse extends AbstractModel{

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
    * Sub-user remarks
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * If sub-user can log in to the Console
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
    * Country/Area code
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
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Sub-user user ID 
     * @return Uin Sub-user user ID
     */
    public Long getUin() {
        return this.Uin;
    }

    /**
     * Set Sub-user user ID
     * @param Uin Sub-user user ID
     */
    public void setUin(Long Uin) {
        this.Uin = Uin;
    }

    /**
     * Get Sub-user username 
     * @return Name Sub-user username
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Sub-user username
     * @param Name Sub-user username
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Sub-user UID 
     * @return Uid Sub-user UID
     */
    public Long getUid() {
        return this.Uid;
    }

    /**
     * Set Sub-user UID
     * @param Uid Sub-user UID
     */
    public void setUid(Long Uid) {
        this.Uid = Uid;
    }

    /**
     * Get Sub-user remarks 
     * @return Remark Sub-user remarks
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set Sub-user remarks
     * @param Remark Sub-user remarks
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get If sub-user can log in to the Console 
     * @return ConsoleLogin If sub-user can log in to the Console
     */
    public Long getConsoleLogin() {
        return this.ConsoleLogin;
    }

    /**
     * Set If sub-user can log in to the Console
     * @param ConsoleLogin If sub-user can log in to the Console
     */
    public void setConsoleLogin(Long ConsoleLogin) {
        this.ConsoleLogin = ConsoleLogin;
    }

    /**
     * Get Mobile number 
     * @return PhoneNum Mobile number
     */
    public String getPhoneNum() {
        return this.PhoneNum;
    }

    /**
     * Set Mobile number
     * @param PhoneNum Mobile number
     */
    public void setPhoneNum(String PhoneNum) {
        this.PhoneNum = PhoneNum;
    }

    /**
     * Get Country/Area code 
     * @return CountryCode Country/Area code
     */
    public String getCountryCode() {
        return this.CountryCode;
    }

    /**
     * Set Country/Area code
     * @param CountryCode Country/Area code
     */
    public void setCountryCode(String CountryCode) {
        this.CountryCode = CountryCode;
    }

    /**
     * Get Email 
     * @return Email Email
     */
    public String getEmail() {
        return this.Email;
    }

    /**
     * Set Email
     * @param Email Email
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * Internal implementation, normal users should not use it.
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
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

