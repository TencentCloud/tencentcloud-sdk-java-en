/*
 * Copyright (c) 2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package com.tencentcloudapi.common.profile;

public class HttpProfile {
	
	public static final String REQ_HTTPS = "https://";
	
	public static final String REQ_HTTP = "http://";
	
    public static final String REQ_POST = "POST";
    
    public static final String REQ_GET = "GET";
    
    public static final int TM_MINUTE = 60;
	
	private String reqMethod;
	
	private String endpoint;
	
	private String protocol;
	
	private int readTimeout;
	
	private int writeTimeout;
	
	private int connTimeout;
	
	
	public HttpProfile() {
		this.reqMethod = HttpProfile.REQ_POST;
		this.endpoint = null;
		this.protocol = HttpProfile.REQ_HTTPS;
		this.readTimeout = 0;
		this.writeTimeout = 0;
		this.connTimeout = HttpProfile.TM_MINUTE;
	}
	
	public void setReqMethod(String reqMethod) {
		this.reqMethod = reqMethod;
	}
	
	public void setEndpoint(String endpoint) {
		this.endpoint = endpoint;
	}
	
	public void setReadTimeout(int readTimeout) {
		this.readTimeout = readTimeout;
	}
	
	public void setWriteTimeout(int writeTimeout) {
		this.writeTimeout = writeTimeout;
	}
	
	public void setConnTimeout(int connTimeout) {
		this.connTimeout = connTimeout;
	}
	
	public void setProtocol(String protocol) {
		this.protocol = protocol;
	}
	
	public String getReqMethod() {
		return this.reqMethod;
	}
	
	public String getEndpoint() {
		return this.endpoint;
	}
	
	public int getReadTimeout() {
		return this.readTimeout;
	}
	
	public int getWriteTimeout() {
		return this.writeTimeout;
	}
	
	public int getConnTimeout() {
		return this.connTimeout;
	}
	
	public String getProtocol() {
		return this.protocol;
	}
}
