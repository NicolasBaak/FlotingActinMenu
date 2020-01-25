package nicolas.aplicaionuno.flotingactinmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.getbase.floatingactionbutton.FloatingActionButton;
import com.getbase.floatingactionbutton.FloatingActionsMenu;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FloatingActionButton floatingActionButton = findViewById(R.id.action1);

        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            showToat("fan 1");
            }
        });



        FloatingActionButton floatingActionButton2 = findViewById(R.id.action2);

        floatingActionButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToat("Esto es un boton");
            }
        });
    }

    public void showToat(String message){
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
