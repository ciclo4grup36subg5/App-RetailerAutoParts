package usa.sesion1.reto1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class Servicios extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_servicios);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setTitle("Servicios");
        getSupportActionBar().setSubtitle("Seleccionar Servicio");
        getSupportActionBar().setLogo(R.mipmap.ic_retailer);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menudeopcionesservicios, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){

        int id = item.getItemId();

        if(id == R.id.vistaBienvenida){
            Intent bienvenida = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(bienvenida);
        }

        if(id == R.id.vista1){
            Intent productos = new Intent(getApplicationContext(), Productos.class);
            startActivity(productos);
        }
        if(id == R.id.vista3){
            Intent sucursales = new Intent(getApplicationContext(), Sucursales.class);
            startActivity(sucursales);

        }
        return super.onOptionsItemSelected(item);
    }
}