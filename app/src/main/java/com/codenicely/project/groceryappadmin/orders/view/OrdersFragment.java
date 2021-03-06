package com.codenicely.project.groceryappadmin.orders.view;

import android.app.DatePickerDialog;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;
import android.widget.TextView;

import com.codenicely.project.groceryappadmin.R;

import java.util.Calendar;
import java.util.TimeZone;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link OrdersFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link OrdersFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class OrdersFragment extends Fragment implements DatePickerDialog.OnDateSetListener {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    //    @BindView(R.id.viewPager)
    private ViewPager viewpager;
    //    @BindView(R.id.tabLayout)
    private TabLayout tabLayout;

    private ViewPagerAdapter viewPagerAdapter;

    private OnFragmentInteractionListener mListener;

    public static String selected_date;
    DatePickerDialog datePickerDialog;
    @BindView(R.id.tv_selected_date)
    TextView tv_selected_date;
    Context context;

    public OrdersFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment OrdersFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static OrdersFragment newInstance(String param1, String param2) {
        OrdersFragment fragment = new OrdersFragment();
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
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_category_order, container, false);
        tabLayout = (TabLayout) view.findViewById(R.id.tabLayout);
        viewpager = (ViewPager) view.findViewById(R.id.viewPager);
        ButterKnife.bind(this,view);
        context = getContext();
        Calendar calendar = Calendar.getInstance(TimeZone.getDefault());

        tv_selected_date.setText(calendar.get(Calendar.DAY_OF_MONTH) + "/" + (calendar.get(Calendar.MONTH) + 1)
                + "/" + calendar.get(Calendar.YEAR));
        selected_date = tv_selected_date.getText().toString();

        tv_selected_date.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                datePickerDialog.show();
            }
        });
        datePickerDialog = new DatePickerDialog(
                context, OrdersFragment.this,
                calendar.get(Calendar.YEAR),calendar.get(Calendar.MONTH),calendar.get(Calendar.DATE));


        viewPagerAdapter = new ViewPagerAdapter(getActivity().getSupportFragmentManager());
        viewpager.setAdapter(viewPagerAdapter);
        tabLayout.setupWithViewPager(viewpager);
        viewpager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewpager.setCurrentItem(tab.getPosition());
                viewPagerAdapter.refreshFragment(tab.getPosition());

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        return view;
    }


    @Override
    public void onResume() {
        super.onResume();
    }


    @Override
    public void onStart() {
//        viewPagerAdapter.notifyDataSetChanged();

        super.onStart();
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onDateSet(DatePicker datePicker, int year, int month, int dayOfMonth) {
        tv_selected_date.setText(dayOfMonth+"/"+(month+1)+"/"+year);
        selected_date = tv_selected_date.getText().toString();
        viewPagerAdapter.notifyDataSetChanged();
    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p/>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }

/*    public void setFragment(Fragment fragment, String title) {
        if (fragment != null) {
            FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.home_layout, fragment);
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
            getActivity().getActionBar().setTitle("" + title);

        }

    }*/
}
