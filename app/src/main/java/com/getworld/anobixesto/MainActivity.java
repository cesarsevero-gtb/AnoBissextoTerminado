package com.getworld.anobixesto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    private TextInputEditText editInputAno;
    private TextView textResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editInputAno = findViewById(R.id.textInputAno);
        textResultado = findViewById(R.id.textResultado);

    }


    public void saberAnoBixesto(View view){

        //recuperar valor digitado
        String textAno = editInputAno.getText().toString();

        //validar campos digitados
        Boolean camposValidados  = validarCampos(textAno);

        if(camposValidados){

            //converta string para numeros
            Double valorAno = Double.parseDouble(textAno);

            if(
                    (valorAno%4==0 && valorAno%100!=0) ||
                            (valorAno%4==0 && valorAno%400==0)){

                textResultado.setText("Esse Ano é Bixesto");

            }else{
                textResultado.setText("Este Ano não é Bixesto");
            }




        }else {
            textResultado.setText("Preencha os campos Primeiro!");

        }



    }


    //validar campos digitados atravez do true or false
    public Boolean validarCampos(String vAno){
        //começa como true
        Boolean camposValidados = true;

        if(vAno == null || vAno.equals("")){
            camposValidados = false;


        }

        return camposValidados;

    }

}