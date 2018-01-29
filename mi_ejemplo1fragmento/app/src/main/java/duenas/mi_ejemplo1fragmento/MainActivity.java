package duenas.mi_ejemplo1fragmento;


import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clear);
        FragmentoPrincipal fragmentoPrincipal= FragmentoPrincipal.newInstance();
        FragmentTransaction ft=getSupportFragmentManager().beginTransaction();
        ft.add(R.id.body,fragmentoPrincipal);
        ft.commit();

    }
}
