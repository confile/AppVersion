/*
    The MIT License (MIT)
    Copyright (c) 2014 Michael Gorski

*/

package org.michaelgorski.cordova;

import org.json.JSONArray;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;

public class AppVersion extends CordovaPlugin {

    public final String ACTION_GET_VERSION_NUMBER = "getVersionNumber";
    public final String ACTION_GET_BUILD_NUMBER = "getBuildNumber";

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) {
        boolean result = false;
        PackageManager packageManager = this.cordova.getActivity().getPackageManager();
        if(action.equals(ACTION_GET_VERSION_NUMBER)) {
            try {
                PackageInfo packageInfo = packageManager.getPackageInfo(this.cordova.getActivity().getPackageName(), 0);
                result = true;
                callbackContext.success(packageInfo.versionName); // release version number
            }
            catch (NameNotFoundException exception) {
                result = false;
                callbackContext.success(exception.getMessage());
            }
        }
        else if (action.equals(ACTION_GET_BUILD_NUMBER)) {
            try {
                PackageInfo packageInfo = packageManager.getPackageInfo(this.cordova.getActivity().getPackageName(), 0);
                result = true;
                callbackContext.success(packageInfo.versionCode); // build version number
            }
            catch (NameNotFoundException exception) {
                result = false;
                callbackContext.success(exception.getMessage());
            }
        }

        return result;
    }
}
