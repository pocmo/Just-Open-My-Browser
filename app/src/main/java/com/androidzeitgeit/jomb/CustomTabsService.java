package com.androidzeitgeit.jomb;

import android.app.Service;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.customtabs.ICustomTabsCallback;
import android.support.customtabs.ICustomTabsService;

import java.util.List;

public class CustomTabsService extends Service {
    @Override
    public IBinder onBind(Intent intent) {
        return new ICustomTabsService.Stub() {
            @Override
            public boolean warmup(long flags) throws RemoteException {
                return true;
            }

            @Override
            public boolean newSession(ICustomTabsCallback callback) throws RemoteException {
                return true;
            }

            @Override
            public boolean mayLaunchUrl(ICustomTabsCallback callback, Uri url, Bundle extras, List<Bundle> otherLikelyBundles) throws RemoteException {
                return true;
            }

            @Override
            public Bundle extraCommand(String s, Bundle bundle) throws RemoteException {
                return null;
            }

            @Override
            public boolean updateVisuals(ICustomTabsCallback callback, Bundle bundle) throws RemoteException {
                return false;
            }
        };
    }
}
