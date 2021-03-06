/**
 * Tencent is pleased to support the open source community by making Tars available.
 *
 * Copyright (C) 2016 THL A29 Limited, a Tencent company. All rights reserved.
 *
 * Licensed under the BSD 3-Clause License (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * https://opensource.org/licenses/BSD-3-Clause
 *
 * Unless required by applicable law or agreed to in writing, software distributed
 * under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
// **********************************************************************
// This file was generated by a TARS parser!
// TARS version 1.0.1.
// **********************************************************************

package com.qq.tars.support.notify.prx;

import com.qq.tars.common.support.Holder;
import com.qq.tars.protocol.annotation.Servant;
import com.qq.tars.protocol.tars.annotation.TarsContext;
import com.qq.tars.protocol.tars.annotation.TarsHolder;

import java.util.concurrent.CompletableFuture;

@Servant
public interface NotifyPrx {

    public void reportServer(String sServerName, String sThreadId, String sMessage);
    CompletableFuture<Void> promise_reportServer(String sServerName, String sThreadId, String sMessage);

    public void reportServer(String sServerName, String sThreadId, String sMessage, @TarsContext java.util.Map<String, String> ctx);

    public void notifyServer(String sServerName, int level, String sMessage);

    CompletableFuture<Void> promise_notifyServer(String sServerName, int level, String sMessage);

    public void notifyServer(String sServerName, int level, String sMessage, @TarsContext java.util.Map<String, String> ctx);

    public int getNotifyInfo(NotifyKey stKey, @TarsHolder Holder<NotifyInfo> stInfo);

    public int getNotifyInfo(NotifyKey stKey, @TarsHolder Holder<NotifyInfo> stInfo, @TarsContext java.util.Map<String, String> ctx);

    public void reportNotifyInfo(ReportInfo info);

    public void reportNotifyInfo(ReportInfo info, @TarsContext java.util.Map<String, String> ctx);
}
