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

public class AddUserResponse  extends AbstractModel{

    /**
    * Sub-user UID
    */
    @SerializedName("Uin")
    @Expose
    private Long Uin;

    /**
    * Sub-user’s Username
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Configuring Password: If the combination of input parameters indicates to automatically generate a random password, the generated password is returned.
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * Sub-user’s Key ID
    */
    @SerializedName("SecretId")
    @Expose
    private String SecretId;

    /**
    * Sub-user’s Key
    */
    @SerializedName("SecretKey")
    @Expose
    private String SecretKey;

    /**
    * Sub-user UID
    */
    @SerializedName("Uid")
    @Expose
    private Long Uid;

    /**
    * The ID of the request. Each request returns a unique ID. The RequestId is required to troubleshoot issues.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Getting Sub-user UIN
     * @return Uin Sub-user UIN
     */
    public Long getUin() {
        return this.Uin;
    }

    /**
     * Configuring Sub-user UIN
     * @param Uin Sub-user UIN
     */
    public void setUin(Long Uin) {
        this.Uin = Uin;
    }

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
     * Getting Password: If the combination of input parameters indicates to automatically generate a random password, the generated password is returned.
     * @return Password If the combination of input parameters indicates to automatically generate a random password, the generated password is returned.
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Configuring Password: If the combination of input parameters indicates to automatically generate a random password, the generated password is returned.
     * @param Password If the combination of input parameters indicates to automatically generate a random password, the generated password is returned.
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Getting Sub-user’s Key ID
     * @return SecretId Sub-user’s Key ID
     */
    public String getSecretId() {
        return this.SecretId;
    }

    /**
     * Configuring Sub-user’s Key ID
     * @param SecretId Sub-user’s Key ID
     */
    public void setSecretId(String SecretId) {
        this.SecretId = SecretId;
    }

    /**
     * Getting Sub-user’s Key
     * @return SecretKey Sub-user’s Key
     */
    public String getSecretKey() {
        return this.SecretKey;
    }

    /**
     * Configuring Sub-user’s Key
     * @param SecretKey Sub-user’s Key
     */
    public void setSecretKey(String SecretKey) {
        this.SecretKey = SecretKey;
    }

    /**
     * Getting Sub-user UID
     * @return Uid Sub-user UID
     */
    public Long getUid() {
        return this.Uid;
    }

    /**
     * Configuring Sub-user UID
     * @param Uid Sub-user UID
     */
    public void setUid(Long Uid) {
        this.Uid = Uid;
    }

    /**
     * The ID of the request. Each request returns a unique ID. The RequestId is required to troubleshoot issues.
     * @return RequestId The unique ID of a request. Each request returns a unique ID. The RequestId is required to troubleshoot issues.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Configure RequestId. RequestId is the ID of the request. Each request returns a unique ID. The RequestId is required to troubleshoot issues.
     * @param RequestId The ID of the request. Each request returns a unique ID. The RequestId is required to troubleshoot issues.
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
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "SecretId", this.SecretId);
        this.setParamSimple(map, prefix + "SecretKey", this.SecretKey);
        this.setParamSimple(map, prefix + "Uid", this.Uid);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

