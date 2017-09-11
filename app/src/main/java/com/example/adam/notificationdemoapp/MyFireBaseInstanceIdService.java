package com.example.adam.notificationdemoapp;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

/**
 * Created by Adam on 9/9/2017.
 */

public class MyFireBaseInstanceIdService extends FirebaseInstanceIdService {
    private static final String registrationToken = "REG_TOKEN";

    @Override
    public void onTokenRefresh() {
        String recentToken = FirebaseInstanceId.getInstance().getToken();
        Log.d(registrationToken, recentToken);

    }
}
