package usa.sesion1.reto1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class Sucursales extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sucursales);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setTitle("Sucursales");
        getSupportActionBar().setSubtitle("Seleccionar Sucursal");
        getSupportActionBar().setLogo(R.mipmap.ic_retailer);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menudeopcionessucursales, menu);
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

        if(id == R.id.vista2){
            Intent servicios = new Intent(getApplicationContext(), Servicios.class);
            startActivity(servicios);
        }

        return super.onOptionsItemSelected(item);
    }
}