package com.outbell.basic;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class CustomAlertDialog {

    private Context context;
    private Dialog dialog ;

    private boolean dialogCancel = false ;
    private String title = "" , desc = "" , buttonOne = "" ,  buttonTwo = "" ;
    private TextView titleView , descView ;
    private Button buttonOneView , buttonTwoView ;

    public CustomAlertDialog(Context context) {
        this.context = context ;
        initDialog();
        initContentViews();
    }

    private void initDialog() {
        dialog = new Dialog(context);
        dialog.setContentView(R.layout.dialog_alert);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.setCancelable(dialogCancel);
        Window window = dialog.getWindow();
        window.setLayout(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
    }

    private void initContentViews() {
        titleView = dialog.findViewById(R.id.dialog_alert_textView_title);
        descView = dialog.findViewById(R.id.dialog_alert_textView_desc);
        buttonOneView = dialog.findViewById(R.id.dialog_alert_button_one);
        buttonTwoView = dialog.findViewById(R.id.dialog_alert_button_two);
    }

    public void show() {
        if(title.equals(""))  UiUtils.ChangeLayoutVisibility(titleView , View.GONE);
        if(desc.equals(""))  UiUtils.ChangeLayoutVisibility(descView , View.GONE);
        if(buttonOne.equals(""))  UiUtils.ChangeLayoutVisibility(buttonOneView , View.GONE);
        if(buttonTwo.equals(""))  UiUtils.ChangeLayoutVisibility(buttonTwoView , View.GONE);
        dialog.show();
    }

    public void dismiss() { if(dialog.isShowing() ) dialog.dismiss(); }

    public void setDialogCancel(boolean dialogCancel) {
        this.dialogCancel = dialogCancel;
    }

    public void setTitle(ViewSettings viewSettings) {
        this.title = (viewSettings.text.equals("")) ? ResUtils.GetStringSRC(context , viewSettings.textResID) : viewSettings.text ;
        showTitle(viewSettings);
    }

    private void showTitle(ViewSettings viewSettings) {
        titleView.setText(title);
        if(viewSettings.textSize != 0.0) titleView.setTextSize(viewSettings.textSize);
        if(viewSettings.typeface != null) titleView.setTypeface(viewSettings.typeface);
        titleView.setTextColor(context.getResources().getColor(viewSettings.textColor));
        titleView.setBackgroundResource(viewSettings.background);
        titleView.setGravity(viewSettings.textGravity);
    }

    public void setDesc(ViewSettings viewSettings) {
        this.desc = (viewSettings.text.equals("")) ? ResUtils.GetStringSRC(context , viewSettings.textResID) : viewSettings.text ;
        showDesc(viewSettings);
    }

    private void showDesc(ViewSettings viewSettings) {
        descView.setText(desc);
        if(viewSettings.textSize != 0.0) descView.setTextSize(viewSettings.textSize);
        if(viewSettings.typeface != null) descView.setTypeface(viewSettings.typeface);
        descView.setTextColor(context.getResources().getColor(viewSettings.textColor));
        descView.setBackgroundResource(viewSettings.background);
        descView.setGravity(viewSettings.textGravity);
    }

    public void setButtonPositive(ViewSettings viewSettings , View.OnClickListener onClickListener) {
        this.buttonOne = (viewSettings.text.equals("")) ? ResUtils.GetStringSRC(context , viewSettings.textResID) : viewSettings.text ;
        showPositiveButton(viewSettings , onClickListener);
    }

    private void showPositiveButton(ViewSettings viewSettings , View.OnClickListener onClickListener) {
        buttonOneView.setText(buttonOne);
        if(viewSettings.textSize != 0.0) buttonOneView.setTextSize(viewSettings.textSize);
        if(viewSettings.typeface != null) buttonOneView.setTypeface(viewSettings.typeface);
        buttonOneView.setTextColor(context.getResources().getColor(viewSettings.textColor));
        buttonOneView.setBackgroundResource(viewSettings.background);
        buttonOneView.setGravity(viewSettings.buttonGravity);

        if(onClickListener != null) buttonOneView.setOnClickListener(onClickListener);
    }

    public void setNegativeButton(ViewSettings viewSettings , View.OnClickListener onClickListener) {
        this.buttonTwo = (viewSettings.text.equals("")) ? ResUtils.GetStringSRC(context , viewSettings.textResID) : viewSettings.text ;
        showNegativeButton(viewSettings , onClickListener);
    }

    private void showNegativeButton(ViewSettings viewSettings , View.OnClickListener onClickListener) {
        buttonTwoView.setText(buttonTwo);
        if(viewSettings.textSize != 0.0) buttonTwoView.setTextSize(viewSettings.textSize);
        if(viewSettings.typeface != null) buttonTwoView.setTypeface(viewSettings.typeface);
        buttonTwoView.setTextColor(context.getResources().getColor(viewSettings.textColor));
        buttonTwoView.setBackgroundResource(viewSettings.background);
        buttonTwoView.setGravity(viewSettings.buttonGravity);

        if(onClickListener != null) buttonTwoView.setOnClickListener(onClickListener);
    }

}
