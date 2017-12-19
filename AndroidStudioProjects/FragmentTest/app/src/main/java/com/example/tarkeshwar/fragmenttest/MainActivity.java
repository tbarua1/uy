package com.example.tarkeshwar.fragmenttest;


import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {
    private Button btn1, btn2;
    private FragmentManager fragmentManager;
    private Fragment fragment;
    private FragmentTransaction fragmentTransaction;
    FragmentTransaction replace;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = (Button) findViewById(R.id.change_fragment1);
        btn2 = (Button) findViewById(R.id.change_fragment2);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentTransaction = getFragmentManager().beginTransaction();
                replace = fragmentTransaction.replace(R.id.fragment_place, new FirstFragment());
                fragmentTransaction.commit();

            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentTransaction = getFragmentManager().beginTransaction();
                replace = fragmentTransaction.replace(R.id.fragment_place, new SecondFragment());
                fragmentTransaction.commit();

            }
        });

    }

   /* @Override
   fragmentTransaction=getFragmentManager().beginTransaction();

			System.out.println("Fragment Object Creaated");
			fragmentTransaction.add(R.id.frag1, new Fragment1());
			System.out.println("Fragment Set Done");
			fragmentTransaction.commit();
			System.out.println("Fragment Committed");

    public void onClick(View v) {
        switch (v.getId()){
            case R.id.change_fragment1:
                fragment=new FirstFragment();
                fragmentManager =getFragmentManager();
               fragmentTransaction = fragmentManager.beginTransaction();
                FragmentTransaction replace = fragmentTransaction.replace(R.id.fragment_place, fragment);
                fragmentTransaction.commit();

                break;
            case R.id.change_fragment2:
                fragment=new SecondFragment();
                fragmentManager =getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
             replace = fragmentTransaction.replace(R.id.fragment_place, new FirstFragment());
                fragmentTransaction.commit();
                break;
        }
    }*/
   /* public void changeFragment(View v){
        Fragment fragment;
        switch (v.getId()){
            case R.id.change_fragment1:
                break;
            case R.id.change_fragment2:
                break;
        }
    }*/
}
