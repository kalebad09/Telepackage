package com.kaleb.Telepackage;

import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.material.tabs.TabLayout;
import com.kaleb.Telepackage.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Convertpackage#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Convertpackage extends Fragment {
    TabLayout tabLayout;
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Convertpackage() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Tab1Fragment.
     */
    // TODO: Rename and change types and number of parameters
    public static Convertpackage newInstance(String param1, String param2) {
        Convertpackage fragment = new Convertpackage();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root=inflater.inflate(R.layout.fragment_tab1, container, false);
        tabLayout = root.findViewById(R.id.tabLayoutfixed);
        confiureTabLayout();
        return root;   }
    private void confiureTabLayout() {
        tabLayout.addTab(tabLayout.newTab().setText("daily"));
        tabLayout.addTab(tabLayout.newTab().setText("weekly"));
        tabLayout.addTab(tabLayout.newTab().setText("monthly"));
        tabLayout.addTab(tabLayout.newTab().setText("night"));
        FragmentManager manager = getChildFragmentManager();
        final FragmentTransaction transaction = manager.beginTransaction();
        final Fragment sample = new Tab4Fragment();
        transaction.replace(R.id.container, sample);
        transaction.addToBackStack(null);
        transaction.commit();
        //tabLayout.addTab(tabLayout.newTab().setText("Fresh Graduate"));
//       tabLayout.addTab(tabLayout.newTab().setText("Scholarship").setIcon(R.drawable.scholarship));
        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabReselected(TabLayout.Tab tab) {
               /* int tabi = ContextCompat.getColor(getBaseContext(), R.color.colorPrimary);
                if (tabLayout.getTabAt(0).isSelected()) {
                    int tabi = ContextCompat.getColor(getBaseContext(), R.color.colorPrimary);
                    tabLayout.getTabAt(0).getIcon().setColorFilter(tabi, PorterDuff.Mode.SRC_IN);
                }
                if (!tabLayout.getTabAt(1).isSelected()) {

                    tabLayout.getTabAt(1).getIcon().setColorFilter(tabi, PorterDuff.Mode.SRC_IN);
                }*/

                /*switch (tab.getPosition()) {
                    case 0:
                        Fragment sample = new daily();
                        transaction.replace(R.id.container, sample);
                        transaction.addToBackStack(null);
                        transaction.commit();
                    case 1:
                        Fragment sample2 = new Tab2Fragment();
                         transaction.replace(R.id.container, sample2);
                        transaction.addToBackStack(null);
                        transaction.commit();
                        break;
                    case 2:
                        Fragment sample3 = new Tab3Fragment();
                        transaction.replace(R.id.container, sample3);
                        transaction.addToBackStack(null);
                        transaction.commit();
                        break;
                    case 3:
                        Fragment sample4 = new Tab4Fragment();
                        transaction.replace(R.id.container, sample4);
                        transaction.addToBackStack(null);
                        transaction.commit();
                        break;
                   /* case 4:
                        tab.getIcon().setColorFilter(tabi, PorterDuff.Mode.SRC_IN);
                        break;
                } */ }
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                FragmentManager manager = getChildFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                switch (tab.getPosition()) {
                    case 0:
                        Fragment sample = new Tab4Fragment();
                        transaction.replace(R.id.container, sample);
                        transaction.addToBackStack(null);
                        transaction.commit();
                        break;
                    case 1:
                        Fragment sample2 = new daily();
                        transaction.replace(R.id.container, sample2);
                        transaction.addToBackStack(null);
                        transaction.commit();
                        break;
                    case 2:
                        Fragment sample3 = new Tab4Fragment();
                        transaction.replace(R.id.container, sample3);
                        transaction.addToBackStack(null);
                        transaction.commit();
                        break;
                    case 3:
                        Fragment sample4 = new Tab4Fragment();
                        transaction.replace(R.id.container, sample4);
                        transaction.addToBackStack(null);
                        transaction.commit();
                        break;
                   /* case 4:
                        tab.getIcon().setColorFilter(tabi, PorterDuff.Mode.SRC_IN);
                        break;*/
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {


            }


        });
    }
}