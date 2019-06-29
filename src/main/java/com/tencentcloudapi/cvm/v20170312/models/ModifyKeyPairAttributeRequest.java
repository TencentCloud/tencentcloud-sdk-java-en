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

public class ModifyKeyPairAttributeRequest  extends AbstractModel{

    /**
    * Key pair ID, Key pair ID,  such as `skey-xxxxxxxx`.<br><br>You can obtain the available key ID by either of the following ways: <br><li>Find SSH key pair ID by log in to the [CVM Console](https://console.cloud.tencent.com/cvm/sshkey).<br><li>Obtain the `KeyId` field value in the returned result by calling [DescribeKeyPairs](https://intl.cloud.tencent.com/document/api/213/15715).
    */
    @SerializedName("KeyId")
    @Expose
    private String KeyId;

    /**
    * Modified name of key pair, which can consist of numbers, letters, and underscores, with a length of not more than 25 characters.
    */
    @SerializedName("KeyName")
    @Expose
    private String KeyName;

    /**
    * Modified description of key pair. This can be arbitrarily specified, but cannot exceed 60 characters.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Key pair ID, Key pair ID,  such as `skey-xxxxxxxx`.<br><br>You can obtain the available key ID by either of the following ways: <br><li>Query  key ID by logging in to the [CVM Console](https://console.cloud.tencent.com/cvm/sshkey).<br><li>Obtain the `KeyId` field value in the returned result by calling [DescribeKeyPairs](https://intl.cloud.tencent.com/document/api/213/9403).
     * @return KeyId Key pair ID, such as`skey-xxxxxxxx`<br><br>You can obtain the available key ID by either of the following ways: <br><li>Query key ID by logging in to the [CVM Console](https://console.cloud.tencent.com/cvm/sshkey).<br><li>Obtain the `KeyId` field value in the returned result by calling [DescribeKeyPairs](https://intl.cloud.tencent.com/document/api/213/9403).
     */
    public String getKeyId() {
        return this.KeyId;
    }

    /**
     * Setting Key Pair ID,such as:`skey-xxxxxxxx`<br><br>You can obtain the available key ID by either of the following ways:<br><li>Find  key pair ID by logging in to the [CVM Console](https://console.cloud.tencent.com/cvm/sshkey).<br><li>Obtain the `KeyId` field value in the returned result by calling [DescribeImages](https://intl.cloud.tencent.com/document/api/213/9403).
     * @param KeyId Key pair ID, such as:`skey-xxxxxxxx`。<br><br>You can obtain the available key ID by either of the following ways:<br><li>Find  key ID by logging in to the [CVM Console](https://console.cloud.tencent.com/cvm/sshkey).<br><li>Obtain the `KeyId` field value in the returned result by calling [DescribeKeyPairs](https://intl.cloud.tencent.com/document/api/213/9403).
     */
    public void setKeyId(String KeyId) {
        this.KeyId = KeyId;
    }

    /**
     * Getting the modified name of key pair, which can consist of numbers, letters, and underscores, with a length of not more than 25 characters.
     * @return KeyName Modified name of key pair, which can consist of numbers, letters, and underscores, with a length of not more than 25 characters. |
     */
    public String getKeyName() {
        return this.KeyName;
    }

    /**
     * Setting the modified name of key pair, which can consist of numbers, letters, and underscores, with a length of not more than 25 characters.
     * @param KeyName modified name of key pair, which can consist of numbers, letters, and underscores, with a length of not more than 25 characters. |
     */
    public void setKeyName(String KeyName) {
        this.KeyName = KeyName;
    }

    /**
     * Getting the modified description of key pair. This can be arbitrarily specified, but cannot exceed 60 characters.
     * @return Description modified description of key pair. This can be arbitrarily specified, but cannot exceed 60 characters. |
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Setting the modified name of key pair, which can consist of numbers, letters, and underscores, with a length of not more than 60 characters.
     * @param Description modified description of key pair. This can be arbitrarily specified, but cannot exceed 60 characters. |
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * For internal use only.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "KeyId", this.KeyId);
        this.setParamSimple(map, prefix + "KeyName", this.KeyName);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

