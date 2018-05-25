package com.example.arkantesfaymekonen.s2project;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Timer;

public class MainActivity extends AppCompatActivity {



    Questions[] qs=new Questions[]{
            new Questions("Lightning never strikes in the same place twice.",false,0,"It strikes in the same place quite a lot. The Empire State Building gets struck over 100 times a year."),
            new Questions("Lightning never strikes in the same place twice.",false,1,"It strikes in the same place quite a lot. The Empire State Building gets struck over 100 times a year."),

            new Questions("If you cry in space the tears just stick to your face.",true,2," You can watch a video of Chris Hadfield demonstrating it on board the International Space Station if you want."),

            new Questions(" If you cut an earthworm in half, both halves can regrow their body.",false,3,"Only one half of an earthworm can regenerate when it's cut in half, not both halves."),

            new Questions("Humans can distinguish between over a trillion different smells.",true,4,"It's not as good as a dog's, but the human nose is still pretty incredible."),

            new Questions("Adults have fewer bones than babies do.",true,5,"Lots of bones (like the cranium) start out as several fragments at birth, then fuse together into a single bone later in life."),

            new Questions("Napoleon Bonaparte was extremely short.",false,6,"Even though he's widely believed to have been short, he was actually above average height for his time."),

            new Questions("Goldfish only have a memory of three seconds.",false,7,"Goldfishes' legendarily short memory is a common belief, but it's been debunked repeatedly. They can actually remember things for quite a long time."),

            new Questions("There are more cells of bacteria in your body than there are human cells.",true,8,"Your body has around ten times as many bacterial cells in it than your own cells."),

            new Questions("Your fingernails and hair keep growing after you die.",false,9,"They really don't."),

            new Questions("Birds are dinosaurs.",true,10,"Not all dinosaurs became extinct; some of them survived, and every bird alive today is descended from those survivors."),

            new Questions("It costs the U.S. Mint more to make pennies and nickels than the coins are actually worth.",true,11,"U.S. taxpayers lost over $100 million in 2013 just through the coins being made."),

            new Questions("Water spirals down the plughole in opposite directions in the northern and southern hemispheres.",false,12,"It really doesn't (even though some people on the equator make a living fooling tourists into thinking it does...)"),
            new Questions(" Buzz Aldrin was the first man to urinate on the moon.",true,13," The second man to stand on fthe moon was the first to pee there (into a special bag in his spacesuit) – shortly after he stepped off the ladder of Apollo 11's Lunar Module."),
            new Questions("Twinkies have an infinite shelf life.",false,14,"The official shelf life of a Twinkie is 45 days. People have kept them around for longer, but they become inedible."),
            new Questions(" Humans can’t breathe and swallow at the same time.",true,15,"It's because our voice box is lower in the throat than other primates (who can do both at once.) On the plus side, this means we can use language..."),
            new Questions("The top of the Eiffel Tower leans away from the sun.",true,16,"The metal of the tower expands in the heat of the sun, so the sun-facing side is always slightly bigger than the one facing away – making it lean as much as seven inches away from the sun."),
            new Questions("Drinking alcohol kills brain cells.",false,17,"Drinking pretty much any non-fatal amount of alcohol won't add enough alcohol to your blood stream to destroy your neurons."),
            new Questions("The Berlin Wall was erected on November 9, 1989.",false,18,"he Berlin Wall, a symbol of the Cold War, was erected during the night of August 12–13, 1961, to stop the exodus of East Germans into West Germany. Demolition of the wall began on November 9, 1989."),
            new Questions("On September 19, 2017, an earthquake shattered Mexico, 32 years, to the day, after the earthquake that killed 10,000 people in this city.",true,19,"On September 19, 2017, an earthquake shook Mexico City, killing more than 360 people. This earthquake occurred 32 years, to the day, after the one that caused more than 10,000 deaths in Mexico City on September 19, 1985."),
            new Questions("The Muirfield in Scotland, the oldest golf club in the world, finally accepted female members.",true,20,"After 273 years of existence, the Muirfield in Scotland, the oldest golf club in the world, finally agreed to open its doors to female members. "),




    };



    TextView signed_username;
    TextView Answer;
    TextView Question;
    TextView score;
    Button TrueButton;
    Button FalseButton;
    Button nextButton;

    private int counter=0;
    private int QCounter=0;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        signed_username=(TextView)findViewById(R.id.nameTV);

        String name=getIntent().getStringExtra("username");
        signed_username.setText(name);

        Answer=(TextView)findViewById(R.id.answerTV);
        Question=(TextView)findViewById(R.id.questionTv);
        score=(TextView)findViewById(R.id.scoreTV);
        TrueButton=(Button)findViewById(R.id.trueBT);
        FalseButton=(Button)findViewById(R.id.falseBT);
        nextButton=(Button)findViewById(R.id.nextBt);
        score.setText(String.valueOf(counter));
        Question.setText(qs[QCounter].getQuestion());

        TrueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Answer.setText(qs[QCounter].getAnswer());
                Answer.setVisibility(View.VISIBLE);
                if (counter==0)
                {
                    counter=0;
                }else if (qs[QCounter].isTrueOrfalse()==true){
                    counter++;

                }else if (qs[QCounter].isTrueOrfalse()==false)
                {
                    counter--;
                }



            }
        });

        FalseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Answer.setVisibility(View.VISIBLE);
                Answer.setText(qs[QCounter].getAnswer());

                if (counter==0)
                {
                    counter=0;
                }else if (qs[QCounter].isTrueOrfalse()==false){
                    counter++;

                }else if (qs[QCounter].isTrueOrfalse()==true)                {
                    counter--;
                }

            }
        });

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                QCounter++;
                Answer.setVisibility(View.INVISIBLE);

            }
        });







    }


}
