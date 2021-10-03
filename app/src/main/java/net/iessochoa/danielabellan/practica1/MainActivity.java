package net.iessochoa.danielabellan.practica1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText etNombre;
    private Button btnAceptar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNombre = findViewById(R.id.etNombre);
        btnAceptar = findViewById(R.id.btnAceptar);

        btnAceptar.setOnClickListener( view -> {
            Intent intent = new Intent(MainActivity.this, SaludoActivity.class);
            intent.putExtra(SaludoActivity.NOMBRE_EXTRA, etNombre.getText().toString());
            startActivity(intent);
        });

    }
}