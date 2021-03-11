package com.sh1.holamundo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    EditText editField1;
    EditText editField2;
    EditText editResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editField1 = findViewById(R.id.txtField1);
        editField2 = findViewById(R.id.txtField2);
        editResult = findViewById(R.id.txtResult);
    }
    public void Suma(View view){
        double field1 = Double.parseDouble(editField1.getText().toString());
        double field2 = Double.parseDouble(editField2.getText().toString());
        double result = field1 + field2;
        String txtResult = String.valueOf(result);
        editResult.setText(txtResult);
    }
    public void Resta(View view){
        double field1 = Double.parseDouble(editField1.getText().toString());
        double field2 = Double.parseDouble(editField2.getText().toString());
        double result = field1 - field2;
        String txtResult = String.valueOf(result);
        editResult.setText(txtResult);
    }
    public void  Multiplicar(View view){
        double field1 = Double.parseDouble(editField1.getText().toString());
        double field2 = Double.parseDouble(editField2.getText().toString());
        double result = field1 * field2;
        String txtResult = String.valueOf(result);
        editResult.setText(txtResult);
    }
    public void Division(View view){
        double field1 = Double.parseDouble(editField1.getText().toString());
        double field2 = Double.parseDouble(editField2.getText().toString());
        double result = field1 / field2;
        String txtResult = String.valueOf(result);
        editResult.setText(txtResult);
    }
    public void Limpiar(View view){
        editField1.setText("");
        editField2.setText("");
        editResult.setText("");
    }


}
