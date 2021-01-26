package com.pratik.rexomusicplayer.utils;

import android.content.Context;
import android.content.SharedPreferences;

import androidx.preference.PreferenceManager;

public class PrefManager {

    private static SharedPreferences mSharePPreference;

    public static void init(Context context) {
        mSharePPreference = PreferenceManager.getDefaultSharedPreferences(context);
    }

    public static void clearAll() {
        mSharePPreference.edit().clear().apply();
    }

    public static void saveToPref(Context context, String key, Object value) {
        SharedPreferences.Editor editor = mSharePPreference.edit();

        if (value instanceof Integer) {
            editor.putInt(key, (Integer) value);
        } else if (value instanceof String) {
            editor.putString(key, value.toString());
        } else if (value instanceof Boolean) {
            editor.putBoolean(key, (Boolean) value);
        } else if (value instanceof Long) {
            editor.putLong(key, (Long) value);
        } else if (value instanceof Float) {
            editor.putFloat(key, (Float) value);
        } else if (value instanceof Double) {
            editor.putLong(key, Double.doubleToRawLongBits((double) value));
        }
        editor.apply();
    }

    public static Object getFromPref(Context context, String key, Object defaultValue) {
        if (defaultValue instanceof String) {
            return mSharePPreference.getString(key, defaultValue.toString());
        } else if (defaultValue instanceof Integer) {
            return mSharePPreference.getInt(key, (Integer) defaultValue);
        } else if (defaultValue instanceof Boolean) {
            return mSharePPreference.getBoolean(key, (Boolean) defaultValue);
        } else if (defaultValue instanceof Long) {
            return mSharePPreference.getLong(key, (Long) defaultValue);
        } else if (defaultValue instanceof Float) {
            return mSharePPreference.getFloat(key, (Float) defaultValue);
        } else if (defaultValue instanceof Double) {
            return Double.longBitsToDouble(mSharePPreference.getLong(key, Double.doubleToLongBits((double) defaultValue)));
        }
        return defaultValue;
    }

}
