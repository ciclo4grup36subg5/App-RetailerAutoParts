package usa.sesion1.reto1;

/**
 * App RetailerAutoParts
 * Creada por: Alvaro Arias
 * Fecha: Noviembre 27 de 2021
 */

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

/**
 * Clase Principal
 * Actividad Principal
 */
public class MainActivity extends AppCompatActivity {

    /**
     * Metodo sobreescrito onCreate()
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setTitle("App RetailerAutoParts");
        getSupportActionBar().setSubtitle("Seleccionar Menu");
        getSupportActionBar().setLogo(R.mipmap.ic_retailer);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
    }


    /**
     * Metodo Sobreescrito onCreateOptionsMenu()
     * @param menu
     * @return boolean "true"
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menudeopciones, menu);
        return true;
    }


    /**
     * Metodo sobreescrito onOptionsItemSelected()
     * @param item
     * @return super.onOptionsItemSelected(item)
     */
    @Override
    public boolean onOptionsItemSelected(MenuItem item){

        int id = item.getItemId();

        if(id == R.id.vista1){
            Intent productos = new Intent(getApplicationContext(), Productos.class);
            startActivity(productos);
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