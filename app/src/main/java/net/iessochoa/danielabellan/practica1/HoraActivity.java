package net.iessochoa.danielabellan.practica1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class HoraActivity extends AppCompatActivity {


    public static final String HORA_EXTRA = "HoraActivity.HORA_EXTRA";
    public static final String MINUTOS_EXTRA = "HoraActivity.MINUTOS_EXTRA";
    public static final String SEGUNDOS_EXTRA = "HoraActivity.SEGUNDOS_EXTRA";
    public static final String NOMBRE_EXTRA = "HoraActivity.NOMBRE_EXTRA";
    TextView tvMensajeDeHora;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hora);

        tvMensajeDeHora = findViewById(R.id.tvMensajeDeHora);
        int hora = getIntent().getIntExtra(HORA_EXTRA, 0);
        int minutos = getIntent().getIntExtra(MINUTOS_EXTRA, 0);
        int segundos = getIntent().getIntExtra(SEGUNDOS_EXTRA, 0);
        String nombre = getIntent().getStringExtra(NOMBRE_EXTRA);
        String recursoHora = getResources().getString(R.string.horaConFormato);
        String recursoHoraConDatos = String.format(recursoHora, hora, minutos, segundos, nombre);
        tvMensajeDeHora.setText(recursoHoraConDatos);

    }
}