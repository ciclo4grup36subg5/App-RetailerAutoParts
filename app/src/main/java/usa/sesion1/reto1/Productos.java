package usa.sesion1.reto1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Productos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_productos);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setTitle("Productos");
        getSupportActionBar().setSubtitle("Seleccionar Producto");
        getSupportActionBar().setLogo(R.mipmap.ic_retailer);
        getSupportActionBar().setDisplayUseLogoEnabled(true);

        Button btnDiscoFreno = (Button) findViewById(R.id.btnDiscoFreno);
        Button btnLlanta = (Button) findViewById(R.id.btnLlanta);
        Button btnSuspension = (Button) findViewById(R.id.btnSuspension);
        Button btnMotor = (Button) findViewById(R.id.btnMotor);
        Button btnPastillas = (Button) findViewById(R.id.btnPastillas);
        Button btnLuces = (Button) findViewById(R.id.btnLuces);

        btnDiscoFreno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Funcionalidad en construccion futura",Toast.LENGTH_SHORT).show();

            }
        });

        btnLlanta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Funcionalidad en construccion futura",Toast.LENGTH_SHORT).show();

            }
        });

        btnSuspension.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Funcionalidad en construccion futura",Toast.LENGTH_SHORT).show();

            }
        });

        btnMotor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Funcionalidad en construccion futura",Toast.LENGTH_SHORT).show();

            }
        });

        btnPastillas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Funcionalidad en construccion futura",Toast.LENGTH_SHORT).show();

            }
        });

        btnLuces.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Funcionalidad en construccion futura",Toast.LENGTH_SHORT).show();

            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menudeopcionesproductos, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){

        int id = item.getItemId();

        if(id == R.id.vistaBienvenida){
            Intent bienvenida = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(bienvenida);
        }
        if(id == R.id.vista2){
            Intent servicios = new Intent(getApplicationContext(), Servicios.class);
            startActivity(servicios);
        }
        if(id == R.id.vista3){
            Intent sucursales = new Intent(getApplicationContext(), Sucursales.class);
            startActivity(sucursales);

        }
        return super.onOptionsItemSelected(item);
    }
}