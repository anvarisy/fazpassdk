package com.fazpass.fazpassotp.view;

import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.InputType;
import android.text.TextWatcher;
import android.view.Gravity;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.fazpass.fazpassotp.R;
import com.fazpass.fazpassotp.configuration.OTP;

import java.util.ArrayList;

/**
 * Created by Anvarisy on 4/20/2022.
 * fazpass
 * anvarisy@fazpass.com
 */
public class ValidationView extends Fragment {
    private LinearLayout digitContainer;
    private EditText digit;
    public ValidationView() {
        super(R.layout.fragment_validation);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        digitContainer = view.findViewById(R.id.llValidationOtpDigit);
        ArrayList<Integer> idCollection = new ArrayList<>();
        for(int index=0;index< OTP.OTP_LENGTH;index++){
            digit = new EditText(getContext());
            idCollection.add(index);
            if (OTP.OTP_LENGTH > 6){
                digit.setWidth(60);
            }
           digit.setWidth(85);
            digit.setGravity(Gravity.CENTER);
            digit.setId(index);
            digit.setInputType(InputType.TYPE_CLASS_NUMBER);
            digit.setFilters(new InputFilter[] { new InputFilter.LengthFilter(1) });
            digit.setBackgroundResource(R.drawable.rectangle_grey_border);
            int finalIndex = index;
            digit.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                    EditText digitFocus =  view.findViewById(idCollection.get(0));
                    digitFocus.requestFocus();
                }

                @Override
                public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                    try {
                        EditText digitFocus =  view.findViewById(idCollection.get(finalIndex+1));
                        digitFocus.requestFocus();
                    }catch (Exception e){
                        Verify();
                    }

                }

                @Override
                public void afterTextChanged(Editable editable) {

                }
            });
            digitContainer.addView(digit);
        }
    }

    private void Verify(){
        System.out.println("Empty");
    }
}
