package com.example.sande.mvvmdatabindingexample.viewmodel;

import android.content.Context;
import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.util.Log;
import android.view.View;
import android.widget.Toast;
import com.example.sande.mvvmdatabindingexample.BR;

import com.example.sande.mvvmdatabindingexample.model.UserPOJO;

public class MyViewModel extends BaseObservable {

    private UserPOJO userPOJO;
    private Context context;
    public MyViewModel(Context context) {

        this.context = context;
        this.userPOJO = new UserPOJO();
    }

    @Bindable
    public String getUserDetails()
    {
        return userPOJO.getUserName();
    }

    public void setUserDetails(String userName)
    {
        userPOJO.setUserName(userName);
        notifyPropertyChanged(BR.userDetails);
    }

    public View.OnClickListener buttonClick()
    {
        return new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "" + getUserDetails(), Toast.LENGTH_SHORT).show();
            }
        };
    }
}
