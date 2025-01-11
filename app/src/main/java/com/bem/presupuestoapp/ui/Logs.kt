package com.bem.presupuestoapp.ui

import android.util.Log
import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.LifecycleOwner

class AppLifecycleObserver : DefaultLifecycleObserver {
    override fun onCreate(owner: LifecycleOwner) {
        Log.d("LifecycleEvent", "App opened: onCreate called")
    }

    override fun onStart(owner: LifecycleOwner) {
        Log.d("LifecycleEvent", "App restored: onStart called")
    }

    override fun onResume(owner: LifecycleOwner) {
        Log.d("LifecycleEvent", "App resumed: onResume called")
    }

    override fun onPause(owner: LifecycleOwner) {
        Log.d("LifecycleEvent", "App minimized or screen rotated: onPause called")
    }

    override fun onStop(owner: LifecycleOwner) {
        Log.d("LifecycleEvent", "App stopped: onStop called")
    }

    override fun onDestroy(owner: LifecycleOwner) {
        Log.d("LifecycleEvent", "App closed: onDestroy called")
    }
}