package com.cita.irrigationsystem.irrigationsystem;

import android.app.Activity;
import android.app.Fragment;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;


/**
 * A simple {@link android.support.v4.app.Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link ClimateInfoFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link ClimateInfoFragment#newInstance} factory method to
 * create an instance of this fragment.
 *
 */
public class ClimateInfoFragment extends Fragment{
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;



    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ClimateInfoFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ClimateInfoFragment newInstance(String param1, String param2) {
        ClimateInfoFragment fragment = new ClimateInfoFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }
    public ClimateInfoFragment() {
        // Required empty public constructor
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
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        String[] texts = {
                getString(R.string.humidity),
                getString(R.string.temperature),
                getString(R.string.windSpeed),
                getString(R.string.solarRadiation)
        };
        String[] values = {
                getString(R.string.humidityLevel),
                getString(R.string.temperatureLevel),
                getString(R.string.windSpeedLevel),
                getString(R.string.solarRadiationLevel)
        };
        int[] imgIds = {
                R.drawable.img_humidity,
                R.drawable.img_temperature,
                R.drawable.img_wind_speed,
                R.drawable.img_radiation
        };

        ClimaticData climaticData = new ClimaticData(getActivity().getBaseContext(), texts, values, imgIds);

        View rootView = inflater.inflate(R.layout.fragment_climate_info, container, false);

        GridView grid = (GridView) rootView.findViewById(R.id.climaticInfoGV);

        grid.setAdapter(climaticData);

        // Inflate the layout for this fragment
        return rootView;
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onClimateFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            mListener = (OnFragmentInteractionListener) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString()
                    + " must implement OnFragmentInteractionListener");
        }
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
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        public void onClimateFragmentInteraction(Uri uri);
    }

}
