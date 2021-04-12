package com.example.viewapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // устанавливаем в качестве интерфейса файл second_layout.xml
        setContentView (R.layout.second_layout);

        // получаем элемент textView
        TextView textView = (TextView) findViewById(R.id.header);
        // переустанавливаем у него текст
        textView.setText("Hello from Java!");

        /*// создание TextView
        TextView textView = new TextView(this);
        // установка текста в TextView
        textView.setText("Hello Android");
        // установка высоты текста
        textView.setTextSize (22);
        // установка визуального интерфейса для activity
        setContentView (textView);*/

    }
}

    /*ConstraintLayout constraintLayout = new ConstraintLayout(this);
    TextView textView = new TextView(this);
        textView.setText("Hello Android!");
                textView.setTextSize(26);
                // устанавливаем параметры размеров и расположение элемента
                ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams
                (ConstraintLayout.LayoutParams.WRAP_CONTENT, ConstraintLayout.LayoutParams.WRAP_CONTENT);
                // выравнивание по левому краю ConstraintLayout
                layoutParams.leftToLeft = ConstraintLayout.LayoutParams.PARENT_ID;
                // выравнивание по верхней границе ConstraintLayout
                layoutParams.topToTop = ConstraintLayout.LayoutParams.PARENT_ID;
                // устанавливаем параметры для textView
                textView.setLayoutParams(layoutParams);
                // добавляем TextView в ConstraintLayout
                constraintLayout.addView(textView);
                // в качестве корневого
                setContentView(constraintLayout);*/