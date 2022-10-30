package com.example.myhello1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editText;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.edit_text);

        textView = findViewById(R.id.text_view);

        Button button = findViewById(R.id.button);

        button.setOnClickListener( v-> {
            // エディットテキストのテキストを取得
            String text = editText.getText().toString();
            // 取得したテキストを TextView に張り付ける
            textView.setText(text + "さん、こんにちは");
        });
    }
}