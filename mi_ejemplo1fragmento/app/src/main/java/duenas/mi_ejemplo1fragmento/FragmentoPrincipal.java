package duenas.mi_ejemplo1fragmento;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by JUAN on 28/01/2018.
 */

public class FragmentoPrincipal extends Fragment {
    public FragmentoPrincipal() {
    }
    public static FragmentoPrincipal newInstance(Bundle bundle){

        FragmentoPrincipal fragmentoPrincipal =new FragmentoPrincipal();
        fragmentoPrincipal.setArguments(bundle);
        return fragmentoPrincipal;
    }

    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
    }
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View root=inflater.inflate(R.layout.fragmento_principal,container,false);
        return root;



    }
}
