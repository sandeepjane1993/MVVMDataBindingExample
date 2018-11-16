package com.example.sande.mvvmdatabindingexample.view;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;

import com.example.sande.mvvmdatabindingexample.R;
import com.example.sande.mvvmdatabindingexample.databinding.ActivityMainBinding;
import com.example.sande.mvvmdatabindingexample.viewmodel.MyViewModel;

import butterknife.BindView;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {



    Activity activity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        ActivityMainBinding mainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main);

        activity = this;
        MyViewModel viewModel = new MyViewModel(activity);
        mainBinding.setVModel(viewModel);



    }


}
