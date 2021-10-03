package net.iessochoa.danielabellan.practica1;

import android.content.Intent;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.time.LocalDateTime;

public class MainActivity extends AppCompatActivity {

    private EditText etNombre;
    private Button btnAceptar;
    private Button btnHora;
    private TextView tvMiNombre;

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNombre = findViewById(R.id.etNombre);
        btnAceptar = findViewById(R.id.btnAceptar);
        btnHora = findViewById(R.id.btnHora);
        tvMiNombre = findViewById(R.id.minombre);

        int horas = LocalDateTime.now().getHour();
        int minutos = LocalDateTime.now().getMinute();
        int segundos = LocalDateTime.now().getMinute();

        btnAceptar.setOnClickListener( view -> {
            Intent intent = new Intent(MainActivity.this, SaludoActivity.class);
            intent.putExtra(SaludoActivity.NOMBRE_EXTRA, etNombre.getText().toString());
            startActivity(intent);
        });

        btnHora.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, HoraActivity.class);
            intent.putExtra(HoraActivity.HORA_EXTRA, horas);
            intent.putExtra(HoraActivity.MINUTOS_EXTRA, minutos);
            intent.putExtra(HoraActivity.SEGUNDOS_EXTRA, segundos);
            intent.putExtra(HoraActivity.NOMBRE_EXTRA, tvMiNombre.getText());
            startActivity(intent);
        });

    }
}