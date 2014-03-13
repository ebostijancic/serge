package org.bostijancic.android.serge;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import org.bostijancic.android.serge.jenkins.JenkinsHttpClient;
import org.bostijancic.android.serge.jenkins.model.Jenkins;

import static android.widget.ArrayAdapter.createFromResource;

public class SettingsActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {
            getFragmentManager().beginTransaction()
                    .add(R.id.container, new PlaceholderFragment())
                    .commit();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        return id == R.id.action_settings || super.onOptionsItemSelected(item);
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {

            final View view = inflater.inflate(R.layout.fragment_main, container, false);

            populateCiServerTypes(view);

            addTryLoginBehaviour(view);

            return view;
        }

        private void addTryLoginBehaviour(View view) {

            final Button tryLoginButton = (Button) view.findViewById(R.id.tryLogin);
            tryLoginButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    final JenkinsHttpClient httpClient = new JenkinsHttpClient();
                    final Jenkins jenkinsData = httpClient.getJenkinsData();

                    Log.d(getClass().getName(), jenkinsData.getJobs().toString());
                }
            });
        }

        /**
         * method used to populate the spinner with a list of available CI servers.
         *
         * @param view
         */
        private void populateCiServerTypes(final View view) {
            final Spinner selectServerType = (Spinner) view.findViewById(R.id.serverType);

            assert selectServerType != null;

            final ArrayAdapter<CharSequence> spinnerAdapter = createFromResource(getActivity(),
                                            R.array.ci_servers, android.R.layout.simple_spinner_item);

            spinnerAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            selectServerType.setAdapter(spinnerAdapter);
        }

    }

}
