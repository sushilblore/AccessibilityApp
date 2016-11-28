package com.android.avast.avastpayapp.onboarding;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.android.avast.avastpayapp.R;
import com.android.avast.avastpayapp.services.AvastPayService;
import com.android.avast.avastpayapp.utils.Utils;


public class OnBoardingActivity extends AppCompatActivity {

    private Button mActivate_Button;
    private Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mContext = OnBoardingActivity.this;
        setContentView(R.layout.activity_on_boarding);

        mActivate_Button = (Button) findViewById(R.id.activate_button);
        if(Utils.isAccessibilityEnabled(mContext)) {
            mActivate_Button.setVisibility(View.GONE);
        }
        else {
            mActivate_Button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Utils.openAccessibilitySettings(mContext);
                }
            });
        }

        startAccessibilityService();
    }

    private void startAccessibilityService() {
        startService(new Intent(getApplication(), AvastPayService.class));
    }
}
