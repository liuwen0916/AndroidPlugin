package com.android.apf.pkg;

public class PkgSource {
    /**
     * Plugin package from host app assets
     */
    public static final int PKG_ASSET = 0;
    /**
     * Plugin package from external storage
     */
    public static final int PKG_STORAGE = 1;
    /**
     * Use android installed package as plugin
     */
    public static final int PKG_ANDROID_INSTALLED = 2;
    public static final int PKG_NETWORK = 3;
    /**
     * Plugin package has installed by apf
     */
    public static final int PKG_APF_INSTALLED = 4;
}
