package com.example.marco.appcheckbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
     private EditText edt1, edt2;
     private CheckBox cbsum, cbres;
     private TextView tvresultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edt1 = (EditText)findViewById(R.id.edt1);
        edt2 = (EditText)findViewById(R.id.edt2);
        cbsum = (CheckBox)findViewById(R.id.cbsum);
        cbres = (CheckBox)findViewById(R.id.cbres);
        tvresultado = (TextView)findViewById(R.id.tvresultado);
    }
    public void calcular (View v){
        String n1 = edt1.getText().toString();
        String n2 = edt2.getText().toString();

        int num1 = Integer.parseInt(n1);
        int num2 = Integer.parseInt(n2);
        String resultado = "";

        if (n1.isEmpty()){
            Toast.makeText(this,"Existen campos vacios", Toast.LENGTH_SHORT).show();
        }else if (n2.isEmpty()){
            Toast.makeText(this,"Existen campos vacios", Toast.LENGTH_SHORT).show();
        }if(cbsum.isChecked()==true){
            int suma = num1+num2;
            resultado = "La suma es: "+suma+" / ";

        }if (cbres.isChecked()==true){
            int resta = num1-num2;
            resultado = resultado+" La resta es: "+resta;
        }
        tvresultado.setText(resultado);
    }

}
