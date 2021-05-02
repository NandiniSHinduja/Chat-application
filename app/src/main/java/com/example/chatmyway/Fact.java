package com.example.chatmyway;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Fact extends AppCompatActivity {
    ImageView button1;
    ImageView button2;
    ImageView button3;
    ImageView button4;
    ImageView button5;
    ImageView button6;
    ImageView button7;
    ImageView button8;
    ImageView button9;
    ImageView button10;
    ImageView button11;
    ImageView button12;
    ImageView button13;
    ImageView button14;
    ImageView button15;
    ImageView button16;
    ImageView button17;
    ImageView button18;
    ImageView button19;
    ImageView button20;
    ImageView button21;
    ImageView button22;
    ImageView button23;
    ImageView button24;
    ImageView button25;
    ImageView button26;
    ImageView button27;
    ImageView button28;
    ImageView button29;
    ImageView button30;
    ImageView button31;
    ImageView button32;
    ImageView button33;
    ImageView button34;
    ImageView button35;
    ImageView button36;
    ImageView button37;
    ImageView button38;
    ImageView button39;
    ImageView button40;
    ImageView button41;
    ImageView button42;
    ImageView button43;
    ImageView button44;
    ImageView button45;
    ImageView button46;
    ImageView button47;
    ImageView button48;
    ImageView button49;
    ImageView button50;
    ImageView button51;
    ImageView button52;
    ImageView button53;
    ImageView button54;
    ImageView button55;
    ImageView button56;
    ImageView button57;
    ImageView button58;
    ImageView button59;
    ImageView button60;
    ImageView button61;
    ImageView button62;
    ImageView button63;
    ImageView button64;
    ImageView button65;
    ImageView button66;
    ImageView button67;
    ImageView button68;
    ImageView button69;
    ImageView button70;
    ImageView button71;
    ImageView button72;
    ImageView button73;
    ImageView button74;
    ImageView button75;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.facts);
        setTitle("Fun Facts");
        // COMPLETED (2) Set setDisplayHomeAsUpEnabled to true on the support ActionBar
        this.getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        button1=(ImageView) findViewById(R.id.button1);
        button2=(ImageView) findViewById(R.id.button2);
        button3=(ImageView) findViewById(R.id.button3);
        button4=(ImageView) findViewById(R.id.button4);
        button5=(ImageView) findViewById(R.id.button5);
        button6=(ImageView) findViewById(R.id.button6);
        button7=(ImageView) findViewById(R.id.button7);
        button8=(ImageView) findViewById(R.id.button8);
        button9=(ImageView) findViewById(R.id.button9);
        button10=(ImageView) findViewById(R.id.button10);
        button11=(ImageView) findViewById(R.id.button11);
        button12=(ImageView) findViewById(R.id.button12);
        button13=(ImageView) findViewById(R.id.button13);
        button14=(ImageView) findViewById(R.id.button14);
        button15=(ImageView) findViewById(R.id.button15);
        button16=(ImageView) findViewById(R.id.button16);
        button17=(ImageView) findViewById(R.id.button17);
        button18=(ImageView) findViewById(R.id.button18);
        button19=(ImageView) findViewById(R.id.button19);
        button20=(ImageView) findViewById(R.id.button20);
        button21=(ImageView) findViewById(R.id.button21);
        button22=(ImageView) findViewById(R.id.button22);
        button23=(ImageView) findViewById(R.id.button23);
        button24=(ImageView) findViewById(R.id.button24);
        button25=(ImageView) findViewById(R.id.button25);
        button26=(ImageView) findViewById(R.id.button26);
        button27=(ImageView) findViewById(R.id.button27);
        button28=(ImageView) findViewById(R.id.button28);
        button29=(ImageView) findViewById(R.id.button29);
        button30=(ImageView) findViewById(R.id.button30);
        button31=(ImageView) findViewById(R.id.button31);
        button32=(ImageView) findViewById(R.id.button32);
        button33=(ImageView) findViewById(R.id.button33);
        button34=(ImageView) findViewById(R.id.button34);
        button35=(ImageView) findViewById(R.id.button35);
        button36=(ImageView) findViewById(R.id.button36);
        button37=(ImageView) findViewById(R.id.button37);
        button38=(ImageView) findViewById(R.id.button38);
        button39=(ImageView) findViewById(R.id.button39);
        button40=(ImageView) findViewById(R.id.button40);
        button41=(ImageView) findViewById(R.id.button41);
        button42=(ImageView) findViewById(R.id.button42);
        button43=(ImageView) findViewById(R.id.button43);
        button44=(ImageView) findViewById(R.id.button44);
        button45=(ImageView) findViewById(R.id.button45);
        button46=(ImageView) findViewById(R.id.button46);
        button47=(ImageView) findViewById(R.id.button47);
        button48=(ImageView) findViewById(R.id.button48);
        button49=(ImageView) findViewById(R.id.button49);
        button50=(ImageView) findViewById(R.id.button50);
        button51=(ImageView) findViewById(R.id.button51);
        button52=(ImageView) findViewById(R.id.button52);
        button53=(ImageView) findViewById(R.id.button53);
        button54=(ImageView) findViewById(R.id.button54);
        button55=(ImageView) findViewById(R.id.button55);
        button56=(ImageView) findViewById(R.id.button56);
        button57=(ImageView) findViewById(R.id.button57);
        button58=(ImageView) findViewById(R.id.button58);
        button59=(ImageView) findViewById(R.id.button59);
        button60=(ImageView) findViewById(R.id.button60);
        button61=(ImageView) findViewById(R.id.button61);
        button62=(ImageView) findViewById(R.id.button62);
        button63=(ImageView) findViewById(R.id.button63);
        button64=(ImageView) findViewById(R.id.button64);
        button65=(ImageView) findViewById(R.id.button65);
        button66=(ImageView) findViewById(R.id.button66);
        button67=(ImageView) findViewById(R.id.button67);
        button68=(ImageView) findViewById(R.id.button68);
        button69=(ImageView) findViewById(R.id.button69);
        button70=(ImageView) findViewById(R.id.button70);
        button71=(ImageView) findViewById(R.id.button71);
        button72=(ImageView) findViewById(R.id.button72);
        button73=(ImageView) findViewById(R.id.button73);
        button74=(ImageView) findViewById(R.id.button74);
        button75=(ImageView) findViewById(R.id.button75);
    }
    public void mySend1(View view) {
        Intent share = new Intent(Intent.ACTION_SEND);
        share.putExtra(Intent.EXTRA_TEXT, "Weather fact: The naming of hurricanes and tropical storms officially began in 1953.");
        share.setType("text/plain");
        Intent shareIntent = Intent.createChooser(share, null);
        startActivity(shareIntent);
    }
    public void mySend2(View view) {
        Intent share = new Intent(Intent.ACTION_SEND);
        share.putExtra(Intent.EXTRA_TEXT, "Weather fact: The wind doesn’t make a sound until it blows against an object. ");
        share.setType("text/plain");
        Intent shareIntent = Intent.createChooser(share, null);
        startActivity(shareIntent);
    }
    public void mySend3(View view) {
        Intent share = new Intent(Intent.ACTION_SEND);
        share.putExtra(Intent.EXTRA_TEXT, "Weather fact:  Average global temperature is up by 0.94°C (1.7°F) since 1880. ");
        share.setType("text/plain");
        Intent shareIntent = Intent.createChooser(share, null);
        startActivity(shareIntent);
    }
    public void mySend4(View view) {
        Intent share = new Intent(Intent.ACTION_SEND);
        share.putExtra(Intent.EXTRA_TEXT, "Weather fact: Fire whirls are tornadoes made of fire caused by wildfires. ");
        share.setType("text/plain");
        Intent shareIntent = Intent.createChooser(share, null);
        startActivity(shareIntent);
    }
    public void mySend5(View view) {
        Intent share = new Intent(Intent.ACTION_SEND);
        share.putExtra(Intent.EXTRA_TEXT, "Weather fact: At any given time, there are about 1800 thunderstorms occurring on Earth. ");
        share.setType("text/plain");
        Intent shareIntent = Intent.createChooser(share, null);
        startActivity(shareIntent);
    }
    public void mySend6(View view) {
        Intent share = new Intent(Intent.ACTION_SEND);
        share.putExtra(Intent.EXTRA_TEXT, "Weather fact: For each minute of the day, 1 billion tonnes of rain falls on the Earth.  ");
        share.setType("text/plain");
        Intent shareIntent = Intent.createChooser(share, null);
        startActivity(shareIntent);
    }
    public void mySend7(View view) {
        Intent share = new Intent(Intent.ACTION_SEND);
        share.putExtra(Intent.EXTRA_TEXT, "Weather fact: A water molecule will stay in the Earth’s atmosphere for an average of 10 days. ");
        share.setType("text/plain");
        Intent shareIntent = Intent.createChooser(share, null);
        startActivity(shareIntent);
    }
    public void mySend8(View view) {
        Intent share = new Intent(Intent.ACTION_SEND);
        share.putExtra(Intent.EXTRA_TEXT, "Weather fact: Every second, around 100 lightning bolts strike the Earth. ");
        share.setType("text/plain");
        Intent shareIntent = Intent.createChooser(share, null);
        startActivity(shareIntent);
    }
    public void mySend9(View view) {
        Intent share = new Intent(Intent.ACTION_SEND);
        share.putExtra(Intent.EXTRA_TEXT, "Weather fact: The fastest speed a falling raindrop can hit you is 18 mph. ");
        share.setType("text/plain");
        Intent shareIntent = Intent.createChooser(share, null);
        startActivity(shareIntent);
    }
    public void mySend10(View view) {
        Intent share = new Intent(Intent.ACTION_SEND);
        share.putExtra(Intent.EXTRA_TEXT, "Weather fact: It was so cold in 1684 that the Thames River froze for two months.");
        share.setType("text/plain");
        Intent shareIntent = Intent.createChooser(share, null);
        startActivity(shareIntent);
    }
    public void mySend11(View view) {
        Intent share = new Intent(Intent.ACTION_SEND);
        share.putExtra(Intent.EXTRA_TEXT, "Weather fact: Mawsynram is the wettest place on Earth with an annual rainfall of 11m.");
        share.setType("text/plain");
        Intent shareIntent = Intent.createChooser(share, null);
        startActivity(shareIntent);
    }
    public void mySend12(View view) {
        Intent share = new Intent(Intent.ACTION_SEND);
        share.putExtra(Intent.EXTRA_TEXT, "Weather fact: Highest temperature on Earth was 56.7°C at Greenland Ranch in 1913. ");
        share.setType("text/plain");
        Intent shareIntent = Intent.createChooser(share, null);
        startActivity(shareIntent);
    }
    public void mySend13(View view) {
        Intent share = new Intent(Intent.ACTION_SEND);
        share.putExtra(Intent.EXTRA_TEXT, "Weather fact: Lowest temperature on Earth was -89.2°C at Vostok on July 21, 1983.");
        share.setType("text/plain");
        Intent shareIntent = Intent.createChooser(share, null);
        startActivity(shareIntent);
    }
    public void mySend14(View view) {
        Intent share = new Intent(Intent.ACTION_SEND);
        share.putExtra(Intent.EXTRA_TEXT, "Weather fact: A cubic mile of ordinary fog contains less than a gallon of water.");
        share.setType("text/plain");
        Intent shareIntent = Intent.createChooser(share, null);
        startActivity(shareIntent);
    }
    public void mySend15(View view) {
        Intent share = new Intent(Intent.ACTION_SEND);
        share.putExtra(Intent.EXTRA_TEXT, "Weather fact: In 1899, it was so cold that the Mississippi river froze entirely.");
        share.setType("text/plain");
        Intent shareIntent = Intent.createChooser(share, null);
        startActivity(shareIntent);
    }
    public void mySend16(View view) {
        Intent share = new Intent(Intent.ACTION_SEND);
        share.putExtra(Intent.EXTRA_TEXT, "Weather fact: The air located around a lightning bolt is heated to around 30,000°C.");
        share.setType("text/plain");
        Intent shareIntent = Intent.createChooser(share, null);
        startActivity(shareIntent);
    }
    public void mySend17(View view) {
        Intent share = new Intent(Intent.ACTION_SEND);
        share.putExtra(Intent.EXTRA_TEXT, "Weather fact: The average width of a tornado’s funnel averages about 100 to 200 yards.");
        share.setType("text/plain");
        Intent shareIntent = Intent.createChooser(share, null);
        startActivity(shareIntent);
    }
    public void mySend18(View view) {
        Intent share = new Intent(Intent.ACTION_SEND);
        share.putExtra(Intent.EXTRA_TEXT, "Weather fact: Snowflakes falling at 2-4 mph can take up to 1 hour to reach the ground.");
        share.setType("text/plain");
        Intent shareIntent = Intent.createChooser(share, null);
        startActivity(shareIntent);
    }
    public void mySend19(View view) {
        Intent share = new Intent(Intent.ACTION_SEND);
        share.putExtra(Intent.EXTRA_TEXT, "Weather fact: USA faces around 1200 tornadoes every year.");
        share.setType("text/plain");
        Intent shareIntent = Intent.createChooser(share, null);
        startActivity(shareIntent);
    }
    public void mySend20(View view) {
        Intent share = new Intent(Intent.ACTION_SEND);
        share.putExtra(Intent.EXTRA_TEXT, "Weather fact: Commonwealth Bay is the windiest place on Earth with winds of 200mph.");
        share.setType("text/plain");
        Intent shareIntent = Intent.createChooser(share, null);
        startActivity(shareIntent);
    }
    public void mySend21(View view) {
        Intent share = new Intent(Intent.ACTION_SEND);
        share.putExtra(Intent.EXTRA_TEXT, "Weather fact: Sandstorms can swallow up entire cities.");
        share.setType("text/plain");
        Intent shareIntent = Intent.createChooser(share, null);
        startActivity(shareIntent);
    }
    public void mySend22(View view) {
        Intent share = new Intent(Intent.ACTION_SEND);
        share.putExtra(Intent.EXTRA_TEXT, "Weather fact: Dirt mixed with wind can make dust storms called black blizzards.");
        share.setType("text/plain");
        Intent shareIntent = Intent.createChooser(share, null);
        startActivity(shareIntent);
    }
    public void mySend23(View view) {
        Intent share = new Intent(Intent.ACTION_SEND);
        share.putExtra(Intent.EXTRA_TEXT, "Weather fact: A mudslide can carry rocks, trees, vehicles and entire buildings!");
        share.setType("text/plain");
        Intent shareIntent = Intent.createChooser(share, null);
        startActivity(shareIntent);
    }
    public void mySend24(View view) {
        Intent share = new Intent(Intent.ACTION_SEND);
        share.putExtra(Intent.EXTRA_TEXT, "Weather fact: In July 2001 the rainfall in Kerala, India, was blood red!");
        share.setType("text/plain");
        Intent shareIntent = Intent.createChooser(share, null);
        startActivity(shareIntent);
    }
    public void mySend25(View view) {
        Intent share = new Intent(Intent.ACTION_SEND);
        share.putExtra(Intent.EXTRA_TEXT, "Weather fact: Cats and dogs have been known to sense when a tornado is approaching.");
        share.setType("text/plain");
        Intent shareIntent = Intent.createChooser(share, null);
        startActivity(shareIntent);
    }
    public void mySend26(View view) {
        Intent share = new Intent(Intent.ACTION_SEND);
        share.putExtra(Intent.EXTRA_TEXT, "Weather fact: In 1995, hailstones bigger than cricket balls fell in Texas.");
        share.setType("text/plain");
        Intent shareIntent = Intent.createChooser(share, null);
        startActivity(shareIntent);
    }
    public void mySend27(View view) {
        Intent share = new Intent(Intent.ACTION_SEND);
        share.putExtra(Intent.EXTRA_TEXT, "Weather fact: In 525 BC a sandstorm buried hundreds of soldiers in an Egyptian desert.");
        share.setType("text/plain");
        Intent shareIntent = Intent.createChooser(share, null);
        startActivity(shareIntent);
    }
    public void mySend28(View view) {
        Intent share = new Intent(Intent.ACTION_SEND);
        share.putExtra(Intent.EXTRA_TEXT, "Weather fact: Some frogs get noisier just before it rains. ");
        share.setType("text/plain");
        Intent shareIntent = Intent.createChooser(share, null);
        startActivity(shareIntent);
    }
    public void mySend29(View view) {
        Intent share = new Intent(Intent.ACTION_SEND);
        share.putExtra(Intent.EXTRA_TEXT, "Weather fact: Black ice can make pavements super-slippery.");
        share.setType("text/plain");
        Intent shareIntent = Intent.createChooser(share, null);
        startActivity(shareIntent);
    }
    public void mySend30(View view) {
        Intent share = new Intent(Intent.ACTION_SEND);
        share.putExtra(Intent.EXTRA_TEXT, "Weather fact: Some tornadoes can be faster than formula one racing cars!");
        share.setType("text/plain");
        Intent shareIntent = Intent.createChooser(share, null);
        startActivity(shareIntent);
    }
    public void mySend31(View view) {
        Intent share = new Intent(Intent.ACTION_SEND);
        share.putExtra(Intent.EXTRA_TEXT, "Weather fact: In 1972, a blizzard dumped 8m of snowfall on Iran, burying 200 villages.");
        share.setType("text/plain");
        Intent shareIntent = Intent.createChooser(share, null);
        startActivity(shareIntent);
    }
    public void mySend32(View view) {
        Intent share = new Intent(Intent.ACTION_SEND);
        share.putExtra(Intent.EXTRA_TEXT, "Weather fact: Wildfires sometimes create tornadoes made of fire called fire whirls.");
        share.setType("text/plain");
        Intent shareIntent = Intent.createChooser(share, null);
        startActivity(shareIntent);
    }
    public void mySend33(View view) {
        Intent share = new Intent(Intent.ACTION_SEND);
        share.putExtra(Intent.EXTRA_TEXT, "Weather fact: A whiteout or heavy snowfall that makes it difficult to see, can make you feel sick.");
        share.setType("text/plain");
        Intent shareIntent = Intent.createChooser(share, null);
        startActivity(shareIntent);
    }
    public void mySend34(View view) {
        Intent share = new Intent(Intent.ACTION_SEND);
        share.putExtra(Intent.EXTRA_TEXT, "Weather fact: In Antarctica, snow can fall so hard you can’t see your hand in front of your face");
        share.setType("text/plain");
        Intent shareIntent = Intent.createChooser(share, null);
        startActivity(shareIntent);
    }
    public void mySend35(View view) {
        Intent share = new Intent(Intent.ACTION_SEND);
        share.putExtra(Intent.EXTRA_TEXT, "Weather fact: A thunderstorm can produce 160kmph winds!");
        share.setType("text/plain");
        Intent shareIntent = Intent.createChooser(share, null);
        startActivity(shareIntent);
    }
    public void mySend36(View view) {
        Intent share = new Intent(Intent.ACTION_SEND);
        share.putExtra(Intent.EXTRA_TEXT, "Weather fact: A hurricane in Florida, USA, caused 900 captive pythons to escape. ");
        share.setType("text/plain");
        Intent shareIntent = Intent.createChooser(share, null);
        startActivity(shareIntent);
    }
    public void mySend37(View view) {
        Intent share = new Intent(Intent.ACTION_SEND);
        share.putExtra(Intent.EXTRA_TEXT, "Weather fact: Worms wriggle up from underground when a flood is coming. ");
        share.setType("text/plain");
        Intent shareIntent = Intent.createChooser(share, null);
        startActivity(shareIntent);
    }
    public void mySend38(View view) {
        Intent share = new Intent(Intent.ACTION_SEND);
        share.putExtra(Intent.EXTRA_TEXT, "Weather fact: Lightning often follows a volcanic eruption.");
        share.setType("text/plain");
        Intent shareIntent = Intent.createChooser(share, null);
        startActivity(shareIntent);
    }
    public void mySend39(View view) {
        Intent share = new Intent(Intent.ACTION_SEND);
        share.putExtra(Intent.EXTRA_TEXT, "Weather fact: A 2003 heatwave turned grapes to raisins!");
        share.setType("text/plain");
        Intent shareIntent = Intent.createChooser(share, null);
        startActivity(shareIntent);
    }
    public void mySend40(View view) {
        Intent share = new Intent(Intent.ACTION_SEND);
        share.putExtra(Intent.EXTRA_TEXT, "Weather fact: A heatwave can make train tracks bend!");
        share.setType("text/plain");
        Intent shareIntent = Intent.createChooser(share, null);
        startActivity(shareIntent);
    }
    public void mySend41(View view) {
        Intent share = new Intent(Intent.ACTION_SEND);
        share.putExtra(Intent.EXTRA_TEXT, "Weather fact: Mild autumn weather often means bigger spiders in our homes.");
        share.setType("text/plain");
        Intent shareIntent = Intent.createChooser(share, null);
        startActivity(shareIntent);
    }
    public void mySend42(View view) {
        Intent share = new Intent(Intent.ACTION_SEND);
        share.putExtra(Intent.EXTRA_TEXT, "Weather fact: Being underneath a tree is the second leading cause of lightning deaths.");
        share.setType("text/plain");
        Intent shareIntent = Intent.createChooser(share, null);
        startActivity(shareIntent);
    }
    public void mySend43(View view) {
        Intent share = new Intent(Intent.ACTION_SEND);
        share.putExtra(Intent.EXTRA_TEXT, "Weather fact: The average lightning casualties in the U.S. is 51.");
        share.setType("text/plain");
        Intent shareIntent = Intent.createChooser(share, null);
        startActivity(shareIntent);
    }
    public void mySend44(View view) {
        Intent share = new Intent(Intent.ACTION_SEND);
        share.putExtra(Intent.EXTRA_TEXT, "Weather fact: The Upanishads were the earliest weather scholars.");
        share.setType("text/plain");
        Intent shareIntent = Intent.createChooser(share, null);
        startActivity(shareIntent);
    }
    public void mySend45(View view) {
        Intent share = new Intent(Intent.ACTION_SEND);
        share.putExtra(Intent.EXTRA_TEXT, "Weather fact: Christopher Columbus encountered a cyclone in one of his expeditions.");
        share.setType("text/plain");
        Intent shareIntent = Intent.createChooser(share, null);
        startActivity(shareIntent);
    }
    public void mySend46(View view) {
        Intent share = new Intent(Intent.ACTION_SEND);
        share.putExtra(Intent.EXTRA_TEXT, "Weather fact: The first weather network was established in 1654.");
        share.setType("text/plain");
        Intent shareIntent = Intent.createChooser(share, null);
        startActivity(shareIntent);
    }
    public void mySend47(View view) {
        Intent share = new Intent(Intent.ACTION_SEND);
        share.putExtra(Intent.EXTRA_TEXT, "Weather fact: The first weather forecasting service was in the UK.");
        share.setType("text/plain");
        Intent shareIntent = Intent.createChooser(share, null);
        startActivity(shareIntent);
    }
    public void mySend48(View view) {
        Intent share = new Intent(Intent.ACTION_SEND);
        share.putExtra(Intent.EXTRA_TEXT, "Weather fact: In some places, it snows pink.");
        share.setType("text/plain");
        Intent shareIntent = Intent.createChooser(share, null);
        startActivity(shareIntent);
    }
    public void mySend49(View view) {
        Intent share = new Intent(Intent.ACTION_SEND);
        share.putExtra(Intent.EXTRA_TEXT, "Weather fact: Aristotle is the father of meteorology.");
        share.setType("text/plain");
        Intent shareIntent = Intent.createChooser(share, null);
        startActivity(shareIntent);
    }
    public void mySend50(View view) {
        Intent share = new Intent(Intent.ACTION_SEND);
        share.putExtra(Intent.EXTRA_TEXT, "Weather fact: 530,000 have died due to climate from 1994-2013.");
        share.setType("text/plain");
        Intent shareIntent = Intent.createChooser(share, null);
        startActivity(shareIntent);
    }
    public void mySend51(View view) {
        Intent share = new Intent(Intent.ACTION_SEND);
        share.putExtra(Intent.EXTRA_TEXT, "Weather fact: The driest place on earth is Antofagasta, Chile.");
        share.setType("text/plain");
        Intent shareIntent = Intent.createChooser(share, null);
        startActivity(shareIntent);
    }
    public void mySend52(View view) {
        Intent share = new Intent(Intent.ACTION_SEND);
        share.putExtra(Intent.EXTRA_TEXT, "Weather fact: Lightning is hotter than the sun.");
        share.setType("text/plain");
        Intent shareIntent = Intent.createChooser(share, null);
        startActivity(shareIntent);
    }
    public void mySend53(View view) {
        Intent share = new Intent(Intent.ACTION_SEND);
        share.putExtra(Intent.EXTRA_TEXT, "Weather fact: Lightning strikes the same place.");
        share.setType("text/plain");
        Intent shareIntent = Intent.createChooser(share, null);
        startActivity(shareIntent);
    }
    public void mySend54(View view) {
        Intent share = new Intent(Intent.ACTION_SEND);
        share.putExtra(Intent.EXTRA_TEXT, "Weather fact: Hurricane Irma is the longest-lasting typhoon ever recorded.");
        share.setType("text/plain");
        Intent shareIntent = Intent.createChooser(share, null);
        startActivity(shareIntent);
    }
    public void mySend55(View view) {
        Intent share = new Intent(Intent.ACTION_SEND);
        share.putExtra(Intent.EXTRA_TEXT, "Weather fact: The first weather measuring device was the rain gauge.");
        share.setType("text/plain");
        Intent shareIntent = Intent.createChooser(share, null);
        startActivity(shareIntent);
    }
    public void mySend56(View view) {
        Intent share = new Intent(Intent.ACTION_SEND);
        share.putExtra(Intent.EXTRA_TEXT, "Weather fact: Evaporation of water is up to 4000 gallons daily.");
        share.setType("text/plain");
        Intent shareIntent = Intent.createChooser(share, null);
        startActivity(shareIntent);
    }
    public void mySend57(View view) {
        Intent share = new Intent(Intent.ACTION_SEND);
        share.putExtra(Intent.EXTRA_TEXT, "Weather fact: It takes 8 minutes for sunlight to reach earth.");
        share.setType("text/plain");
        Intent shareIntent = Intent.createChooser(share, null);
        startActivity(shareIntent);
    }
    public void mySend58(View view) {
        Intent share = new Intent(Intent.ACTION_SEND);
        share.putExtra(Intent.EXTRA_TEXT, "Weather fact: The seasons are linked to the earth tilting on it's axis at an angle of 23.5°.");
        share.setType("text/plain");
        Intent shareIntent = Intent.createChooser(share, null);
        startActivity(shareIntent);
    }
    public void mySend59(View view) {
        Intent share = new Intent(Intent.ACTION_SEND);
        share.putExtra(Intent.EXTRA_TEXT, "Weather fact: Waterspouts can make sea creatures rain down from the sky.");
        share.setType("text/plain");
        Intent shareIntent = Intent.createChooser(share, null);
        startActivity(shareIntent);
    }
    public void mySend60(View view) {
        Intent share = new Intent(Intent.ACTION_SEND);
        share.putExtra(Intent.EXTRA_TEXT, "Weather fact: Lightning strikes more men than women with 85% of it's victims being men.");
        share.setType("text/plain");
        Intent shareIntent = Intent.createChooser(share, null);
        startActivity(shareIntent);
    }
    public void mySend61(View view) {
        Intent share = new Intent(Intent.ACTION_SEND);
        share.putExtra(Intent.EXTRA_TEXT, "Weather fact: The longest lasting tropical storm John was about 31 days.");
        share.setType("text/plain");
        Intent shareIntent = Intent.createChooser(share, null);
        startActivity(shareIntent);
    }
    public void mySend62(View view) {
        Intent share = new Intent(Intent.ACTION_SEND);
        share.putExtra(Intent.EXTRA_TEXT, "Weather fact: The sunniest place on earth is Arizona (Yuma).");
        share.setType("text/plain");
        Intent shareIntent = Intent.createChooser(share, null);
        startActivity(shareIntent);
    }
    public void mySend63(View view) {
        Intent share = new Intent(Intent.ACTION_SEND);
        share.putExtra(Intent.EXTRA_TEXT, "Weather fact: The least sunny place on earth is the South Pole.");
        share.setType("text/plain");
        Intent shareIntent = Intent.createChooser(share, null);
        startActivity(shareIntent);
    }
    public void mySend64(View view) {
        Intent share = new Intent(Intent.ACTION_SEND);
        share.putExtra(Intent.EXTRA_TEXT, "Weather fact: Weather and climate influences migration patterns.");
        share.setType("text/plain");
        Intent shareIntent = Intent.createChooser(share, null);
        startActivity(shareIntent);
    }
    public void mySend65(View view) {
        Intent share = new Intent(Intent.ACTION_SEND);
        share.putExtra(Intent.EXTRA_TEXT, "Weather fact: The Coriolis effect influences weather patterns.");
        share.setType("text/plain");
        Intent shareIntent = Intent.createChooser(share, null);
        startActivity(shareIntent);
    }
    public void mySend66(View view) {
        Intent share = new Intent(Intent.ACTION_SEND);
        share.putExtra(Intent.EXTRA_TEXT, "Weather fact: Climate influences vegetation types.\" ");
        share.setType("text/plain");
        Intent shareIntent = Intent.createChooser(share, null);
        startActivity(shareIntent);
    }
    public void mySend67(View view) {
        Intent share = new Intent(Intent.ACTION_SEND);
        share.putExtra(Intent.EXTRA_TEXT, "Weather fact: Earth gets colder than Mars.");
        share.setType("text/plain");
        Intent shareIntent = Intent.createChooser(share, null);
        startActivity(shareIntent);
    }
    public void mySend68(View view) {
        Intent share = new Intent(Intent.ACTION_SEND);
        share.putExtra(Intent.EXTRA_TEXT, "Weather fact: Jupiter’s everlasting hurricane is larger than Earth.");
        share.setType("text/plain");
        Intent shareIntent = Intent.createChooser(share, null);
        startActivity(shareIntent);
    }
    public void mySend69(View view) {
        Intent share = new Intent(Intent.ACTION_SEND);
        share.putExtra(Intent.EXTRA_TEXT, "Weather fact: Physics, computer science, chemistry and maths are related to meteorology.");
        share.setType("text/plain");
        Intent shareIntent = Intent.createChooser(share, null);
        startActivity(shareIntent);
    }
    public void mySend70(View view) {
        Intent share = new Intent(Intent.ACTION_SEND);
        share.putExtra(Intent.EXTRA_TEXT, "Weather fact: Satellites, radars, and computers measure the weather.");
        share.setType("t ext/plain");
        Intent shareIntent = Intent.createChooser(share, null);
        startActivity(shareIntent);
    }
    public void mySend71(View view) {
        Intent share = new Intent(Intent.ACTION_SEND);
        share.putExtra(Intent.EXTRA_TEXT, "Weather fact: Before it rains, ants form a line, sheep’s wool uncurls, cows lie down, and more.");
        share.setType("text/plain");
        Intent shareIntent = Intent.createChooser(share, null);
        startActivity(shareIntent);
    }
    public void mySend72(View view) {
        Intent share = new Intent(Intent.ACTION_SEND);
        share.putExtra(Intent.EXTRA_TEXT, "Weather fact: Theophrastus wrote a weather book called The Book of Signs.");
        share.setType("text/plain");
        Intent shareIntent = Intent.createChooser(share, null);
        startActivity(shareIntent);
    }
    public void mySend73(View view) {
        Intent share = new Intent(Intent.ACTION_SEND);
        share.putExtra(Intent.EXTRA_TEXT, "Weather fact: The first weather forecast appeared in the London Times in 1861.");
        share.setType("text/plain");
        Intent shareIntent = Intent.createChooser(share, null);
        startActivity(shareIntent);
    }
    public void mySend74(View view) {
        Intent share = new Intent(Intent.ACTION_SEND);
        share.putExtra(Intent.EXTRA_TEXT, "Weather fact: 2019 was the second warmest year on record.");
        share.setType("text/plain");
        Intent shareIntent = Intent.createChooser(share, null);
        startActivity(shareIntent);
    }
    public void mySend75(View view) {
        Intent share = new Intent(Intent.ACTION_SEND);
        share.putExtra(Intent.EXTRA_TEXT, "Weather fact: The concentration of CO2, as of May 2020, is the highest it has ever been.");
        share.setType("text/plain");
        Intent shareIntent = Intent.createChooser(share, null);
        startActivity(shareIntent);
    }
    boolean isPlaying;
    boolean isPlaying2;
    boolean isPlaying3;
    boolean isPlaying4;
    boolean isPlaying5;
    boolean isPlaying6;
    boolean isPlaying7;
    boolean isPlaying8;
    boolean isPlaying9;
    boolean isPlaying10;
    boolean isPlaying11;
    boolean isPlaying12;
    boolean isPlaying13;
    boolean isPlaying14;
    boolean isPlaying15;
    boolean isPlaying16;
    boolean isPlaying17;
    boolean isPlaying18;
    boolean isPlaying19;
    boolean isPlaying20;
    boolean isPlaying21;
    boolean isPlaying22;
    boolean isPlaying23;
    boolean isPlaying24;
    boolean isPlaying25;
    boolean isPlaying26;
    boolean isPlaying27;
    boolean isPlaying28;
    boolean isPlaying29;
    boolean isPlaying30;
    boolean isPlaying31;
    boolean isPlaying32;
    boolean isPlaying33;
    boolean isPlaying34;
    boolean isPlaying35;
    boolean isPlaying36;
    boolean isPlaying37;
    boolean isPlaying38;
    boolean isPlaying39;
    boolean isPlaying40;
    boolean isPlaying41;
    boolean isPlaying42;
    boolean isPlaying43;
    boolean isPlaying44;
    boolean isPlaying45;
    boolean isPlaying46;
    boolean isPlaying47;
    boolean isPlaying48;
    boolean isPlaying49;
    boolean isPlaying50;
    boolean isPlaying51;
    boolean isPlaying52;
    boolean isPlaying53;
    boolean isPlaying54;
    boolean isPlaying55;
    boolean isPlaying56;
    boolean isPlaying57;
    boolean isPlaying58;
    boolean isPlaying59;
    boolean isPlaying60;
    boolean isPlaying61;
    boolean isPlaying62;
    boolean isPlaying63;
    boolean isPlaying64;
    boolean isPlaying65;
    boolean isPlaying66;
    boolean isPlaying67;
    boolean isPlaying68;
    boolean isPlaying69;
    boolean isPlaying70;
    boolean isPlaying71;
    boolean isPlaying72;
    boolean isPlaying73;
    boolean isPlaying74;
    boolean isPlaying75;
    public void audio1(View view)
    {
        MediaPlayer music1 = MediaPlayer.create(this, R.raw.fact1);
        button1.setImageResource(R.drawable.pauses);
        music1.start();
        isPlaying=true;
        music1.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer music1) {
                button1.setImageResource(R.drawable.play);
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (isPlaying) {
                    music1.pause();
                    button1.setImageResource(R.drawable.play);
                }else{
                    music1.start();
                    button1.setImageResource(R.drawable.pauses);
                }
                isPlaying = !isPlaying;
            }
        });
    }
    public void audio2(View view)
    {
        MediaPlayer music2 = MediaPlayer.create(this, R.raw.fact2);
        button2.setImageResource(R.drawable.pauses);
        music2.start();
        isPlaying2=true;
        music2.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer music2) {
                button2.setImageResource(R.drawable.play);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (isPlaying2) {
                    music2.pause();
                    button2.setImageResource(R.drawable.play);
                }else{
                    music2.start();
                    button2.setImageResource(R.drawable.pauses);
                }
                isPlaying2 = !isPlaying2;
            }
        });
    }
    public void audio3(View view)
    {
        MediaPlayer music3 = MediaPlayer.create(this, R.raw.fact3);
        button3.setImageResource(R.drawable.pauses);
        music3.start();
        isPlaying3=true;
        music3.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer music3) {
                button3.setImageResource(R.drawable.play);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (isPlaying3) {
                    music3.pause();
                    button3.setImageResource(R.drawable.play);
                }else{
                    music3.start();
                    button3.setImageResource(R.drawable.pauses);
                }
                isPlaying3 = !isPlaying3;
            }
        });
    }
    public void audio4(View view)
    {
        MediaPlayer music4 = MediaPlayer.create(this, R.raw.fact4);
        button4.setImageResource(R.drawable.pauses);
        music4.start();
        isPlaying4=true;
        music4.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer music4) {
                button4.setImageResource(R.drawable.play);
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (isPlaying4) {
                    music4.pause();
                    button4.setImageResource(R.drawable.play);
                }else{
                    music4.start();
                    button4.setImageResource(R.drawable.pauses);
                }
                isPlaying4 = !isPlaying4;
            }
        });
    }
    public void audio5(View view)
    {
        MediaPlayer music5 = MediaPlayer.create(this, R.raw.fact5);
        button5.setImageResource(R.drawable.pauses);
        music5.start();
        isPlaying5=true;
        music5.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer music5) {
                button5.setImageResource(R.drawable.play);
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (isPlaying5) {
                    music5.pause();
                    button5.setImageResource(R.drawable.play);
                }else{
                    music5.start();
                    button5.setImageResource(R.drawable.pauses);
                }
                isPlaying5 = !isPlaying5;
            }
        });
    }
    public void audio6(View view)
    {
        MediaPlayer music6 = MediaPlayer.create(this, R.raw.fact6);
        button6.setImageResource(R.drawable.pauses);
        music6.start();
        isPlaying6=true;
        music6.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer music6) {
                button6.setImageResource(R.drawable.play);
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (isPlaying6) {
                    music6.pause();
                    button6.setImageResource(R.drawable.play);
                }else{
                    music6.start();
                    button6.setImageResource(R.drawable.pauses);
                }
                isPlaying6 = !isPlaying6;
            }
        });
    }
    public void audio7(View view)
    {
        MediaPlayer music7 = MediaPlayer.create(this, R.raw.fact7);
        button7.setImageResource(R.drawable.pauses);
        music7.start();
        isPlaying7=true;
        music7.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer music7) {
                button7.setImageResource(R.drawable.play);
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (isPlaying7) {
                    music7.pause();
                    button7.setImageResource(R.drawable.play);
                }else{
                    music7.start();
                    button7.setImageResource(R.drawable.pauses);
                }
                isPlaying7 = !isPlaying7;
            }
        });
    }
    public void audio8(View view)
    {
        MediaPlayer music8 = MediaPlayer.create(this, R.raw.fact8);
        button8.setImageResource(R.drawable.pauses);
        music8.start();
        isPlaying8=true;
        music8.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer music8) {
                button8.setImageResource(R.drawable.play);
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (isPlaying8) {
                    music8.pause();
                    button8.setImageResource(R.drawable.play);
                }else{
                    music8.start();
                    button8.setImageResource(R.drawable.pauses);
                }
                isPlaying8 = !isPlaying8;
            }
        });
    }
    public void audio9(View view)
    {
        MediaPlayer music9 = MediaPlayer.create(this, R.raw.fact9);
        button9.setImageResource(R.drawable.pauses);
        music9.start();
        isPlaying9=true;
        music9.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer music9) {
                button9.setImageResource(R.drawable.play);
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (isPlaying9) {
                    music9.pause();
                    button9.setImageResource(R.drawable.play);
                }else{
                    music9.start();
                    button9.setImageResource(R.drawable.pauses);
                }
                isPlaying9 = !isPlaying9;
            }
        });
    }
    public void audio10(View view)
    {
        MediaPlayer music10 = MediaPlayer.create(this, R.raw.fact10);
        button10.setImageResource(R.drawable.pauses);
        music10.start();
        isPlaying10=true;
        music10.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer music10) {
                button10.setImageResource(R.drawable.play);
            }
        });
        button10.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (isPlaying10) {
                    music10.pause();
                    button10.setImageResource(R.drawable.play);
                }else{
                    music10.start();
                    button10.setImageResource(R.drawable.pauses);
                }
                isPlaying10 = !isPlaying10;
            }
        });
    }
    public void audio11(View view)
    {
        MediaPlayer music11 = MediaPlayer.create(this, R.raw.fact11);
        button11.setImageResource(R.drawable.pauses);
        music11.start();
        isPlaying11=true;
        music11.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer music11) {
                button11.setImageResource(R.drawable.play);
            }
        });
        button11.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (isPlaying11) {
                    music11.pause();
                    button11.setImageResource(R.drawable.play);
                }else{
                    music11.start();
                    button11.setImageResource(R.drawable.pauses);
                }
                isPlaying11 = !isPlaying11;
            }
        });
    }
    public void audio12(View view)
    {
        MediaPlayer music12 = MediaPlayer.create(this, R.raw.fact12);
        button12.setImageResource(R.drawable.pauses);
        music12.start();
        isPlaying12=true;
        music12.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer music12) {
                button12.setImageResource(R.drawable.play);
            }
        });
        button12.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (isPlaying12) {
                    music12.pause();
                    button12.setImageResource(R.drawable.play);
                }else{
                    music12.start();
                    button12.setImageResource(R.drawable.pauses);
                }
                isPlaying12 = !isPlaying12;
            }
        });
    }
    public void audio13(View view)
    {
        MediaPlayer music13 = MediaPlayer.create(this, R.raw.fact13);
        button13.setImageResource(R.drawable.pauses);
        music13.start();
        isPlaying13=true;
        music13.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer music13) {
                button13.setImageResource(R.drawable.play);
            }
        });
        button13.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (isPlaying13) {
                    music13.pause();
                    button13.setImageResource(R.drawable.play);
                }else{
                    music13.start();
                    button13.setImageResource(R.drawable.pauses);
                }
                isPlaying13 = !isPlaying13;
            }
        });
    }
    public void audio14(View view)
    {
        MediaPlayer music14 = MediaPlayer.create(this, R.raw.fact14);
        button14.setImageResource(R.drawable.pauses);
        music14.start();
        isPlaying14=true;
        music14.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer music14) {
                button14.setImageResource(R.drawable.play);
            }
        });
        button14.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (isPlaying14) {
                    music14.pause();
                    button14.setImageResource(R.drawable.play);
                }else{
                    music14.start();
                    button14.setImageResource(R.drawable.pauses);
                }
                isPlaying14 = !isPlaying14;
            }
        });
    }
    public void audio15(View view)
    {
        MediaPlayer music15 = MediaPlayer.create(this, R.raw.fact15);
        button15.setImageResource(R.drawable.pauses);
        music15.start();
        isPlaying15=true;
        music15.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer music15) {
                button15.setImageResource(R.drawable.play);
            }
        });
        button15.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (isPlaying15) {
                    music15.pause();
                    button15.setImageResource(R.drawable.play);
                }else{
                    music15.start();
                    button15.setImageResource(R.drawable.pauses);
                }
                isPlaying15 = !isPlaying15;
            }
        });
    }
    public void audio16(View view)
    {
        MediaPlayer music16 = MediaPlayer.create(this, R.raw.fact16);
        button16.setImageResource(R.drawable.pauses);
        music16.start();
        isPlaying16=true;
        music16.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer music16) {
                button16.setImageResource(R.drawable.play);
            }
        });
        button16.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (isPlaying16) {
                    music16.pause();
                    button16.setImageResource(R.drawable.play);
                }else{
                    music16.start();
                    button16.setImageResource(R.drawable.pauses);
                }
                isPlaying16 = !isPlaying16;
            }
        });
    }
    public void audio17(View view)
    {
        MediaPlayer music17 = MediaPlayer.create(this, R.raw.fact17);
        button17.setImageResource(R.drawable.pauses);
        music17.start();
        isPlaying17=true;
        music17.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer music17) {
                button17.setImageResource(R.drawable.play);
            }
        });
        button17.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (isPlaying17) {
                    music17.pause();
                    button17.setImageResource(R.drawable.play);
                }else{
                    music17.start();
                    button17.setImageResource(R.drawable.pauses);
                }
                isPlaying17 = !isPlaying17;
            }
        });
    }
    public void audio18(View view)
    {
        MediaPlayer music18 = MediaPlayer.create(this, R.raw.fact18);
        button18.setImageResource(R.drawable.pauses);
        music18.start();
        isPlaying18=true;
        music18.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer music18) {
                button18.setImageResource(R.drawable.play);
            }
        });
        button18.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (isPlaying18) {
                    music18.pause();
                    button18.setImageResource(R.drawable.play);
                }else{
                    music18.start();
                    button18.setImageResource(R.drawable.pauses);
                }
                isPlaying18 = !isPlaying18;
            }
        });
    }
    public void audio19(View view)
    {
        MediaPlayer music19 = MediaPlayer.create(this, R.raw.fact19);
        button19.setImageResource(R.drawable.pauses);
        music19.start();
        isPlaying19=true;
        music19.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer music19) {
                button19.setImageResource(R.drawable.play);
            }
        });
        button19.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (isPlaying19) {
                    music19.pause();
                    button19.setImageResource(R.drawable.play);
                }else{
                    music19.start();
                    button19.setImageResource(R.drawable.pauses);
                }
                isPlaying19 = !isPlaying19;
            }
        });
    }
    public void audio20(View view)
    {
        MediaPlayer music20 = MediaPlayer.create(this, R.raw.fact20);
        button20.setImageResource(R.drawable.pauses);
        music20.start();
        isPlaying20=true;
        music20.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer music20) {
                button20.setImageResource(R.drawable.play);
            }
        });
        button20.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (isPlaying20) {
                    music20.pause();
                    button20.setImageResource(R.drawable.play);
                }else{
                    music20.start();
                    button20.setImageResource(R.drawable.pauses);
                }
                isPlaying20 = !isPlaying20;
            }
        });
    }
    public void audio21(View view)
    {
        MediaPlayer music21 = MediaPlayer.create(this, R.raw.fact21);
        button21.setImageResource(R.drawable.pauses);
        music21.start();
        isPlaying21=true;
        music21.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer music21) {
                button21.setImageResource(R.drawable.play);
            }
        });
        button21.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (isPlaying21) {
                    music21.pause();
                    button21.setImageResource(R.drawable.play);
                }else{
                    music21.start();
                    button21.setImageResource(R.drawable.pauses);
                }
                isPlaying21 = !isPlaying21;
            }
        });
    }
    public void audio22(View view)
    {
        MediaPlayer music22 = MediaPlayer.create(this, R.raw.fact22);
        button22.setImageResource(R.drawable.pauses);
        music22.start();
        isPlaying22=true;
        music22.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer music22) {
                button22.setImageResource(R.drawable.play);
            }
        });
        button22.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (isPlaying22) {
                    music22.pause();
                    button22.setImageResource(R.drawable.play);
                }else{
                    music22.start();
                    button22.setImageResource(R.drawable.pauses);
                }
                isPlaying22 = !isPlaying22;
            }
        });
    }
    public void audio23(View view)
    {
        MediaPlayer music23 = MediaPlayer.create(this, R.raw.fact23);
        button23.setImageResource(R.drawable.pauses);
        music23.start();
        isPlaying23=true;
        music23.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer music23) {
                button23.setImageResource(R.drawable.play);
            }
        });
        button23.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (isPlaying23) {
                    music23.pause();
                    button23.setImageResource(R.drawable.play);
                }else{
                    music23.start();
                    button23.setImageResource(R.drawable.pauses);
                }
                isPlaying23 = !isPlaying23;
            }
        });
    }
    public void audio24(View view)
    {
        MediaPlayer music24 = MediaPlayer.create(this, R.raw.fact24);
        button24.setImageResource(R.drawable.pauses);
        music24.start();
        isPlaying24=true;
        music24.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer music24) {
                button24.setImageResource(R.drawable.play);
            }
        });
        button24.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (isPlaying24) {
                    music24.pause();
                    button24.setImageResource(R.drawable.play);
                }else{
                    music24.start();
                    button24.setImageResource(R.drawable.pauses);
                }
                isPlaying24 = !isPlaying24;
            }
        });
    }
    public void audio25(View view)
    {
        MediaPlayer music25 = MediaPlayer.create(this, R.raw.fact25);
        button25.setImageResource(R.drawable.pauses);
        music25.start();
        isPlaying25=true;
        music25.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer music25) {
                button25.setImageResource(R.drawable.play);
            }
        });
        button25.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (isPlaying25) {
                    music25.pause();
                    button25.setImageResource(R.drawable.play);
                }else{
                    music25.start();
                    button25.setImageResource(R.drawable.pauses);
                }
                isPlaying25 = !isPlaying25;
            }
        });
    }
    public void audio26(View view)
    {
        MediaPlayer music26 = MediaPlayer.create(this, R.raw.fact26);
        button26.setImageResource(R.drawable.pauses);
        music26.start();
        isPlaying26=true;
        music26.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer music26) {
                button26.setImageResource(R.drawable.play);
            }
        });
        button26.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (isPlaying26) {
                    music26.pause();
                    button26.setImageResource(R.drawable.play);
                }else{
                    music26.start();
                    button26.setImageResource(R.drawable.pauses);
                }
                isPlaying26= !isPlaying26;
            }
        });
    }
    public void audio27(View view)
    {
        MediaPlayer music27 = MediaPlayer.create(this, R.raw.fact27);
        button27.setImageResource(R.drawable.pauses);
        music27.start();
        isPlaying27=true;
        music27.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer music27) {
                button27.setImageResource(R.drawable.play);
            }
        });
        button27.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (isPlaying27) {
                    music27.pause();
                    button27.setImageResource(R.drawable.play);
                }else{
                    music27.start();
                    button27.setImageResource(R.drawable.pauses);
                }
                isPlaying27 = !isPlaying27;
            }
        });
    }
    public void audio28(View view)
    {
        MediaPlayer music28 = MediaPlayer.create(this, R.raw.fact28);
        button28.setImageResource(R.drawable.pauses);
        music28.start();
        isPlaying28=true;
        music28.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer music28) {
                button28.setImageResource(R.drawable.play);
            }
        });
        button28.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (isPlaying28) {
                    music28.pause();
                    button28.setImageResource(R.drawable.play);
                }else{
                    music28.start();
                    button28.setImageResource(R.drawable.pauses);
                }
                isPlaying28 = !isPlaying28;
            }
        });
    }
    public void audio29(View view)
    {
        MediaPlayer music29 = MediaPlayer.create(this, R.raw.fact29);
        button29.setImageResource(R.drawable.pauses);
        music29.start();
        isPlaying29=true;
        music29.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer music29) {
                button29.setImageResource(R.drawable.play);
            }
        });
        button29.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (isPlaying29) {
                    music29.pause();
                    button29.setImageResource(R.drawable.play);
                }else{
                    music29.start();
                    button29.setImageResource(R.drawable.pauses);
                }
                isPlaying29 = !isPlaying29;
            }
        });
    }
    public void audio30(View view)
    {
        MediaPlayer music30 = MediaPlayer.create(this, R.raw.fact30);
        button30.setImageResource(R.drawable.pauses);
        music30.start();
        isPlaying30=true;
        music30.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer music30) {
                button30.setImageResource(R.drawable.play);
            }
        });
        button30.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (isPlaying30) {
                    music30.pause();
                    button30.setImageResource(R.drawable.play);
                }else{
                    music30.start();
                    button30.setImageResource(R.drawable.pauses);
                }
                isPlaying30 = !isPlaying30;
            }
        });
    }
    public void audio31(View view)
    {
        MediaPlayer music31 = MediaPlayer.create(this, R.raw.fact31);
        button31.setImageResource(R.drawable.pauses);
        music31.start();
        isPlaying31=true;
        music31.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer music31) {
                button31.setImageResource(R.drawable.play);
            }
        });
        button31.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (isPlaying31) {
                    music31.pause();
                    button31.setImageResource(R.drawable.play);
                }else{
                    music31.start();
                    button31.setImageResource(R.drawable.pauses);
                }
                isPlaying31 = !isPlaying31;
            }
        });
    }
    public void audio32(View view)
    {
        MediaPlayer music32 = MediaPlayer.create(this, R.raw.fact32);
        button32.setImageResource(R.drawable.pauses);
        music32.start();
        isPlaying32=true;
        music32.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer music32) {
                button32.setImageResource(R.drawable.play);
            }
        });
        button32.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (isPlaying32) {
                    music32.pause();
                    button32.setImageResource(R.drawable.play);
                }else{
                    music32.start();
                    button32.setImageResource(R.drawable.pauses);
                }
                isPlaying32 = !isPlaying32;
            }
        });
    }
    public void audio33(View view)
    {
        MediaPlayer music33 = MediaPlayer.create(this, R.raw.fact33);
        button33.setImageResource(R.drawable.pauses);
        music33.start();
        isPlaying33=true;
        music33.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer music33) {
                button33.setImageResource(R.drawable.play);
            }
        });
        button33.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (isPlaying33) {
                    music33.pause();
                    button33.setImageResource(R.drawable.play);
                }else{
                    music33.start();
                    button33.setImageResource(R.drawable.pauses);
                }
                isPlaying33 = !isPlaying33;
            }
        });
    }
    public void audio34(View view)
    {
        MediaPlayer music34 = MediaPlayer.create(this, R.raw.fact34);
        button34.setImageResource(R.drawable.pauses);
        music34.start();
        isPlaying34=true;
        music34.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer music34) {
                button34.setImageResource(R.drawable.play);
            }
        });
        button34.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (isPlaying34) {
                    music34.pause();
                    button34.setImageResource(R.drawable.play);
                }else{
                    music34.start();
                    button34.setImageResource(R.drawable.pauses);
                }
                isPlaying34 = !isPlaying34;
            }
        });
    }
    public void audio35(View view)
    {
        MediaPlayer music35 = MediaPlayer.create(this, R.raw.fact35);
        button35.setImageResource(R.drawable.pauses);
        music35.start();
        isPlaying35=true;
        music35.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer music35) {
                button35.setImageResource(R.drawable.play);
            }
        });
        button35.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (isPlaying35) {
                    music35.pause();
                    button35.setImageResource(R.drawable.play);
                }else{
                    music35.start();
                    button35.setImageResource(R.drawable.pauses);
                }
                isPlaying35 = !isPlaying35;
            }
        });
    }
    public void audio36(View view)
    {
        MediaPlayer music36 = MediaPlayer.create(this, R.raw.fact36);
        button36.setImageResource(R.drawable.pauses);
        music36.start();
        isPlaying36=true;
        music36.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer music36) {
                button36.setImageResource(R.drawable.play);
            }
        });
        button36.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (isPlaying36) {
                    music36.pause();
                    button36.setImageResource(R.drawable.play);
                }else{
                    music36.start();
                    button36.setImageResource(R.drawable.pauses);
                }
                isPlaying36 = !isPlaying36;
            }
        });
    }
    public void audio37(View view)
    {
        MediaPlayer music37 = MediaPlayer.create(this, R.raw.fact37);
        button37.setImageResource(R.drawable.pauses);
        music37.start();
        isPlaying37=true;
        music37.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer music37) {
                button37.setImageResource(R.drawable.play);
            }
        });
        button37.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (isPlaying37) {
                    music37.pause();
                    button37.setImageResource(R.drawable.play);
                }else{
                    music37.start();
                    button37.setImageResource(R.drawable.pauses);
                }
                isPlaying37 = !isPlaying37;
            }
        });
    }
    public void audio38(View view)
    {
        MediaPlayer music38 = MediaPlayer.create(this, R.raw.fact38);
        button38.setImageResource(R.drawable.pauses);
        music38.start();
        isPlaying38=true;
        music38.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer music38) {
                button38.setImageResource(R.drawable.play);
            }
        });
        button38.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (isPlaying38) {
                    music38.pause();
                    button38.setImageResource(R.drawable.play);
                }else{
                    music38.start();
                    button38.setImageResource(R.drawable.pauses);
                }
                isPlaying38 = !isPlaying38;
            }
        });
    }
    public void audio39(View view)
    {
        MediaPlayer music39 = MediaPlayer.create(this, R.raw.fact39);
        button39.setImageResource(R.drawable.pauses);
        music39.start();
        isPlaying39=true;
        music39.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer music39) {
                button39.setImageResource(R.drawable.play);
            }
        });
        button39.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (isPlaying39) {
                    music39.pause();
                    button39.setImageResource(R.drawable.play);
                }else{
                    music39.start();
                    button39.setImageResource(R.drawable.pauses);
                }
                isPlaying39 = !isPlaying39;
            }
        });
    }
    public void audio40(View view)
    {
        MediaPlayer music40 = MediaPlayer.create(this, R.raw.fact40);
        button40.setImageResource(R.drawable.pauses);
        music40.start();
        isPlaying40=true;
        music40.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer music40) {
                button40.setImageResource(R.drawable.play);
            }
        });
        button40.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (isPlaying40) {
                    music40.pause();
                    button40.setImageResource(R.drawable.play);
                }else{
                    music40.start();
                    button40.setImageResource(R.drawable.pauses);
                }
                isPlaying40 = !isPlaying40;
            }
        });
    }
    public void audio41(View view)
    {
        MediaPlayer music41 = MediaPlayer.create(this, R.raw.fact41);
        button41.setImageResource(R.drawable.pauses);
        music41.start();
        isPlaying41=true;
        music41.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer music41) {
                button41.setImageResource(R.drawable.play);
            }
        });
        button41.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (isPlaying41) {
                    music41.pause();
                    button41.setImageResource(R.drawable.play);
                }else{
                    music41.start();
                    button41.setImageResource(R.drawable.pauses);
                }
                isPlaying41 = !isPlaying41;
            }
        });
    }
    public void audio42(View view)
    {
        MediaPlayer music42 = MediaPlayer.create(this, R.raw.fact42);
        button42.setImageResource(R.drawable.pauses);
        music42.start();
        isPlaying42=true;
        music42.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer music42) {
                button42.setImageResource(R.drawable.play);
            }
        });
        button42.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (isPlaying42) {
                    music42.pause();
                    button42.setImageResource(R.drawable.play);
                }else{
                    music42.start();
                    button42.setImageResource(R.drawable.pauses);
                }
                isPlaying42 = !isPlaying42;
            }
        });
    }
    public void audio43(View view)
    {
        MediaPlayer music43 = MediaPlayer.create(this, R.raw.fact43);
        button43.setImageResource(R.drawable.pauses);
        music43.start();
        isPlaying43=true;
        music43.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer music43) {
                button43.setImageResource(R.drawable.play);
            }
        });
        button43.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (isPlaying43) {
                    music43.pause();
                    button43.setImageResource(R.drawable.play);
                }else{
                    music43.start();
                    button43.setImageResource(R.drawable.pauses);
                }
                isPlaying43 = !isPlaying43;
            }
        });
    }
    public void audio44(View view)
    {
        MediaPlayer music44 = MediaPlayer.create(this, R.raw.fact44);
        button44.setImageResource(R.drawable.pauses);
        music44.start();
        isPlaying44=true;
        music44.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer music44) {
                button44.setImageResource(R.drawable.play);
            }
        });
        button44.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (isPlaying44) {
                    music44.pause();
                    button44.setImageResource(R.drawable.play);
                }else{
                    music44.start();
                    button44.setImageResource(R.drawable.pauses);
                }
                isPlaying44 = !isPlaying44;
            }
        });
    }
    public void audio45(View view)
    {
        MediaPlayer music45 = MediaPlayer.create(this, R.raw.fact45);
        button45.setImageResource(R.drawable.pauses);
        music45.start();
        isPlaying45=true;
        music45.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer music45) {
                button45.setImageResource(R.drawable.play);
            }
        });
        button45.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (isPlaying45) {
                    music45.pause();
                    button45.setImageResource(R.drawable.play);
                }else{
                    music45.start();
                    button45.setImageResource(R.drawable.pauses);
                }
                isPlaying45 = !isPlaying45;
            }
        });
    }
    public void audio46(View view)
    {
        MediaPlayer music46 = MediaPlayer.create(this, R.raw.fact46);
        button46.setImageResource(R.drawable.pauses);
        music46.start();
        isPlaying46=true;
        music46.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer music46) {
                button46.setImageResource(R.drawable.play);
            }
        });
        button46.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (isPlaying46) {
                    music46.pause();
                    button46.setImageResource(R.drawable.play);
                }else{
                    music46.start();
                    button46.setImageResource(R.drawable.pauses);
                }
                isPlaying46= !isPlaying46;
            }
        });
    }
    public void audio47(View view)
    {
        MediaPlayer music47 = MediaPlayer.create(this, R.raw.fact47);
        button47.setImageResource(R.drawable.pauses);
        music47.start();
        isPlaying47=true;
        music47.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer music47) {
                button47.setImageResource(R.drawable.play);
            }
        });
        button47.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (isPlaying47) {
                    music47.pause();
                    button47.setImageResource(R.drawable.play);
                }else{
                    music47.start();
                    button47.setImageResource(R.drawable.pauses);
                }
                isPlaying47= !isPlaying47;
            }
        });
    }
    public void audio48(View view)
    {
        MediaPlayer music48 = MediaPlayer.create(this, R.raw.fact48);
        button48.setImageResource(R.drawable.pauses);
        music48.start();
        isPlaying48=true;
        music48.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer music48) {
                button48.setImageResource(R.drawable.play);
            }
        });
        button48.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (isPlaying48) {
                    music48.pause();
                    button48.setImageResource(R.drawable.play);
                }else{
                    music48.start();
                    button48.setImageResource(R.drawable.pauses);
                }
                isPlaying48= !isPlaying48;
            }
        });
    }
    public void audio49(View view)
    {
        MediaPlayer music49 = MediaPlayer.create(this, R.raw.fact49);
        button49.setImageResource(R.drawable.pauses);
        music49.start();
        isPlaying49=true;
        music49.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer music49) {
                button49.setImageResource(R.drawable.play);
            }
        });
        button49.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (isPlaying49) {
                    music49.pause();
                    button49.setImageResource(R.drawable.play);
                }else{
                    music49.start();
                    button49.setImageResource(R.drawable.pauses);
                }
                isPlaying49 = !isPlaying49;
            }
        });
    }
    public void audio50(View view)
    {
        MediaPlayer music50 = MediaPlayer.create(this, R.raw.fact50);
        button50.setImageResource(R.drawable.pauses);
        music50.start();
        isPlaying50=true;
        music50.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer music50) {
                button50.setImageResource(R.drawable.play);
            }
        });
        button50.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (isPlaying50) {
                    music50.pause();
                    button50.setImageResource(R.drawable.play);
                }else{
                    music50.start();
                    button50.setImageResource(R.drawable.pauses);
                }
                isPlaying50 = !isPlaying50;
            }
        });
    }
    public void audio51(View view)
    {
        MediaPlayer music51 = MediaPlayer.create(this, R.raw.fact51);
        button51.setImageResource(R.drawable.pauses);
        music51.start();
        isPlaying51=true;
        music51.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer music51) {
                button51.setImageResource(R.drawable.play);
            }
        });
        button51.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (isPlaying51) {
                    music51.pause();
                    button51.setImageResource(R.drawable.play);
                }else{
                    music51.start();
                    button51.setImageResource(R.drawable.pauses);
                }
                isPlaying51 = !isPlaying51;
            }
        });
    }
    public void audio52(View view)
    {
        MediaPlayer music52 = MediaPlayer.create(this, R.raw.fact52);
        button52.setImageResource(R.drawable.pauses);
        music52.start();
        isPlaying52=true;
        music52.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer music52) {
                button52.setImageResource(R.drawable.play);
            }
        });
        button52.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (isPlaying52) {
                    music52.pause();
                    button52.setImageResource(R.drawable.play);
                }else{
                    music52.start();
                    button52.setImageResource(R.drawable.pauses);
                }
                isPlaying52 = !isPlaying52;
            }
        });
    }
    public void audio53(View view)
    {
        MediaPlayer music53 = MediaPlayer.create(this, R.raw.fact53);
        button53.setImageResource(R.drawable.pauses);
        music53.start();
        isPlaying53=true;
        music53.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer music53) {
                button53.setImageResource(R.drawable.play);
            }
        });
        button53.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (isPlaying53) {
                    music53.pause();
                    button53.setImageResource(R.drawable.play);
                }else{
                    music53.start();
                    button53.setImageResource(R.drawable.pauses);
                }
                isPlaying53 = !isPlaying53;
            }
        });
    }
    public void audio54(View view)
    {
        MediaPlayer music54 = MediaPlayer.create(this, R.raw.fact54);
        button54.setImageResource(R.drawable.pauses);
        music54.start();
        isPlaying54=true;
        music54.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer music54) {
                button54.setImageResource(R.drawable.play);
            }
        });
        button54.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (isPlaying54) {
                    music54.pause();
                    button54.setImageResource(R.drawable.play);
                }else{
                    music54.start();
                    button54.setImageResource(R.drawable.pauses);
                }
                isPlaying54 = !isPlaying54;
            }
        });
    }
    public void audio55(View view)
    {
        MediaPlayer music55 = MediaPlayer.create(this, R.raw.fact55);
        button55.setImageResource(R.drawable.pauses);
        music55.start();
        isPlaying55=true;
        music55.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer music55) {
                button55.setImageResource(R.drawable.play);
            }
        });
        button55.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (isPlaying55) {
                    music55.pause();
                    button55.setImageResource(R.drawable.play);
                }else{
                    music55.start();
                    button55.setImageResource(R.drawable.pauses);
                }
                isPlaying55 = !isPlaying55;
            }
        });
    }
    public void audio56(View view)
    {
        MediaPlayer music56 = MediaPlayer.create(this, R.raw.fact56);
        button56.setImageResource(R.drawable.pauses);
        music56.start();
        isPlaying56=true;
        music56.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer music56) {
                button56.setImageResource(R.drawable.play);
            }
        });
        button56.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (isPlaying56) {
                    music56.pause();
                    button56.setImageResource(R.drawable.play);
                }else{
                    music56.start();
                    button56.setImageResource(R.drawable.pauses);
                }
                isPlaying56 = !isPlaying56;
            }
        });
    }
    public void audio57(View view)
    {
        MediaPlayer music57= MediaPlayer.create(this, R.raw.fact57);
        button57.setImageResource(R.drawable.pauses);
        music57.start();
        isPlaying57=true;
        music57.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer music57) {
                button57.setImageResource(R.drawable.play);
            }
        });
        button57.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (isPlaying57) {
                    music57.pause();
                    button57.setImageResource(R.drawable.play);
                }else{
                    music57.start();
                    button57.setImageResource(R.drawable.pauses);
                }
                isPlaying57 = !isPlaying57;
            }
        });
    }
    public void audio58(View view)
    {
        MediaPlayer music58 = MediaPlayer.create(this, R.raw.fact58);
        button58.setImageResource(R.drawable.pauses);
        music58.start();
        isPlaying58=true;
        music58.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer music58) {
                button58.setImageResource(R.drawable.play);
            }
        });
        button58.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (isPlaying58) {
                    music58.pause();
                    button58.setImageResource(R.drawable.play);
                }else{
                    music58.start();
                    button58.setImageResource(R.drawable.pauses);
                }
                isPlaying58 = !isPlaying58;
            }
        });
    }
    public void audio59(View view)
    {
        MediaPlayer music59 = MediaPlayer.create(this, R.raw.fact59);
        button59.setImageResource(R.drawable.pauses);
        music59.start();
        isPlaying59=true;
        music59.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer music59) {
                button59.setImageResource(R.drawable.play);
            }
        });
        button59.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (isPlaying59) {
                    music59.pause();
                    button59.setImageResource(R.drawable.play);
                }else{
                    music59.start();
                    button59.setImageResource(R.drawable.pauses);
                }
                isPlaying59= !isPlaying59;
            }
        });
    }
    public void audio60(View view)
    {
        MediaPlayer music60 = MediaPlayer.create(this, R.raw.fact60);
        button60.setImageResource(R.drawable.pauses);
        music60.start();
        isPlaying60=true;
        music60.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer music60) {
                button60.setImageResource(R.drawable.play);
            }
        });
        button60.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (isPlaying60) {
                    music60.pause();
                    button60.setImageResource(R.drawable.play);
                }else{
                    music60.start();
                    button60.setImageResource(R.drawable.pauses);
                }
                isPlaying60 = !isPlaying60;
            }
        });
    }
    public void audio61(View view)
    {
        MediaPlayer music61 = MediaPlayer.create(this, R.raw.fact61);
        button61.setImageResource(R.drawable.pauses);
        music61.start();
        isPlaying61=true;
        music61.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer music61) {
                button61.setImageResource(R.drawable.play);
            }
        });
        button61.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (isPlaying61) {
                    music61.pause();
                    button61.setImageResource(R.drawable.play);
                }else{
                    music61.start();
                    button61.setImageResource(R.drawable.pauses);
                }
                isPlaying61 = !isPlaying61;
            }
        });
    }
    public void audio62(View view)
    {
        MediaPlayer music62 = MediaPlayer.create(this, R.raw.fact62);
        button62.setImageResource(R.drawable.pauses);
        music62.start();
        isPlaying62=true;
        music62.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer music62) {
                button62.setImageResource(R.drawable.play);
            }
        });
        button62.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (isPlaying62) {
                    music62.pause();
                    button62.setImageResource(R.drawable.play);
                }else{
                    music62.start();
                    button62.setImageResource(R.drawable.pauses);
                }
                isPlaying62 = !isPlaying62;
            }
        });
    }
    public void audio63(View view)
    {
        MediaPlayer music63 = MediaPlayer.create(this, R.raw.fact63);
        button63.setImageResource(R.drawable.pauses);
        music63.start();
        isPlaying63=true;
        music63.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer music63) {
                button63.setImageResource(R.drawable.play);
            }
        });
        button63.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (isPlaying63) {
                    music63.pause();
                    button63.setImageResource(R.drawable.play);
                }else{
                    music63.start();
                    button63.setImageResource(R.drawable.pauses);
                }
                isPlaying63 = !isPlaying63;
            }
        });
    }
    public void audio64(View view)
    {
        MediaPlayer music64 = MediaPlayer.create(this, R.raw.fact64);
        button64.setImageResource(R.drawable.pauses);
        music64.start();
        isPlaying64=true;
        music64.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer music64) {
                button64.setImageResource(R.drawable.play);
            }
        });
        button64.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (isPlaying64) {
                    music64.pause();
                    button64.setImageResource(R.drawable.play);
                }else{
                    music64.start();
                    button64.setImageResource(R.drawable.pauses);
                }
                isPlaying64 = !isPlaying64;
            }
        });
    }
    public void audio65(View view)
    {
        MediaPlayer music65 = MediaPlayer.create(this, R.raw.fact65);
        button65.setImageResource(R.drawable.pauses);
        music65.start();
        isPlaying65=true;
        music65.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer music65) {
                button65.setImageResource(R.drawable.play);
            }
        });
        button65.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (isPlaying65) {
                    music65.pause();
                    button65.setImageResource(R.drawable.play);
                }else{
                    music65.start();
                    button65.setImageResource(R.drawable.pauses);
                }
                isPlaying65 = !isPlaying65;
            }
        });
    }
    public void audio66(View view)
    {
        MediaPlayer music66 = MediaPlayer.create(this, R.raw.fact66);
        button66.setImageResource(R.drawable.pauses);
        music66.start();
        isPlaying66=true;
        music66.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer music66) {
                button66.setImageResource(R.drawable.play);
            }
        });
        button66.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (isPlaying66) {
                    music66.pause();
                    button66.setImageResource(R.drawable.play);
                }else{
                    music66.start();
                    button66.setImageResource(R.drawable.pauses);
                }
                isPlaying66 = !isPlaying66;
            }
        });
    }
    public void audio67(View view)
    {
        MediaPlayer music67 = MediaPlayer.create(this, R.raw.fact67);
        button67.setImageResource(R.drawable.pauses);
        music67.start();
        isPlaying67=true;
        music67.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer music7) {
                button67.setImageResource(R.drawable.play);
            }
        });
        button67.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (isPlaying67) {
                    music67.pause();
                    button67.setImageResource(R.drawable.play);
                }else{
                    music67.start();
                    button67.setImageResource(R.drawable.pauses);
                }
                isPlaying67 = !isPlaying67;
            }
        });
    }
    public void audio68(View view)
    {
        MediaPlayer music68 = MediaPlayer.create(this, R.raw.fact68);
        button68.setImageResource(R.drawable.pauses);
        music68.start();
        isPlaying68=true;
        music68.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer music8) {
                button68.setImageResource(R.drawable.play);
            }
        });
        button68.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (isPlaying68) {
                    music68.pause();
                    button68.setImageResource(R.drawable.play);
                }else{
                    music68.start();
                    button68.setImageResource(R.drawable.pauses);
                }
                isPlaying68 = !isPlaying68;
            }
        });
    }
    public void audio69(View view)
    {
        MediaPlayer music69 = MediaPlayer.create(this, R.raw.fact69);
        button69.setImageResource(R.drawable.pauses);
        music69.start();
        isPlaying69=true;
        music69.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer music9) {
                button69.setImageResource(R.drawable.play);
            }
        });
        button69.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (isPlaying69) {
                    music69.pause();
                    button69.setImageResource(R.drawable.play);
                }else{
                    music69.start();
                    button69.setImageResource(R.drawable.pauses);
                }
                isPlaying69 = !isPlaying69;
            }
        });
    }
    public void audio70(View view)
    {
        MediaPlayer music70 = MediaPlayer.create(this, R.raw.fact70);
        button70.setImageResource(R.drawable.pauses);
        music70.start();
        isPlaying70=true;
        music70.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer music70) {
                button70.setImageResource(R.drawable.play);
            }
        });
        button70.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (isPlaying70) {
                    music70.pause();
                    button70.setImageResource(R.drawable.play);
                }else{
                    music70.start();
                    button70.setImageResource(R.drawable.pauses);
                }
                isPlaying70 = !isPlaying70;
            }
        });
    }
    public void audio71(View view)
    {
        MediaPlayer music71 = MediaPlayer.create(this, R.raw.fact71);
        button71.setImageResource(R.drawable.pauses);
        music71.start();
        isPlaying71=true;
        music71.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer music71) {
                button71.setImageResource(R.drawable.play);
            }
        });
        button71.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (isPlaying71) {
                    music71.pause();
                    button71.setImageResource(R.drawable.play);
                }else{
                    music71.start();
                    button71.setImageResource(R.drawable.pauses);
                }
                isPlaying71 = !isPlaying71;
            }
        });
    }
    public void audio72(View view)
    {
        MediaPlayer music72 = MediaPlayer.create(this, R.raw.fact72);
        button72.setImageResource(R.drawable.pauses);
        music72.start();
        isPlaying72=true;
        music72.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer music12) {
                button72.setImageResource(R.drawable.play);
            }
        });
        button72.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (isPlaying72) {
                    music72.pause();
                    button72.setImageResource(R.drawable.play);
                }else{
                    music72.start();
                    button72.setImageResource(R.drawable.pauses);
                }
                isPlaying72 = !isPlaying72;
            }
        });
    }
    public void audio73(View view)
    {
        MediaPlayer music73 = MediaPlayer.create(this, R.raw.fact73);
        button73.setImageResource(R.drawable.pauses);
        music73.start();
        isPlaying73=true;
        music73.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer music73) {
                button73.setImageResource(R.drawable.play);
            }
        });
        button73.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (isPlaying73) {
                    music73.pause();
                    button73.setImageResource(R.drawable.play);
                }else{
                    music73.start();
                    button73.setImageResource(R.drawable.pauses);
                }
                isPlaying73 = !isPlaying73;
            }
        });
    }
    public void audio74(View view)
    {
        MediaPlayer music74 = MediaPlayer.create(this, R.raw.fact74);
        button74.setImageResource(R.drawable.pauses);
        music74.start();
        isPlaying74=true;
        music74.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer music11) {
                button74.setImageResource(R.drawable.play);
            }
        });
        button74.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (isPlaying74) {
                    music74.pause();
                    button74.setImageResource(R.drawable.play);
                }else{
                    music74.start();
                    button74.setImageResource(R.drawable.pauses);
                }
                isPlaying74 = !isPlaying74;
            }
        });
    }
    public void audio75(View view)
    {
        MediaPlayer music75 = MediaPlayer.create(this, R.raw.fact75);
        button75.setImageResource(R.drawable.pauses);
        music75.start();
        isPlaying75=true;
        music75.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer music75) {
                button75.setImageResource(R.drawable.play);
            }
        });
        button75.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (isPlaying75) {
                    music75.pause();
                    button75.setImageResource(R.drawable.play);
                }else{
                    music75.start();
                    button75.setImageResource(R.drawable.pauses);
                }
                isPlaying75 = !isPlaying75;
            }
        });
    }








    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home) {
            onBackPressed();
        }

        return super.onOptionsItemSelected(item);
    }
}
