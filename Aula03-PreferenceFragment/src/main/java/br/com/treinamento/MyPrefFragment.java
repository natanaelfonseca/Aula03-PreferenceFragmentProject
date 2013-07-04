package br.com.treinamento;

import android.os.Bundle;
import android.preference.PreferenceFragment;

/**
 * Created by natanaelfonseca on 11/06/13.
 */
public class MyPrefFragment extends PreferenceFragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        //Essa linha passa o xml localizado na pasta res/xml para que seja inflado

        addPreferencesFromResource( R.xml.preferences );

    }
}
