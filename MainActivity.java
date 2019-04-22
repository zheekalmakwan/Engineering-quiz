package com_.example.mkwan.engineeringquiz;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "helloooooooo";
    //Declare all variable
    LinearLayout firstLinear;
    LinearLayout secondLinear;
    LinearLayout thirdLinear;
    LinearLayout fourthLinear;

    Question_Answer firstQuestion;
    Question_Answer secondQuestion;
    Question_Answer thirdQuestion;
    Question_Answer fourthQuestion;
    Question_Answer fifthQuestion;
    Question_Answer sixthQuestion;
    Question_Answer seventhQuestion;
    Question_Answer eighthQuestion;
    Question_Answer ninthQuestion;

    TextView checkBox_textView;
    TextView radioButton_textView;
    TextView checkBox_firstAnswer;
    TextView checkBox_secondAnswer;
    TextView checkBox_thirdAnswer;
    TextView checkBox_fourthAnswer;

    Button nextButtonCheckBox;
    Button nextButtonRadioButton;
    Button submitButton;

    CheckBox firstCheckBox;
    CheckBox secondCheckBox;
    CheckBox thirdCheckBox;
    CheckBox fourthCheckBox;

    RadioGroup groupRadioButton;

    RadioButton firstRadioButton;
    RadioButton secondRadioButton;
    RadioButton thirdRadioButton;
    RadioButton fourthRadioButton;

    EditText editText;
    int score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //get the id of linear layout's
        firstLinear = findViewById(R.id.first_linear);
        secondLinear = findViewById(R.id.second_linear);
        thirdLinear = findViewById(R.id.third_linear);
        fourthLinear = findViewById(R.id.fourth_linear);

        firstQuestion = new Question_Answer("Which one of them used for web design?", "Java", "Paython", "HTML", "CSS");
        secondQuestion = new Question_Answer("What refers to the learning that is provided in order to improve performance on the present job?", "Training", "Development", "Vestibule", "Specialized cources");
        thirdQuestion = new Question_Answer("Software reliability problems can almost always be traced to?", "errors in accuracy", "errors in design", "errors in implemetation", "errors in operation");
        fourthQuestion = new Question_Answer("The project Scope is defined as a means of bounding the system?", "functionality", "performance", "costs", "schedule");
        fifthQuestion = new Question_Answer("What dimensional property of a material refers to the deviation from edge straightness?", "Amber", "Alloy", "Chamber", "Camber");
        sixthQuestion = new Question_Answer("Double taxation is a disadvantage of which business organization?", "Sole proprietorship", "partnership", "Corporation", "Enterprise");
        seventhQuestion = new Question_Answer("What is the unit of luminous efficiency?", "Lumen/watt", "Lumen/volt", "Lumen/ampere", "Lumen/coulomb");
        eighthQuestion = new Question_Answer("What is the process of putting back the lost electrons to convert the ion back to metal?", "Convection", "Conduction", "Reduction", "Radiation");
        ninthQuestion = new Question_Answer("What is the value of the universal gas constant in kJ/mol.K", "10.73", "1.986", "8.314", "1545");

        checkBox_textView = findViewById(R.id.checkbox_text_view);
        radioButton_textView = findViewById(R.id.radiobutton_text_view);
        checkBox_firstAnswer = findViewById(R.id.checkbox_first_answer);
        checkBox_secondAnswer = findViewById(R.id.checkbox_second_answer);
        checkBox_thirdAnswer = findViewById(R.id.checkbox_third_answer);
        checkBox_fourthAnswer = findViewById(R.id.checkbox_fourth_answer);

        nextButtonCheckBox = findViewById(R.id.next_button);
        nextButtonRadioButton = findViewById(R.id.next_button_radio);
        submitButton = findViewById(R.id.submit_button);

        firstCheckBox = findViewById(R.id.first_checkbox);
        secondCheckBox = findViewById(R.id.second_checkbox);
        thirdCheckBox = findViewById(R.id.third_checkbox);
        fourthCheckBox = findViewById(R.id.fourth_checkbox);

        groupRadioButton = findViewById(R.id.radio_group_button);

        firstRadioButton = findViewById(R.id.first_radio_button);
        secondRadioButton = findViewById(R.id.second_radio_button);
        thirdRadioButton = findViewById(R.id.third_radio_button);
        fourthRadioButton = findViewById(R.id.fourth_radio_button);

        editText = findViewById(R.id.edit_text);
        /* This Handler I used for make a first activity be gone
         after a periodic time
         */
        Handler mHandler = new Handler();
        mHandler.postDelayed(new Runnable() {
            @Override
            public void run() {
                //start your activity here
                firstLinear.setVisibility(LinearLayout.GONE);
                secondLinear.setVisibility(LinearLayout.VISIBLE);
            }
        }, 6000);

        checkBox_textView.setText(firstQuestion.getQuestion());
        checkBox_firstAnswer.setText(firstQuestion.getFirstAnswer());
        checkBox_secondAnswer.setText(firstQuestion.getSecondAnswer());
        checkBox_thirdAnswer.setText(firstQuestion.getThirdAnswer());
        checkBox_fourthAnswer.setText(firstQuestion.getFourthAnswer());

        nextButtonCheckBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (thirdCheckBox.isChecked() && fourthCheckBox.isChecked() && !firstCheckBox.isChecked() && !secondCheckBox.isChecked()) {
                    score += 10;
                }
                secondLinear.setVisibility(LinearLayout.GONE);
                thirdLinear.setVisibility(LinearLayout.VISIBLE);
                radioButton_textView.setText(secondQuestion.getQuestion());
                firstRadioButton.setText(secondQuestion.getFirstAnswer());
                secondRadioButton.setText(secondQuestion.getSecondAnswer());
                thirdRadioButton.setText(secondQuestion.getThirdAnswer());
                fourthRadioButton.setText(secondQuestion.getFourthAnswer());

                nextButtonRadioButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if (firstRadioButton.isChecked()) {
                            score += 10;
                        }
                        thirdLinear.setVisibility(LinearLayout.GONE);
                        secondLinear.setVisibility(LinearLayout.VISIBLE);
                        firstCheckBox.setChecked(false);
                        secondCheckBox.setChecked(false);
                        thirdCheckBox.setChecked(false);
                        fourthCheckBox.setChecked(false);
                        checkBox_textView.setText(thirdQuestion.getQuestion());
                        checkBox_firstAnswer.setText(thirdQuestion.getFirstAnswer());
                        checkBox_secondAnswer.setText(thirdQuestion.getSecondAnswer());
                        checkBox_thirdAnswer.setText(thirdQuestion.getThirdAnswer());
                        checkBox_fourthAnswer.setText(thirdQuestion.getFourthAnswer());

                        nextButtonCheckBox.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                if (secondCheckBox.isChecked() && thirdCheckBox.isChecked() && !fourthCheckBox.isChecked() && !firstCheckBox.isChecked()) {
                                    score += 10;
                                }
                                firstCheckBox.setChecked(false);
                                secondCheckBox.setChecked(false);
                                thirdCheckBox.setChecked(false);
                                fourthCheckBox.setChecked(false);
                                checkBox_textView.setText(fourthQuestion.getQuestion());
                                checkBox_firstAnswer.setText(fourthQuestion.getFirstAnswer());
                                checkBox_secondAnswer.setText(fourthQuestion.getSecondAnswer());
                                checkBox_thirdAnswer.setText(fourthQuestion.getThirdAnswer());
                                checkBox_fourthAnswer.setText(fourthQuestion.getFourthAnswer());

                                nextButtonCheckBox.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        if (firstCheckBox.isChecked() && secondCheckBox.isChecked() && !thirdCheckBox.isChecked() && !fourthCheckBox.isChecked()) {
                                            score += 10;
                                        }
                                        secondLinear.setVisibility(LinearLayout.GONE);
                                        thirdLinear.setVisibility(LinearLayout.VISIBLE);
                                        firstRadioButton.setChecked(false);
                                        secondRadioButton.setChecked(false);
                                        thirdRadioButton.setChecked(false);
                                        fourthRadioButton.setChecked(false);
                                        radioButton_textView.setText(fifthQuestion.getQuestion());
                                        firstRadioButton.setText(fifthQuestion.getFirstAnswer());
                                        secondRadioButton.setText(fifthQuestion.getSecondAnswer());
                                        thirdRadioButton.setText(fifthQuestion.getThirdAnswer());
                                        fourthRadioButton.setText(fifthQuestion.getFourthAnswer());

                                        nextButtonRadioButton.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View view) {
                                                if (radioButton_textView.getText().equals(fifthQuestion.getQuestion())) {
                                                    if (fourthRadioButton.isChecked()) {
                                                        score += 10;
                                                    }
                                                    firstRadioButton.setChecked(false);
                                                    secondRadioButton.setChecked(false);
                                                    thirdRadioButton.setChecked(false);
                                                    fourthRadioButton.setChecked(false);
                                                    radioButton_textView.setText(sixthQuestion.getQuestion());
                                                    firstRadioButton.setText(sixthQuestion.getFirstAnswer());
                                                    secondRadioButton.setText(sixthQuestion.getSecondAnswer());
                                                    thirdRadioButton.setText(sixthQuestion.getThirdAnswer());
                                                    fourthRadioButton.setText(sixthQuestion.getFourthAnswer());

                                                } else if (radioButton_textView.getText().equals(sixthQuestion.getQuestion())) {
                                                    if (thirdRadioButton.isChecked()) {
                                                        score += 10;
                                                    }
                                                    firstRadioButton.setChecked(false);
                                                    secondRadioButton.setChecked(false);
                                                    thirdRadioButton.setChecked(false);
                                                    fourthRadioButton.setChecked(false);
                                                    radioButton_textView.setText(seventhQuestion.getQuestion());
                                                    firstRadioButton.setText(seventhQuestion.getFirstAnswer());
                                                    secondRadioButton.setText(seventhQuestion.getSecondAnswer());
                                                    thirdRadioButton.setText(seventhQuestion.getThirdAnswer());
                                                    fourthRadioButton.setText(seventhQuestion.getFourthAnswer());

                                                } else if (radioButton_textView.getText().equals(seventhQuestion.getQuestion())) {
                                                    if (firstRadioButton.isChecked()) {
                                                        score += 10;
                                                    }
                                                    firstRadioButton.setChecked(false);
                                                    secondRadioButton.setChecked(false);
                                                    thirdRadioButton.setChecked(false);
                                                    fourthRadioButton.setChecked(false);
                                                    radioButton_textView.setText(eighthQuestion.getQuestion());
                                                    firstRadioButton.setText(eighthQuestion.getFirstAnswer());
                                                    secondRadioButton.setText(eighthQuestion.getSecondAnswer());
                                                    thirdRadioButton.setText(eighthQuestion.getThirdAnswer());
                                                    fourthRadioButton.setText(eighthQuestion.getFourthAnswer());

                                                } else if (radioButton_textView.getText().equals(eighthQuestion.getQuestion())) {
                                                    if (thirdRadioButton.isChecked()) {
                                                        score += 10;
                                                    }
                                                    firstRadioButton.setChecked(false);
                                                    secondRadioButton.setChecked(false);
                                                    thirdRadioButton.setChecked(false);
                                                    fourthRadioButton.setChecked(false);
                                                    radioButton_textView.setText(ninthQuestion.getQuestion());
                                                    firstRadioButton.setText(ninthQuestion.getFirstAnswer());
                                                    secondRadioButton.setText(ninthQuestion.getSecondAnswer());
                                                    thirdRadioButton.setText(ninthQuestion.getThirdAnswer());
                                                    fourthRadioButton.setText(ninthQuestion.getFourthAnswer());

                                                } else if (radioButton_textView.getText().equals(ninthQuestion.getQuestion())) {
                                                    if (secondRadioButton.isChecked()) {
                                                        score += 10;
                                                    }
                                                    thirdLinear.setVisibility(LinearLayout.GONE);
                                                    fourthLinear.setVisibility(LinearLayout.VISIBLE);
                                                    submitButton.setOnClickListener(new View.OnClickListener() {
                                                        @Override
                                                        public void onClick(View view) {
                                                            if (editText.getText().toString().equals("1990")) {
                                                                score = score + 10;
                                                            }
                                                            if(score<50) {
                                                                Toast.makeText(MainActivity.this, "your Score is:" + score + "\n" + "try harder", Toast.LENGTH_LONG).show();
                                                            }else {
                                                                Toast.makeText(MainActivity.this, "your Score is:" + score + "\n" + "good score", Toast.LENGTH_LONG).show();
                                                            }
                                                        }
                                                    });
                                                }
                                            }
                                        });
                                    }
                                });
                            }
                        });
                    }
                });
            }
        });
    }
}
