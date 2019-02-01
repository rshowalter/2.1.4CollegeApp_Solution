package examples.pltw.org.collegeapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by wdumas on 4/8/16.
 */
public class FamilyMemberFragment extends Fragment {

    private TextView mFirstName;
    private EditText editFirstName;
    private TextView mLastName;
    private EditText editLastName;
    private FamilyMember mFamilyMember;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View rootView = inflater.inflate(R.layout.fragment_family_member, container, false);

        mFamilyMember = new FamilyMember();

        mLastName = (TextView) rootView.findViewById(R.id.lastName);
        mLastName.setText(mFamilyMember.getLastName());
        return rootView;

    }
}
