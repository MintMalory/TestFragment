package ua.mintmalory.testfragment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.widget.Button;

public class MainActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Button removeBnt = (Button) findViewById(R.id.remove_btn);

         if(removeBnt!=null){
            removeBnt.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    FragmentManager fm = getSupportFragmentManager();
                    FragmentTransaction transaction = fm.beginTransaction();
                    Fragment myFrag = fm.findFragmentById(R.id.my_fragment);


                    transaction.remove(myFrag).commit();
             }
            });
        }
    }



}
