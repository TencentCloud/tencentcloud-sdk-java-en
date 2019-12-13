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
package com.tencentcloudapi.batch.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Docker extends AbstractModel{

    /**
    * Docker Hub username or Tencent Registry username
    */
    @SerializedName("User")
    @Expose
    private String User;

    /**
    * Docker Hub password or Tencent Registry password
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * For Docker Hub, enter "[user/repo]:[tag]"; for Tencent Registry, enter "ccr.ccs.tencentyun.com/[namespace/repo]:[tag]"
    */
    @SerializedName("Image")
    @Expose
    private String Image;

    /**
    * For Docker Hub, this can be left blank, but please ensure public network access is present. For Tencent Registry, the server address is "ccr.ccs.tencentyun.com"
    */
    @SerializedName("Server")
    @Expose
    private String Server;

    /**
     * Get Docker Hub username or Tencent Registry username 
     * @return User Docker Hub username or Tencent Registry username
     */
    public String getUser() {
        return this.User;
    }

    /**
     * Set Docker Hub username or Tencent Registry username
     * @param User Docker Hub username or Tencent Registry username
     */
    public void setUser(String User) {
        this.User = User;
    }

    /**
     * Get Docker Hub password or Tencent Registry password 
     * @return Password Docker Hub password or Tencent Registry password
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set Docker Hub password or Tencent Registry password
     * @param Password Docker Hub password or Tencent Registry password
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get For Docker Hub, enter "[user/repo]:[tag]"; for Tencent Registry, enter "ccr.ccs.tencentyun.com/[namespace/repo]:[tag]" 
     * @return Image For Docker Hub, enter "[user/repo]:[tag]"; for Tencent Registry, enter "ccr.ccs.tencentyun.com/[namespace/repo]:[tag]"
     */
    public String getImage() {
        return this.Image;
    }

    /**
     * Set For Docker Hub, enter "[user/repo]:[tag]"; for Tencent Registry, enter "ccr.ccs.tencentyun.com/[namespace/repo]:[tag]"
     * @param Image For Docker Hub, enter "[user/repo]:[tag]"; for Tencent Registry, enter "ccr.ccs.tencentyun.com/[namespace/repo]:[tag]"
     */
    public void setImage(String Image) {
        this.Image = Image;
    }

    /**
     * Get For Docker Hub, this can be left blank, but please ensure public network access is present. For Tencent Registry, the server address is "ccr.ccs.tencentyun.com" 
     * @return Server For Docker Hub, this can be left blank, but please ensure public network access is present. For Tencent Registry, the server address is "ccr.ccs.tencentyun.com"
     */
    public String getServer() {
        return this.Server;
    }

    /**
     * Set For Docker Hub, this can be left blank, but please ensure public network access is present. For Tencent Registry, the server address is "ccr.ccs.tencentyun.com"
     * @param Server For Docker Hub, this can be left blank, but please ensure public network access is present. For Tencent Registry, the server address is "ccr.ccs.tencentyun.com"
     */
    public void setServer(String Server) {
        this.Server = Server;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "User", this.User);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "Image", this.Image);
        this.setParamSimple(map, prefix + "Server", this.Server);

    }
}

