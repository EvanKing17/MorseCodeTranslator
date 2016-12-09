package co.evanking.morsecodetranslator.Fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

import co.evanking.morsecodetranslator.R;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link CodeToWordsFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link CodeToWordsFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class CodeToWordsFragment extends Fragment {

    public CodeToWordsFragment() {
        // Required empty public constructor
    }


    public static CodeToWordsFragment newInstance() {
        return new CodeToWordsFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_code_to_words, container, false);


        /** Ad Stuff **/
        //My Ad Id
        MobileAds.initialize(getContext().getApplicationContext(), "ca-app-pub-8812015764280962~2493905131");
        AdView mAdview = (AdView) view.findViewById(R.id.codeToWordsAd);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdview.loadAd(adRequest);
        /** End Ad Stuff **/

        return view;
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
        void onFragmentInteraction(Uri uri);
    }
}
