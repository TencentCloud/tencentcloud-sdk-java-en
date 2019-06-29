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
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyHostsAttributeRequest  extends AbstractModel{

    /**
    * ID(s) of one or more CDH instances you are working with.
    */
    @SerializedName("HostIds")
    @Expose
    private String [] HostIds;

    /**
    * Displayed name of CDH instance. You can specify any name you like, but its length should be limited to 60 characters.
    */
    @SerializedName("HostName")
    @Expose
    private String HostName;

    /**
    * Auto renewal flag. Supported values:<br><li>NOTIFY_AND_AUTO_RENEW：Notify expiry and renew automatically.<br><li>NOTIFY_AND_MANUAL_RENEW：Notify expiry but not renew automatically.<br><li>DISABLE_NOTIFY_AND_MANUAL_RENEW：Neither notify expiry nor renew automatically.<br><br>If this parameter is specified as NOTIFY_AND_AUTO_RENEW, the instance will be automatically renewed on a monthly basis when the account balance is sufficient.
    */
    @SerializedName("RenewFlag")
    @Expose
    private String RenewFlag;

    /**
     * Get ID(s) of one or more CDH instances you are working with.
     * @return HostIds ID(s) of one or more instances you are working with. 
     */
    public String [] getHostIds() {
        return this.HostIds;
    }

    /**
     * ID(s) of one or more CDH instances you are working with.
     * @param HostIds ID(s) of one or more CDH instance to be operated.
     */
    public void setHostIds(String [] HostIds) {
        this.HostIds = HostIds;
    }

    /**
     * Get displayed name of CDH instance. You can specify any name you like, but its length should be limited to 60 characters.
     * @return HostName Displayed name of CDH instance. You can specify any name you like, but its length should be limited to 60 characters.
     */
    public String getHostName() {
        return this.HostName;
    }

    /**
     * Set displayed name of CDH instance. You can specify any name you like, but its length should be limited to 60 characters.
     * @param HostName Displayed name of CDH instance. You can specify any name you like, but its length should be limited to 60 characters.
     */
    public void setHostName(String HostName) {
        this.HostName = HostName;
    }

    /**
     * Obtain the auto renewal flag. Supported values:<br><li>NOTIFY_AND_AUTO_RENEW：Notify expiry and renew automatically.<br><li>NOTIFY_AND_MANUAL_RENEW：Notify expiry but not renew automatically.<br><li>DISABLE_NOTIFY_AND_MANUAL_RENEW：Neither notify expiry nor renew automatically.<br><br>If this parameter is specified as NOTIFY_AND_AUTO_RENEW, the instance will be automatically renewed on a monthly basis when the account balance is sufficient.
     * @return RenewFlag Auto renewal flag. Supported values:<br><li>NOTIFY_AND_AUTO_RENEW：Notify expiry and renew automatically.<br><li>NOTIFY_AND_MANUAL_RENEW：Notify expiry but not renew automatically.<br><li>DISABLE_NOTIFY_AND_MANUAL_RENEW：Neither notify expiry nor renew automatically.<br><br>If this parameter is specified as NOTIFY_AND_AUTO_RENEW, the instance will be automatically renewed on a monthly basis when the account balance is sufficient.
     */
    public String getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Configure the auto renewal flag. Supported values:<br><li>NOTIFY_AND_AUTO_RENEW：Notify expiry and renew automatically.<br><li>NOTIFY_AND_MANUAL_RENEW：Notify expiry but not renew automatically.<br><li>DISABLE_NOTIFY_AND_MANUAL_RENEW：Neither notify expiry nor renew automatically.<br><br>If this parameter is specified as NOTIFY_AND_AUTO_RENEW, the instance will be automatically renewed on a monthly basis when the account balance is sufficient.
     * @param RenewFlag Auto renewal flag. Supported values:<br><li>NOTIFY_AND_AUTO_RENEW：Notify expiry and renew automatically.<br><li>NOTIFY_AND_MANUAL_RENEW：Notify expiry but not renew automatically.<br><li>DISABLE_NOTIFY_AND_MANUAL_RENEW：Neither notify expiry nor renew automatically.<br><br>If this parameter is specified as NOTIFY_AND_AUTO_RENEW, the instance will be automatically renewed on a monthly basis when the account balance is sufficient.
     */
    public void setRenewFlag(String RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    /**
     * Internally realized, users have no permission for it 
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "HostIds.", this.HostIds);
        this.setParamSimple(map, prefix + "HostName", this.HostName);
        this.setParamSimple(map, prefix + "RenewFlag", this.RenewFlag);

    }
}

