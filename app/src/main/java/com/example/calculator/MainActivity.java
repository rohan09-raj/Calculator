package com.example.calculator;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

@SuppressLint("SetTextI18n")

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    //ID's of the Views in the layout
    final int id_one = R.id.one;
    final int id_two = R.id.two;
    final int id_three = R.id.three;
    final int id_four = R.id.four;
    final int id_five = R.id.five;
    final int id_six = R.id.six;
    final int id_seven = R.id.seven;
    final int id_eight = R.id.eight;
    final int id_nine = R.id.nine;
    final int id_zero = R.id.zero;
    final int id_addition = R.id.addition;
    final int id_subtraction = R.id.subtraction;
    final int id_multiplication = R.id.multiplication;
    final int id_divide = R.id.divide;
    final int id_clear = R.id.clear;
    final int id_equals = R.id.equals;
    final int id_percentage = R.id.percentage;
    final int id_decimal = R.id.decimal;

    //NumberTextView variables
    public TextView mOne;
    public TextView mTwo;
    public TextView mThree;
    public TextView mFour;
    public TextView mFive;
    public TextView mSix;
    public TextView mSeven;
    public TextView mEight;
    public TextView mNine;
    public TextView mZero;
    //OperationTextView variables
    public TextView mAddition;
    public TextView mSubtraction;
    public TextView mMultiplication;
    public TextView mDivision;
    public TextView mPercentage;
    public Button mEqualButton;
    public Button mClearButton;
    public TextView mDecimal;
    //Variables
    float mInput1;
    float mInput2;
    String mOperation;
    //DisplayEditText Variable
    private EditText mDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Find TextViews for Numbers
        mOne = findViewById(id_one);
        mTwo = findViewById(id_two);
        mThree = findViewById(id_three);
        mFour = findViewById(id_four);
        mFive = findViewById(id_five);
        mSix = findViewById(id_six);
        mSeven = findViewById(id_seven);
        mEight = findViewById(id_eight);
        mNine = findViewById(id_nine);
        mZero = findViewById(id_zero);

        //Find TextViews for Operations
        mAddition = findViewById(id_addition);
        mSubtraction = findViewById(id_subtraction);
        mMultiplication = findViewById(id_multiplication);
        mDivision = findViewById(id_divide);
        mEqualButton = findViewById(id_equals);
        mClearButton = findViewById(id_clear);
        mPercentage = findViewById(id_percentage);
        mDecimal = findViewById(id_decimal);

        //Find TextViews for Displaying Text
        mDisplay = findViewById(R.id.display_output);

        //Set OnClickListener on Numbers
        mOne.setOnClickListener(this);
        mTwo.setOnClickListener(this);
        mThree.setOnClickListener(this);
        mFour.setOnClickListener(this);
        mFive.setOnClickListener(this);
        mSix.setOnClickListener(this);
        mSeven.setOnClickListener(this);
        mEight.setOnClickListener(this);
        mNine.setOnClickListener(this);
        mZero.setOnClickListener(this);

        //Set OnClickListener on Operations
        mClearButton.setOnClickListener(this);
        mAddition.setOnClickListener(this);
        mSubtraction.setOnClickListener(this);
        mMultiplication.setOnClickListener(this);
        mDivision.setOnClickListener(this);
        mEqualButton.setOnClickListener(this);
        mPercentage.setOnClickListener(this);
        mDecimal.setOnClickListener(this);
    }

    //OnClick method implementation of the views
    @Override
    public void onClick(View view) {
        Editable inputString = mDisplay.getText();

        switch (view.getId()) {
            //Click operation for one
            case id_one:
                if (mInput2 != 0) {
                    mInput2 = 0;
                    mDisplay.setText("");
                }
                inputString = inputString.append(mOne.getText());
                mDisplay.setText(inputString);
                break;
            //Click operation for two
            case id_two:
                if (mInput2 != 0) {
                    mInput2 = 0;
                    mDisplay.setText("");
                }
                inputString = inputString.append(mTwo.getText());
                mDisplay.setText(inputString);
                break;
            //Click operation for three
            case id_three:
                if (mInput2 != 0) {
                    mInput2 = 0;
                    mDisplay.setText("");
                }
                inputString = inputString.append(mThree.getText());
                mDisplay.setText(inputString);
                break;
            //Click operation for four
            case id_four:
                if (mInput2 != 0) {
                    mInput2 = 0;
                    mDisplay.setText("");
                }
                inputString = inputString.append(mFour.getText());
                mDisplay.setText(inputString);
                break;
            //Click operation for five
            case id_five:
                if (mInput2 != 0) {
                    mInput2 = 0;
                    mDisplay.setText("");
                }
                inputString = inputString.append(mFive.getText());
                mDisplay.setText(inputString);
                break;
            //Click operation for six
            case id_six:
                if (mInput2 != 0) {
                    mInput2 = 0;
                    mDisplay.setText("");
                }
                inputString = inputString.append(mSix.getText());
                mDisplay.setText(inputString);
                break;
            //Click operation for seven
            case id_seven:
                if (mInput2 != 0) {
                    mInput2 = 0;
                    mDisplay.setText("");
                }
                inputString = inputString.append(mSeven.getText());
                mDisplay.setText(inputString);
                break;
            //Click operation for eight
            case id_eight:
                if (mInput2 != 0) {
                    mInput2 = 0;
                    mDisplay.setText("");
                }
                inputString = inputString.append(mEight.getText());
                mDisplay.setText(inputString);
                break;
            //Click operation for nine
            case id_nine:
                if (mInput2 != 0) {
                    mInput2 = 0;
                    mDisplay.setText("");
                }
                inputString = inputString.append(mNine.getText());
                mDisplay.setText(inputString);
                break;
            //Click operation for zero
            case id_zero:
                if (mInput2 != 0) {
                    mInput2 = 0;
                    mDisplay.setText("");
                }
                inputString = inputString.append(mZero.getText());
                mDisplay.setText(inputString);
                break;
            //Click operation for Decimal
            case id_decimal:
                if (mInput2 != 0) {
                    mInput2 = 0;
                    mDisplay.setText("");
                }
                inputString = inputString.append(mDecimal.getText());
                mDisplay.setText(inputString);
                break;
            //Click operation for clear button
            case id_clear:
                mInput1 = 0;
                mInput2 = 0;
                mDisplay.setText("");
                break;
            //Click operation for addition
            case id_addition:
                mOperation = "+";
                if (inputString != null && inputString.length() > 0) {
                    if (mInput1 == 0) {
                        mInput1 = Float.parseFloat(mDisplay.getText().toString());
                        mDisplay.setText("");
                    } else if (mInput2 != 0) {
                        mInput2 = 0;
                        mDisplay.setText("");
                    } else {
                        mInput2 = Float.parseFloat(mDisplay.getText().toString());
                        mDisplay.setText("");
                        mInput1 = mInput1 + mInput2;
                        mDisplay.setText(Float.toString(mInput1));
                    }
                }
                break;
            //Click operation for subtraction
            case id_subtraction:
                mOperation = "-";
                if (inputString != null && inputString.length() > 0) {
                    if (mInput1 == 0) {
                        mInput1 = Float.parseFloat(mDisplay.getText().toString());
                        mDisplay.setText("");
                    } else if (mInput2 != 0) {
                        mInput2 = 0;
                        mDisplay.setText("");
                    } else {
                        mInput2 = Float.parseFloat(mDisplay.getText().toString());
                        mDisplay.setText("");
                        mInput1 = mInput1 - mInput2;
                        mDisplay.setText(Float.toString(mInput1));
                    }
                }
                break;
            //Click operation for multiplication
            case id_multiplication:
                mOperation = "*";
                if (inputString != null && inputString.length() > 0) {
                    if (mInput1 == 0) {
                        mInput1 = Float.parseFloat(mDisplay.getText().toString());
                        mDisplay.setText("");
                    } else if (mInput2 != 0) {
                        mInput2 = 0;
                        mDisplay.setText("");
                    } else {
                        mInput2 = Float.parseFloat(mDisplay.getText().toString());
                        mDisplay.setText("");
                        mInput1 = mInput1 * mInput2;
                        mDisplay.setText(Float.toString(mInput1));
                    }
                }
                break;
            //Click operation for division
            case id_divide:
                mOperation = "/";
                if (inputString != null && inputString.length() > 0) {
                    if (mInput1 == 0) {
                        mInput1 = Float.parseFloat(mDisplay.getText().toString());
                        mDisplay.setText("");
                    } else if (mInput2 != 0) {
                        mInput2 = 0;
                        mDisplay.setText("");
                    } else {
                        mInput2 = Float.parseFloat(mDisplay.getText().toString());
                        mDisplay.setText("");
                        mInput1 = mInput1 / mInput2;
                        mDisplay.setText(Float.toString(mInput1));
                    }
                }
                break;
            //Click operation for percentage
            case id_percentage:
                mOperation = "%";
                if (inputString != null && inputString.length() > 0) {
                    if (mInput1 == 0) {
                        mInput1 = Float.parseFloat(mDisplay.getText().toString());
                        mDisplay.setText("");
                    } else {
                        mDisplay.setText("");
                        mInput1 = mInput1 / 100;
                        mDisplay.setText(Float.toString(mInput1));
                    }
                }
                break;
            //Click operation for equal button
            case id_equals:
                if (mOperation != null) {
                    //Check if mInput2 is inserted or not
                    if (mInput2 != 0) {
                        switch (mOperation) {
                            case "+":
                                //mInput1 = mInput1 + mInput2
                            case "-":
                                //mInput1 = mInput1 - mInput2
                            case "*":
                                //mInput1 = mInput1 * mInput2
                            case "/":
                                //mInput1 = mInput1 / mInput2
                                mDisplay.setText("");
                                mDisplay.setText(Double.toString(mInput1));
                                break;
                        }
                    } else {
                        if (mInput1 == 0 ) {
                            Toast.makeText(this, "Provide Inputs!", Toast.LENGTH_SHORT).show();
                        } else {
                            //Operation method to perform calculation
                            operation();
                        }
                    }
                }
                break;
        }
    }

    //Method to perform the selected operation
    public void operation() {
        switch (mOperation) {
            //Calculation for Addition
            case "+":
                mInput2 = Float.parseFloat(mDisplay.getText().toString());
                mDisplay.setText("");
                mInput1 = mInput1 + mInput2;
                mDisplay.setText(Float.toString(mInput1));
                break;
            //Calculation for Subtraction
            case "-":
                mInput2 = Float.parseFloat(mDisplay.getText().toString());
                mDisplay.setText("");
                mInput1 = mInput1 - mInput2;
                mDisplay.setText(Float.toString(mInput1));
                break;
            //Calculation for Multiplication
            case "*":
                mInput2 = Float.parseFloat(mDisplay.getText().toString());
                mDisplay.setText("");
                mInput1 = mInput1 * mInput2;
                mDisplay.setText(Float.toString(mInput1));
                break;
            //Calculation for Division
            case "/":
                mInput2 = Float.parseFloat(mDisplay.getText().toString());
                mDisplay.setText("");
                mInput1 = mInput1 / mInput2;
                mDisplay.setText(Float.toString(mInput1));
                break;
            //Calculation for Percentage
            case "%":
                mDisplay.setText("");
                mInput1 = mInput1 / 100;
                mDisplay.setText(Float.toString(mInput1));
                break;
        }
    }
}
