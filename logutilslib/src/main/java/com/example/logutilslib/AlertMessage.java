package com.example.logutilslib;


import android.content.Context;
import android.content.DialogInterface;

import androidx.appcompat.app.AlertDialog;

public class AlertMessage {

    public String title;
    public String message;

    public AlertMessage(String title, String message) {
        this.title = title;
        this.message = message;
    }

    public void showAlert(Context con){
        new AlertDialog.Builder(con)
                .setTitle(title)
                .setMessage(message)
                .setPositiveButton("OKey", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
    }
}
