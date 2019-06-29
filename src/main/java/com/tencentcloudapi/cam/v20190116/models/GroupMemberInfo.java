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

public class GroupMemberInfo  extends AbstractModel{

    /**
    * Sub-user UID
    */
    @SerializedName("Uid")
    @Expose
    private Long Uid;

    /**
    * Sub-user UIN
    */
    @SerializedName("Uin")
    @Expose
    private Long Uin;

    /**
    * Sub-user name.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Mobile number
    */
    @SerializedName("PhoneNum")
    @Expose
    private String PhoneNum;

    /**
    * Mobile number area code.
    */
    @SerializedName("CountryCode")
    @Expose
    private String CountryCode;

    /**
    * Whether mobile number is verified.
    */
    @SerializedName("PhoneFlag")
    @Expose
    private Long PhoneFlag;

    /**
    * Email
    */
    @SerializedName("Email")
    @Expose
    private String Email;

    /**
    * If email has been verified.
    */
    @SerializedName("EmailFlag")
    @Expose
    private Long EmailFlag;

    /**
    * User type.
    */
    @SerializedName("UserType")
    @Expose
    private Long UserType;

    /**
    * Creation time.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * If it is the main message receiver.
    */
    @SerializedName("IsReceiverOwner")
    @Expose
    private Long IsReceiverOwner;

    /**
     * Obtain sub-user Uid.
     * @return Uid sub-user Uid.
     */
    public Long getUid() {
        return this.Uid;
    }

    /**
     * Set sub-user Uid.
     * @param Uid sub-user Uid.
     */
    public void setUid(Long Uid) {
        this.Uid = Uid;
    }

    /**
     * Obtain sub-user Uin.
     * @return Uin sub-user Uin.
     */
    public Long getUin() {
        return this.Uin;
    }

    /**
     * Set sub-user Uin.
     * @param Uin sub-user Uin.
     */
    public void setUin(Long Uin) {
        this.Uin = Uin;
    }

    /**
     * Obtain sub-user name.
     * @return Name sub-user name.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set sub-user name.
     * @param Name sub-user name.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Obtain mobile number 
     * @return PhoneNum return cell phone number.
     */
    public String getPhoneNum() {
        return this.PhoneNum;
    }

    /**
     * Set mobile number
     * @param PhoneNum set cell phone number.
     */
    public void setPhoneNum(String PhoneNum) {
        this.PhoneNum = PhoneNum;
    }

    /**
     * Obtain mobile number area code.
     * @return CountryCode mobile number area code.
     */
    public String getCountryCode() {
        return this.CountryCode;
    }

    /**
     * Set obile phone area code.
     * @param CountryCode mobile phone area code.
     */
    public void setCountryCode(String CountryCode) {
        this.CountryCode = CountryCode;
    }

    /**
     * Get whether mobile number has been verified.
     * @return PhoneFlag whether mobile number has been verified.
     */
    public Long getPhoneFlag() {
        return this.PhoneFlag;
    }

    /**
     * Set whether mobile number has been verified.
     * @param PhoneFlag whether mobile number has been verified.
     */
    public void setPhoneFlag(Long PhoneFlag) {
        this.PhoneFlag = PhoneFlag;
    }

    /**
     * Obtain email address.
     * @return Email address
     */
    public String getEmail() {
        return this.Email;
    }

    /**
     * Set email address.
     * @param Email email address.
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    /**
     * Obtain wether email has been verified.
     * @return EmailFlag whether email has been verified.
     */
    public Long getEmailFlag() {
        return this.EmailFlag;
    }

    /**
     * Set whether email has been verified.
     * @param EmailFlag whether email has been verified.
     */
    public void setEmailFlag(Long EmailFlag) {
        this.EmailFlag = EmailFlag;
    }

    /**
     * Obtain user type.
     * @return UserType.
     */
    public Long getUserType() {
        return this.UserType;
    }

    /**
     * Set user type.
     * @param UserType user type.
     */
    public void setUserType(Long UserType) {
        this.UserType = UserType;
    }

    /**
     * Obtain creation time.
     * @return CreateTime return creation time.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set creation time.
     * @param CreateTime creation time.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Obtain whether it is main message receiver.
     * @return IsReceiverOwner whether it is the main message receiver.
     */
    public Long getIsReceiverOwner() {
        return this.IsReceiverOwner;
    }

    /**
     * Set whether it is the main message receiver.
     * @param IsReceiverOwner whether it is the main message receiver.
     */
    public void setIsReceiverOwner(Long IsReceiverOwner) {
        this.IsReceiverOwner = IsReceiverOwner;
    }

    /**
     * For internal use only.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Uid", this.Uid);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "PhoneNum", this.PhoneNum);
        this.setParamSimple(map, prefix + "CountryCode", this.CountryCode);
        this.setParamSimple(map, prefix + "PhoneFlag", this.PhoneFlag);
        this.setParamSimple(map, prefix + "Email", this.Email);
        this.setParamSimple(map, prefix + "EmailFlag", this.EmailFlag);
        this.setParamSimple(map, prefix + "UserType", this.UserType);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "IsReceiverOwner", this.IsReceiverOwner);

    }
}

