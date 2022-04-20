package com.fazpass.fazpassotp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.fazpass.fazpassotp.view.MainView;
import com.fazpass.fazpassotp.view.ValidationView;

/**
 * Created by Anvarisy on 4/20/2022.
 * fazpass
 * anvarisy@fazpass.com
 */
public class FazpassOtp extends AppCompatActivity {
    public FazpassOtp() {
        super(R.layout.activity_fazpass_otp);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .setReorderingAllowed(true)
                    .add(R.id.fragFazpassOtpRoot, ValidationView.class, null)
                    .commit();
        }
//        setContentView(R.layout.activity_fazpass_otp);
    }
}