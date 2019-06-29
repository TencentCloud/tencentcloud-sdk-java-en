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

public class KeyPair  extends AbstractModel{

    /**
    * Key pair `ID` is the unique identifier of key pair and cannot be modified.
    */
    @SerializedName("KeyId")
    @Expose
    private String KeyId;

    /**
    * Key pair name.
    */
    @SerializedName("KeyName")
    @Expose
    private String KeyName;

    /**
    * `ID` of the project to which a key pair belongs.
    */
    @SerializedName("ProjectId")
    @Expose
    private Integer ProjectId;

    /**
    * Key pair description.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * The public key (in plain text) of the key pair.
    */
    @SerializedName("PublicKey")
    @Expose
    private String PublicKey;

    /**
    * The private key (in plain text) of the key pair. Tencent Cloud will not retain user's private key. Please keep it well.
    */
    @SerializedName("PrivateKey")
    @Expose
    private String PrivateKey;

    /**
    * The list of `ID` of instances associated with the key.
    */
    @SerializedName("AssociatedInstanceIds")
    @Expose
    private String [] AssociatedInstanceIds;

    /**
    * Creation time, which is displayed in a format that conforms to the `ISO8601` standard, and `UTC` time is used. Format is `YYYY-MM-DDThh:mm:ssZ`.
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
     * Get key pair `ID` is the unique identifier of key pair and cannot be modified.
     * @return KeyId Key pair `ID` is the unique identifier of key pair and cannot be modified.
     */
    public String getKeyId() {
        return this.KeyId;
    }

    /**
     * Set key pair `ID` is the unique identifier of key pair and cannot be modified.
     * @param KeyId Key pair `ID` is the unique identifier of key pair and cannot be modified.
     */
    public void setKeyId(String KeyId) {
        this.KeyId = KeyId;
    }

    /**
     * Get key pair name.
     * @return KeyName key pair name.
     */
    public String getKeyName() {
        return this.KeyName;
    }

    /**
     * Set key pair name.
     * @param KeyName key pair name.
     */
    public void setKeyName(String KeyName) {
        this.KeyName = KeyName;
    }

    /**
     * Get `ID` of the project to which a key pair belongs.
     * @return ProjectId `ID` of the project to which a key pair belongs.
     */
    public Integer getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set `ID` of the project to which a key pair belongs.
     * @param ProjectId ID of the project belongs.
     */
    public void setProjectId(Integer ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get projectId ID of the project belongs.
     * @return Description projectId ID of the project belongs.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set projectId ID of the project belongs.
     * @param Description projectId ID of the project belongs.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get the public key (in plain text) of the key pair.
     * @return PublicKey the public key (in plain text) of the key pair.
     */
    public String getPublicKey() {
        return this.PublicKey;
    }

    /**
     * Set the public key (in plain text) of the key pair.
     * @param PublicKey The public key (in plain text) of the key pair.
     */
    public void setPublicKey(String PublicKey) {
        this.PublicKey = PublicKey;
    }

    /**
     * Get the private key (in plain text) of the key pair. Tencent Cloud will not retain user's private key. Please keep it well.
     * @return PrivateKey the private key (in plain text) of the key pair. Tencent Cloud will not retain user's private key. Please keep it well.
     */
    public String getPrivateKey() {
        return this.PrivateKey;
    }

    /**
     * Set the private key (in plain text) of the key pair. Tencent Cloud will not retain user's private key. Please keep it well.
     * @param PrivateKey the private key (in plain text) of the key pair. Tencent Cloud will not retain user's private key. Please keep it well.
     */
    public void setPrivateKey(String PrivateKey) {
        this.PrivateKey = PrivateKey;
    }

    /**
     * Get the list of `IDs` of instances associated with the key.
     * @return AssociatedInstanceIds the list of `IDs` of instances associated with the key.
     */
    public String [] getAssociatedInstanceIds() {
        return this.AssociatedInstanceIds;
    }

    /**
     * Set the list of `IDs` of instances associated with the key.
     * @param AssociatedInstanceIds the list of `IDs` of instances associated with the key.
     */
    public void setAssociatedInstanceIds(String [] AssociatedInstanceIds) {
        this.AssociatedInstanceIds = AssociatedInstanceIds;
    }

    /**
     * Set creation time, which is displayed in a format that conforms to the `ISO8601` standard, and `UTC` time is used. Format is `YYYY-MM-DDThh:mm:ssZ`.
     * @return CreatedTime creation time, which is displayed in a format that conforms to the `ISO8601` standard, and `UTC` time is used. Format is `YYYY-MM-DDThh:mm:ssZ`.
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set creation time, which is displayed in a format that conforms to the `ISO8601` standard, and `UTC` time is used. Format is `YYYY-MM-DDThh:mm:ssZ`.
     * @param CreatedTime creation time, which is displayed in a format that conforms to the `ISO8601` standard, and `UTC` time is used. Format is `YYYY-MM-DDThh:mm:ssZ`.
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Internal implementation, reserved from use 
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "KeyId", this.KeyId);
        this.setParamSimple(map, prefix + "KeyName", this.KeyName);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "PublicKey", this.PublicKey);
        this.setParamSimple(map, prefix + "PrivateKey", this.PrivateKey);
        this.setParamArraySimple(map, prefix + "AssociatedInstanceIds.", this.AssociatedInstanceIds);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);

    }
}

