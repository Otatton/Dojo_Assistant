package e.otatt.dojoassistant;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import e.otatt.dojoassistant.ui.main.MainFragment;

public class MainActivity extends AppCompatActivity {

    private FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
//        if (savedInstanceState == null) {
//            getSupportFragmentManager().beginTransaction()
//                    .replace(R.id.container, MainFragment.newInstance())
//                    .commitNow();
//    }

        loadFragments(new LoginScreen(), R.id.fragmentContainer1, "LS");




        }

    private void loadFragments(Fragment f, int fID, String tag){
        fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction().replace(fID, f, tag).commit();
    }


}
