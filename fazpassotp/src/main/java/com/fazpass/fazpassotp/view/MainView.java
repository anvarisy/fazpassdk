package com.fazpass.fazpassotp.view;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.fazpass.fazpassotp.R;

/**
 * Created by Anvarisy on 4/20/2022.
 * fazpass
 * anvarisy@fazpass.com
 */
public class MainView extends Fragment {
    public MainView() {
        super(R.layout.fragment_main_fazpass);
    }
    private Button sms, call, wa, email;
    private TextView register;
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        sms = view.findViewById(R.id.btnMainSms);
        sms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        call = view.findViewById(R.id.btnMainMisscall);
        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        wa = view.findViewById(R.id.btnMainWhatsapp);
        wa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        email = view.findViewById(R.id.btnMainEmail);
        email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                
            }
        });
        sms = view.findViewById(R.id.btnMainSms);
        register = view.findViewById(R.id.tvMainRegister);
    }
}
