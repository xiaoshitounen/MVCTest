package swu.xl.mvctest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ControllerActivity extends AppCompatActivity {

    private TextView textView;
    private Button button;
    private NumModel numModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.tv_show);
        button = findViewById(R.id.btn_add);

        numModel = new NumModel();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numModel.add(ControllerActivity.this);
            }
        });
    }

    public void updateUI(String s) {
        textView.setText(s);
    }
}