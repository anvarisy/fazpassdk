package com.fazpass.fazpassdk;

import android.content.Intent;
import android.view.View;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.fazpass.fazpassotp.FazpassOtp;

import java.util.ArrayList;

/**
 * Created by Anvarisy on 4/20/2022.
 * fazpass
 * anvarisy@fazpass.com
 */
public class MainActivity extends AppCompatActivity {
    private RecyclerView rcvFazpassMenu;
    private ArrayList<String> fazpassMenu = new ArrayList<>();
    private MenuAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rcvFazpassMenu = findViewById(R.id.rcvFazpassMenu);
        fazpassMenu.add("FAZPASS OTP");
        fazpassMenu.add("FAZPASS PASSWORD LESS");
        fazpassMenu.add("FAZPASS COMING SOON");
        adapter = new MenuAdapter(fazpassMenu);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        rcvFazpassMenu.setLayoutManager(layoutManager);
        rcvFazpassMenu.setItemAnimator(new DefaultItemAnimator());
        rcvFazpassMenu.setAdapter(adapter);
        rcvFazpassMenu.addOnItemTouchListener(new RecyclerViewHelper(this, rcvFazpassMenu, new RecyclerViewHelper.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                switch (position){
                    case 0:
                       Intent intent = new Intent(MainActivity.this, FazpassOtp.class);
                       startActivity(intent);
                        break;
                    case 1:
                        Toast.makeText(MainActivity.this, "Fazpass Password less", Toast.LENGTH_SHORT).show();
                        break;
                    default:
                        Toast.makeText(MainActivity.this, "Coming soon", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onItemLongClick(View view, int position) {

            }
        }));
    }
}
