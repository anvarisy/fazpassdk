package tech.anvarisy.fazpassdk;

import android.view.MotionEvent;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

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
        rcvFazpassMenu.addOnItemTouchListener(new RecyclerView.OnItemTouchListener() {
            @Override
            public boolean onInterceptTouchEvent(@NonNull RecyclerView rv, @NonNull MotionEvent e) {
                return false;
            }

            @Override
            public void onTouchEvent(@NonNull RecyclerView rv, @NonNull MotionEvent e) {

            }

            @Override
            public void onRequestDisallowInterceptTouchEvent(boolean disallowIntercept) {

            }
        });
    }
}