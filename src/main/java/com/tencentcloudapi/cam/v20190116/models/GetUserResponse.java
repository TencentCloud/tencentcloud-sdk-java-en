/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * you may not use this file except in compliance with the License.
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

public class GetUserResponse  extends AbstractModel{

    /**
    * Sub-user User ID
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
    * The unique ID of a request. Each request returns a unique ID. The RequestId is required to troubleshoot issues.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Obtain sub-user User ID
     * @return Uin Sub-user User ID
     */
    public Long getUin() {
        return this.Uin;
    }

    /**
     * Set up sub-user User ID
     * @param Uin Sub-user User ID
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
     * @return Uid Sub-user User ID
     */
    public Long getUid() {
        return this.Uid;
    }

    /**
     * Configuring Sub-user UID
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
     * @return ConsoleLogin whether sub-user can log in to Console
     */
    public Long getConsoleLogin() {
        return this.ConsoleLogin;
    }

    /**
     * Set whether sub-user can log in to the console
     * @param ConsoleLogin whether sub-user can log in to the console
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
     * @param PhoneNum mobile number
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
     * Configure mailbox
     * @param Email mailbox
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    /**
     * Obtain the unique ID of request, which will be returned for each request. and is required for each troubleshooting case.
     * @return RequestId unique ID of request, which will be returned for each request. The corresponding RequestId is required for troubleshooting.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set unique ID of request, which will be returned for each request. The corresponding RequestId is required for troubleshooting.
     * @param RequestId is the ID of the request. Each request returns a unique ID. The RequestId is required to troubleshoot issues.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
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
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

