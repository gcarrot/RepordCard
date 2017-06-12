package si.gcarrot.repordcard;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Urban on 6/7/17.
 */

public class Tab2Fragment extends Fragment {
    public Tab2Fragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tab2, container, false);

        TextView tvReport = (TextView) rootView.findViewById(R.id.tvReport);

        ReportCard reportCard = new ReportCard("John Doe", "Udacity", "8752104", 100, 100, 100, 100, 100);
        reportCard.setEnglishMark(76);
        reportCard.setMathMark(68);
        reportCard.setProgrammingMark(86);
        reportCard.setGameDesignMark(59);
        reportCard.setSocialMark(64);

        tvReport.setText(reportCard.displayInfo());

        return rootView;
    }
}
