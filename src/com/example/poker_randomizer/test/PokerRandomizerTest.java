package com.example.poker_randomizer.test;

import java.util.ArrayList;
import java.util.List;

import android.test.ActivityInstrumentationTestCase2;

import com.example.poker_randomizer.HandResulter;
import com.example.poker_randomizer.MainActivity;
import com.example.poker_randomizer.ResultHand;
import com.example.poker_randomizer.Util;

public class PokerRandomizerTest extends
		ActivityInstrumentationTestCase2<MainActivity> {

	private MainActivity mActivity;
	HandResulter hand_resulter;

	public PokerRandomizerTest() {
		super(MainActivity.class);

	}

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		mActivity = getActivity();
		hand_resulter = new HandResulter(mActivity.getBaseContext());

	}

	public void testResulting() {
		hand_resulter.addCardBoard("h2");
		hand_resulter.addCardBoard("c9");
		hand_resulter.addCardBoard("hj");
		hand_resulter.addCardBoard("c4");
		hand_resulter.addCardBoard("cq");

		hand_resulter.addCardPlayer(1, "cj");
		hand_resulter.addCardPlayer(1, "s8");

		hand_resulter.addCardPlayer(2, "s2");
		hand_resulter.addCardPlayer(2, "dx");

		mActivity.setHand_resulter(hand_resulter);

		// prepare the needed variables to launch resultting
		ResultHand resultplayer1 = mActivity.getHand_resulter().getResult("1");
		ResultHand resultplayer2 = mActivity.getHand_resulter().getResult("2");

		int totalScore1 = Integer.valueOf(resultplayer1.getTypeHand());
		int totalScore2 = Integer.valueOf(resultplayer2.getTypeHand());

		List<Integer> playerLayouts = new ArrayList<Integer>();
		playerLayouts.add(1);
		playerLayouts.add(2);

		List<Integer> lTotalScore;
		List<ResultHand> lResultHand;

		// Check if player1 has won, to store the result in the
		// hand_recorder
		//
		// // save the totalScore in a vector to check
		lTotalScore = Util.buildIntegerArrays(totalScore1, totalScore2);
		lResultHand = Util.buildIntegerArrays(resultplayer1, resultplayer2);
		// Once u know the highest hand, check who it belongs to
		int winner = mActivity.getAndHighLightWinner(playerLayouts,
				lTotalScore, lResultHand, HandResulter.FIRST_STAGE);

		assertEquals(0, winner);

	}
	
	public void testResultingSameHandDiffKicker() {
		hand_resulter.addCardBoard("h2");
		hand_resulter.addCardBoard("c9");
		hand_resulter.addCardBoard("hj");
		hand_resulter.addCardBoard("ck");
		hand_resulter.addCardBoard("cq");

		hand_resulter.addCardPlayer(1, "cj");
		hand_resulter.addCardPlayer(1, "s8");

		hand_resulter.addCardPlayer(2, "dj");
		hand_resulter.addCardPlayer(2, "h3");

		mActivity.setHand_resulter(hand_resulter);

		// prepare the needed variables to launch resultting
		ResultHand resultplayer1 = mActivity.getHand_resulter().getResult("1");
		ResultHand resultplayer2 = mActivity.getHand_resulter().getResult("2");

		int totalScore1 = Integer.valueOf(resultplayer1.getTypeHand());
		int totalScore2 = Integer.valueOf(resultplayer2.getTypeHand());

		List<Integer> playerLayouts = new ArrayList<Integer>();
		playerLayouts.add(1);
		playerLayouts.add(2);

		List<Integer> lTotalScore;
		List<ResultHand> lResultHand;

		// Check if player1 has won, to store the result in the
		// hand_recorder
		//
		// // save the totalScore in a vector to check
		lTotalScore = Util.buildIntegerArrays(totalScore1, totalScore2);
		lResultHand = Util.buildIntegerArrays(resultplayer1, resultplayer2);
		// Once u know the highest hand, check who it belongs to
		int winner = mActivity.getAndHighLightWinner(playerLayouts,
				lTotalScore, lResultHand, HandResulter.FIRST_STAGE);

		assertEquals(0, winner);

	}
	
	public void testResultingPoker() {
		hand_resulter.addCardBoard("h2");
		hand_resulter.addCardBoard("c2");
		hand_resulter.addCardBoard("hj");
		hand_resulter.addCardBoard("ck");
		hand_resulter.addCardBoard("cq");

		hand_resulter.addCardPlayer(1, "s2");
		hand_resulter.addCardPlayer(1, "d2");

		hand_resulter.addCardPlayer(2, "dj");
		hand_resulter.addCardPlayer(2, "h3");

		mActivity.setHand_resulter(hand_resulter);

		// prepare the needed variables to launch resultting
		ResultHand resultplayer1 = mActivity.getHand_resulter().getResult("1");
		ResultHand resultplayer2 = mActivity.getHand_resulter().getResult("2");

		int totalScore1 = Integer.valueOf(resultplayer1.getTypeHand());
		int totalScore2 = Integer.valueOf(resultplayer2.getTypeHand());

		List<Integer> playerLayouts = new ArrayList<Integer>();
		playerLayouts.add(1);
		playerLayouts.add(2);

		List<Integer> lTotalScore;
		List<ResultHand> lResultHand;

		// Check if player1 has won, to store the result in the
		// hand_recorder
		//
		// // save the totalScore in a vector to check
		lTotalScore = Util.buildIntegerArrays(totalScore1, totalScore2);
		lResultHand = Util.buildIntegerArrays(resultplayer1, resultplayer2);
		// Once u know the highest hand, check who it belongs to
		int winner = mActivity.getAndHighLightWinner(playerLayouts,
				lTotalScore, lResultHand, HandResulter.FIRST_STAGE);

		assertEquals(0, winner);

	}
	
	public void testResultingFull() {
		hand_resulter.addCardBoard("h2");
		hand_resulter.addCardBoard("c2");
		hand_resulter.addCardBoard("h8");
		hand_resulter.addCardBoard("ck");
		hand_resulter.addCardBoard("cq");

		hand_resulter.addCardPlayer(1, "s2");
		hand_resulter.addCardPlayer(1, "d8");

		hand_resulter.addCardPlayer(2, "dj");
		hand_resulter.addCardPlayer(2, "h3");

		mActivity.setHand_resulter(hand_resulter);

		// prepare the needed variables to launch resultting
		ResultHand resultplayer1 = mActivity.getHand_resulter().getResult("1");
		ResultHand resultplayer2 = mActivity.getHand_resulter().getResult("2");

		int totalScore1 = Integer.valueOf(resultplayer1.getTypeHand());
		int totalScore2 = Integer.valueOf(resultplayer2.getTypeHand());

		List<Integer> playerLayouts = new ArrayList<Integer>();
		playerLayouts.add(1);
		playerLayouts.add(2);

		List<Integer> lTotalScore;
		List<ResultHand> lResultHand;

		// Check if player1 has won, to store the result in the
		// hand_recorder
		//
		// // save the totalScore in a vector to check
		lTotalScore = Util.buildIntegerArrays(totalScore1, totalScore2);
		lResultHand = Util.buildIntegerArrays(resultplayer1, resultplayer2);
		// Once u know the highest hand, check who it belongs to
		int winner = mActivity.getAndHighLightWinner(playerLayouts,
				lTotalScore, lResultHand, HandResulter.FIRST_STAGE);

		assertEquals(0, winner);

	}
	
	public void testResultingStraigth() {
		hand_resulter.addCardBoard("ha");
		hand_resulter.addCardBoard("c2");
		hand_resulter.addCardBoard("h3");
		hand_resulter.addCardBoard("ck");
		hand_resulter.addCardBoard("cq");

		hand_resulter.addCardPlayer(1, "s4");
		hand_resulter.addCardPlayer(1, "d5");

		hand_resulter.addCardPlayer(2, "dj");
		hand_resulter.addCardPlayer(2, "h3");

		mActivity.setHand_resulter(hand_resulter);

		// prepare the needed variables to launch resultting
		ResultHand resultplayer1 = mActivity.getHand_resulter().getResult("1");
		ResultHand resultplayer2 = mActivity.getHand_resulter().getResult("2");

		int totalScore1 = Integer.valueOf(resultplayer1.getTypeHand());
		int totalScore2 = Integer.valueOf(resultplayer2.getTypeHand());

		List<Integer> playerLayouts = new ArrayList<Integer>();
		playerLayouts.add(1);
		playerLayouts.add(2);

		List<Integer> lTotalScore;
		List<ResultHand> lResultHand;

		// Check if player1 has won, to store the result in the
		// hand_recorder
		//
		// // save the totalScore in a vector to check
		lTotalScore = Util.buildIntegerArrays(totalScore1, totalScore2);
		lResultHand = Util.buildIntegerArrays(resultplayer1, resultplayer2);
		// Once u know the highest hand, check who it belongs to
		int winner = mActivity.getAndHighLightWinner(playerLayouts,
				lTotalScore, lResultHand, HandResulter.FIRST_STAGE);

		assertEquals(0, winner);

	}
	
	public void testResultingFlush() {
		hand_resulter.addCardBoard("ha");
		hand_resulter.addCardBoard("h2");
		hand_resulter.addCardBoard("h3");
		hand_resulter.addCardBoard("ck");
		hand_resulter.addCardBoard("cq");

		hand_resulter.addCardPlayer(1, "s6");
		hand_resulter.addCardPlayer(1, "d5");

		hand_resulter.addCardPlayer(2, "hj");
		hand_resulter.addCardPlayer(2, "hq");

		mActivity.setHand_resulter(hand_resulter);

		// prepare the needed variables to launch resultting
		ResultHand resultplayer1 = mActivity.getHand_resulter().getResult("1");
		ResultHand resultplayer2 = mActivity.getHand_resulter().getResult("2");

		int totalScore1 = Integer.valueOf(resultplayer1.getTypeHand());
		int totalScore2 = Integer.valueOf(resultplayer2.getTypeHand());

		List<Integer> playerLayouts = new ArrayList<Integer>();
		playerLayouts.add(1);
		playerLayouts.add(2);

		List<Integer> lTotalScore;
		List<ResultHand> lResultHand;

		// Check if player1 has won, to store the result in the
		// hand_recorder
		//
		// // save the totalScore in a vector to check
		lTotalScore = Util.buildIntegerArrays(totalScore1, totalScore2);
		lResultHand = Util.buildIntegerArrays(resultplayer1, resultplayer2);
		// Once u know the highest hand, check who it belongs to
		int winner = mActivity.getAndHighLightWinner(playerLayouts,
				lTotalScore, lResultHand, HandResulter.FIRST_STAGE);

		assertEquals(1, winner);

	}


}
