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

public class OffsiteFlag extends AbstractModel{

    /**
    * Verification identifier
    */
    @SerializedName("VerifyFlag")
    @Expose
    private Long VerifyFlag;

    /**
    * Phone notification
    */
    @SerializedName("NotifyPhone")
    @Expose
    private Long NotifyPhone;

    /**
    * Email notification
    */
    @SerializedName("NotifyEmail")
    @Expose
    private Long NotifyEmail;

    /**
    * WeChat notification
    */
    @SerializedName("NotifyWechat")
    @Expose
    private Long NotifyWechat;

    /**
    * 
    */
    @SerializedName("Tips")
    @Expose
    private Long Tips;

    /**
     * Get Verification identifier 
     * @return VerifyFlag Verification identifier
     */
    public Long getVerifyFlag() {
        return this.VerifyFlag;
    }

    /**
     * Set Verification identifier
     * @param VerifyFlag Verification identifier
     */
    public void setVerifyFlag(Long VerifyFlag) {
        this.VerifyFlag = VerifyFlag;
    }

    /**
     * Get Phone notification 
     * @return NotifyPhone Phone notification
     */
    public Long getNotifyPhone() {
        return this.NotifyPhone;
    }

    /**
     * Set Phone notification
     * @param NotifyPhone Phone notification
     */
    public void setNotifyPhone(Long NotifyPhone) {
        this.NotifyPhone = NotifyPhone;
    }

    /**
     * Get Email notification 
     * @return NotifyEmail Email notification
     */
    public Long getNotifyEmail() {
        return this.NotifyEmail;
    }

    /**
     * Set Email notification
     * @param NotifyEmail Email notification
     */
    public void setNotifyEmail(Long NotifyEmail) {
        this.NotifyEmail = NotifyEmail;
    }

    /**
     * Get WeChat notification 
     * @return NotifyWechat WeChat notification
     */
    public Long getNotifyWechat() {
        return this.NotifyWechat;
    }

    /**
     * Set WeChat notification
     * @param NotifyWechat WeChat notification
     */
    public void setNotifyWechat(Long NotifyWechat) {
        this.NotifyWechat = NotifyWechat;
    }

    /**
     * Get  
     * @return Tips 
     */
    public Long getTips() {
        return this.Tips;
    }

    /**
     * Set 
     * @param Tips 
     */
    public void setTips(Long Tips) {
        this.Tips = Tips;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VerifyFlag", this.VerifyFlag);
        this.setParamSimple(map, prefix + "NotifyPhone", this.NotifyPhone);
        this.setParamSimple(map, prefix + "NotifyEmail", this.NotifyEmail);
        this.setParamSimple(map, prefix + "NotifyWechat", this.NotifyWechat);
        this.setParamSimple(map, prefix + "Tips", this.Tips);

    }
}

