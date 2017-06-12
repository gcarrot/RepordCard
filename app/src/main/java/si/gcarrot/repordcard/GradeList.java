package si.gcarrot.repordcard;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Urban on 6/10/17.
 */

public class GradeList extends ArrayAdapter<Grade> {

    public GradeList(Context context, ArrayList<Grade> pWords) {
        super(context, 0, pWords);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        Grade local_word = getItem(position);
        TextView tvClass = (TextView) listItemView.findViewById(R.id.tvClass);
        tvClass.setText(local_word.getClassName());
        TextView tvGrade = (TextView) listItemView.findViewById(R.id.tvGrade);
        tvGrade.setText(local_word.getClassGrade());

        if (local_word.getClassName() == "Grade") {
            tvClass.setTextSize(22);
            tvGrade.setTextSize(26);
        }

        return listItemView;
    }
}
