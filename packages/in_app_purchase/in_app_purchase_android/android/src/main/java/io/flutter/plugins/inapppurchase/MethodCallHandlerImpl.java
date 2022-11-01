// Copyright 2013 The Flutter Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package io.flutter.plugins.inapppurchase;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Handles method channel for the plugin.
 */
class MethodCallHandlerImpl
        implements MethodChannel.MethodCallHandler, Application.ActivityLifecycleCallbacks {

    private static final String TAG = "InAppPurchasePlugin";
    private static final String LOAD_SKU_DOC_URL =
            "https://github.com/flutter/plugins/blob/master/packages/in_app_purchase/in_app_purchase/README.md#loading-products-for-sale";


    @Nullable
    private Activity activity;
    private final Context applicationContext;
    private final MethodChannel methodChannel;

    /**
     * Constructs the MethodCallHandlerImpl
     */
    MethodCallHandlerImpl(
            @Nullable Activity activity,
            @NonNull Context applicationContext,
            @NonNull MethodChannel methodChannel){
        this.applicationContext = applicationContext;
        this.activity = activity;
        this.methodChannel = methodChannel;
    }

    /**
     * Sets the activity. Should be called as soon as the the activity is available. When the activity
     * becomes unavailable, call this method again with {@code null}.
     */
    void setActivity(@Nullable Activity activity) {
        this.activity = activity;
    }

    @Override
    public void onActivityCreated(Activity activity, Bundle savedInstanceState) {
    }

    @Override
    public void onActivityStarted(Activity activity) {
    }

    @Override
    public void onActivityResumed(Activity activity) {
    }

    @Override
    public void onActivityPaused(Activity activity) {
    }

    @Override
    public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
    }

    @Override
    public void onActivityDestroyed(Activity activity) {
    }

    @Override
    public void onActivityStopped(Activity activity) {
    }

    void onDetachedFromActivity() {
    }

    @Override
    public void onMethodCall(MethodCall call, MethodChannel.Result result) {
        result.notImplemented();
    }
}
