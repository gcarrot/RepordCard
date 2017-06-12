package si.gcarrot.repordcard;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

/**
 * Created by Urban on 6/7/17.
 */

public class Tab1Fragment extends Fragment {
    public Tab1Fragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tab1, container, false);

        ReportCard reportCard = new ReportCard("John Doe", "Udacity", "8752104", 100, 100, 100, 100, 100);
        reportCard.setEnglishMark(76);
        reportCard.setMathMark(68);
        reportCard.setProgrammingMark(86);
        reportCard.setGameDesignMark(59);
        reportCard.setSocialMark(64);

        TextView tvName = (TextView) rootView.findViewById(R.id.tvName);
        tvName.setText(reportCard.getStudentName());

        TextView tvUniversity = (TextView) rootView.findViewById(R.id.tvUniversity);
        tvUniversity.setText("School: "+reportCard.getSchoolName());

        TextView tvRollNumber = (TextView) rootView.findViewById(R.id.tvRollNumber);
        tvRollNumber.setText("Roll number: " + reportCard.getRollNumber());

        GradeList adapter = new GradeList(rootView.getContext(), reportCard.getArrayList());

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}
