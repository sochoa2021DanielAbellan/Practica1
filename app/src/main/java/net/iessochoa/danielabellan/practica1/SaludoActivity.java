package net.iessochoa.danielabellan.practica1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SaludoActivity extends AppCompatActivity {

    public static final String NOMBRE_EXTRA = "SaludoActivity.NOMBRE";
    TextView tvSaludo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saludo);

        tvSaludo = findViewById(R.id.tvSaludo);
        String nombreASaludar = getIntent().getStringExtra(NOMBRE_EXTRA);
        tvSaludo.setText("Hola " + nombreASaludar);
    }
}