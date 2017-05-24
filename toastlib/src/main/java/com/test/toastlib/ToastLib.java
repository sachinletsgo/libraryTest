package com.test.toastlib;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by SachinTyagi on 5/24/17.
 */

public class ToastLib {

    public static void toastLib(Context context , String msg){
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();

    }
}
