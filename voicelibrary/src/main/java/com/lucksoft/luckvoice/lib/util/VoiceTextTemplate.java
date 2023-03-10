package com.lucksoft.luckvoice.lib.util;

import static com.lucksoft.luckvoice.lib.util.VoiceCons.A;
import static com.lucksoft.luckvoice.lib.util.VoiceCons.B;
import static com.lucksoft.luckvoice.lib.util.VoiceCons.C;
import static com.lucksoft.luckvoice.lib.util.VoiceCons.CHAIYOU;
import static com.lucksoft.luckvoice.lib.util.VoiceCons.CNG;
import static com.lucksoft.luckvoice.lib.util.VoiceCons.D;
import static com.lucksoft.luckvoice.lib.util.VoiceCons.DIAN;
import static com.lucksoft.luckvoice.lib.util.VoiceCons.E;
import static com.lucksoft.luckvoice.lib.util.VoiceCons.F;
import static com.lucksoft.luckvoice.lib.util.VoiceCons.G;
import static com.lucksoft.luckvoice.lib.util.VoiceCons.GONGJIN;
import static com.lucksoft.luckvoice.lib.util.VoiceCons.H;
import static com.lucksoft.luckvoice.lib.util.VoiceCons.HAO;
import static com.lucksoft.luckvoice.lib.util.VoiceCons.HAOQIANG;
import static com.lucksoft.luckvoice.lib.util.VoiceCons.I;
import static com.lucksoft.luckvoice.lib.util.VoiceCons.J;
import static com.lucksoft.luckvoice.lib.util.VoiceCons.JIFENDIKOU;
import static com.lucksoft.luckvoice.lib.util.VoiceCons.JIN;
import static com.lucksoft.luckvoice.lib.util.VoiceCons.K;
import static com.lucksoft.luckvoice.lib.util.VoiceCons.L;
import static com.lucksoft.luckvoice.lib.util.VoiceCons.LIFANG;
import static com.lucksoft.luckvoice.lib.util.VoiceCons.LNG;
import static com.lucksoft.luckvoice.lib.util.VoiceCons.M;
import static com.lucksoft.luckvoice.lib.util.VoiceCons.N;
import static com.lucksoft.luckvoice.lib.util.VoiceCons.NIYOUYIBIXINDINGDAN;

import static com.lucksoft.luckvoice.lib.util.VoiceCons.NUMBER_EIGHT;
import static com.lucksoft.luckvoice.lib.util.VoiceCons.NUMBER_FIVE;
import static com.lucksoft.luckvoice.lib.util.VoiceCons.NUMBER_FOUR;
import static com.lucksoft.luckvoice.lib.util.VoiceCons.NUMBER_NINE;
import static com.lucksoft.luckvoice.lib.util.VoiceCons.NUMBER_ONE;
import static com.lucksoft.luckvoice.lib.util.VoiceCons.NUMBER_SEVEN;
import static com.lucksoft.luckvoice.lib.util.VoiceCons.NUMBER_SIX;
import static com.lucksoft.luckvoice.lib.util.VoiceCons.NUMBER_THREE;
import static com.lucksoft.luckvoice.lib.util.VoiceCons.NUMBER_TWO;
import static com.lucksoft.luckvoice.lib.util.VoiceCons.NUMBER_ZERO;
import static com.lucksoft.luckvoice.lib.util.VoiceCons.O;
import static com.lucksoft.luckvoice.lib.util.VoiceCons.P;
import static com.lucksoft.luckvoice.lib.util.VoiceCons.Q;
import static com.lucksoft.luckvoice.lib.util.VoiceCons.QINGQUCAN;
import static com.lucksoft.luckvoice.lib.util.VoiceCons.QINGZHUNBEIJIUCAN;
import static com.lucksoft.luckvoice.lib.util.VoiceCons.QIYOU;
import static com.lucksoft.luckvoice.lib.util.VoiceCons.R;
import static com.lucksoft.luckvoice.lib.util.VoiceCons.S;
import static com.lucksoft.luckvoice.lib.util.VoiceCons.SHENG;
import static com.lucksoft.luckvoice.lib.util.VoiceCons.SHOUKUAN;
import static com.lucksoft.luckvoice.lib.util.VoiceCons.SHOUYIN;
import static com.lucksoft.luckvoice.lib.util.VoiceCons.T;
import static com.lucksoft.luckvoice.lib.util.VoiceCons.U;
import static com.lucksoft.luckvoice.lib.util.VoiceCons.UNIT_HUNDRED;
import static com.lucksoft.luckvoice.lib.util.VoiceCons.UNIT_HUNDREDMILLION;
import static com.lucksoft.luckvoice.lib.util.VoiceCons.UNIT_TEN;
import static com.lucksoft.luckvoice.lib.util.VoiceCons.UNIT_TENTHOUSAND;
import static com.lucksoft.luckvoice.lib.util.VoiceCons.UNIT_THOUSAND;
import static com.lucksoft.luckvoice.lib.util.VoiceCons.V;
import static com.lucksoft.luckvoice.lib.util.VoiceCons.W;
import static com.lucksoft.luckvoice.lib.util.VoiceCons.WEIXIN;
import static com.lucksoft.luckvoice.lib.util.VoiceCons.X;
import static com.lucksoft.luckvoice.lib.util.VoiceCons.XIANJIN;
import static com.lucksoft.luckvoice.lib.util.VoiceCons.Y;
import static com.lucksoft.luckvoice.lib.util.VoiceCons.YINHANGKA;
import static com.lucksoft.luckvoice.lib.util.VoiceCons.YOUHUI;
import static com.lucksoft.luckvoice.lib.util.VoiceCons.YUAN;
import static com.lucksoft.luckvoice.lib.util.VoiceCons.YUE;
import static com.lucksoft.luckvoice.lib.util.VoiceCons.Z;
import static com.lucksoft.luckvoice.lib.util.VoiceCons.ZHIFU;
import static com.lucksoft.luckvoice.lib.util.VoiceCons.ZHIFUBAO;

import android.text.TextUtils;
import android.util.Log;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Time???2023/2/18
 * Author???feng
 * Description???
 */
public class VoiceTextTemplate {
    private static HashMap<String,String> voiceCharacterList;
    private static HashMap<String,Long> delayTimeList;//????????????

    public static HashMap<String, Long> getDelayTimeList() {
        return delayTimeList;
    }

    public static List<String> getVoiceList(ArrayList<String> inputList, boolean haveMoney) {
        initVoiceConsList();
        List<String> voiceList = new ArrayList<>();
        if (inputList == null) return voiceList;
        for (String input : inputList) {
            if (TextUtils.isEmpty(input)) continue;
            if (StringUtil.isNumber(input)) {
                //????????? ??????????????????????????????
                if (haveMoney) {
                    voiceList.addAll(genReadableMoney(input));
                } else {
                    voiceList.addAll(createReadableNumList(input));
                }
            } else if (StringUtil.isLetter(input)) {
                //?????????
                voiceList.addAll(getLetters(input));
            } else {
                //??????voiceCharacterList
                checkCharacterList(input,voiceList,haveMoney);
            }
        }
        Log.d("VoiceTextTemplate", voiceList.toString());
        return voiceList;
    }

    private static void checkCharacterList(String s, List<String> voiceList, boolean haveMoney){
        for (int i = s.length() ;i > 0 ;i --){
            String substring = s.substring(0,i);
            Log.d("VoiceTextTemplate", "?????????????????????"+substring);
            if (StringUtil.isNumber(substring)){
                Log.d("VoiceTextTemplate", "?????????????????????"+substring);
                //????????????????????????????????????
                if (haveMoney) {
                    voiceList.addAll(genReadableMoney(substring));
                } else {
                    voiceList.addAll(createReadableNumList(substring));
                }
                if (!substring.equals(s)){
                    checkCharacterList(s.substring(i),voiceList, haveMoney);
                }
                return;
            }else if (voiceCharacterList.containsKey(substring) ){
                Log.d("VoiceTextTemplate", "???????????????"+substring);
                voiceList.add(voiceCharacterList.get(substring));
                if (!substring.equals(s)){
                    checkCharacterList(s.substring(i),voiceList, haveMoney);
                }
                return;
            } else if (voiceCharacterList.containsValue(substring)){
                Log.d("VoiceTextTemplate", "???????????????"+substring);
                voiceList.add(substring);
                if (!substring.equals(s)){
                    checkCharacterList(s.substring(i),voiceList, haveMoney);
                }
                return;
            }
        }
        //????????????????????????????????????????????????????????????????????????
        if (!TextUtils.isEmpty(s) && s.length()>1){
            String substring = s.substring(1);
            Log.d("VoiceTextTemplate", "??????????????????????????????"+substring);
            checkCharacterList(substring,voiceList, haveMoney);
        }
        Log.d("VoiceTextTemplate", "????????????????????????"+s);
    }

    private static List<String> getLetters(String input) {
        List<String> voiceList = new ArrayList<>();
        int len = input.length();
        for (int i = 0; i < len; i++) {
            char current = input.charAt(i);
            voiceList.add(current + "_");
        }
        return voiceList;
    }

    /**
     * ????????? ?????? RMB
     *
     * @param input
     * @return
     */
    private static List<String> genReadableMoney(String input) {
        List<String> voiceList = new ArrayList<>();
        if (input.contains(".")) {
            String integerPart = input.split("\\.")[0];
            String decimalPart = input.split("\\.")[1];
            List<String> intList = readIntPart(integerPart);
            List<String> decimalList = readDecimalPart(decimalPart);
            voiceList.addAll(intList);
            if (!decimalList.isEmpty()) {
                voiceList.add(DIAN);
                voiceList.addAll(decimalList);
            }
        } else {
            voiceList.addAll(readIntPart(input));
        }
        return voiceList;
    }

    private static List<String> readDecimalPart(String decimalPart) {
        List<String> result = new ArrayList<>();
        if (!"00".equals(decimalPart)) {
            char[] chars = decimalPart.toCharArray();
            for (char ch : chars) {
                result.add(ch + "_");
            }
        }
        return result;
    }

    /**
     * ???????????????
     *
     * @param numString
     * @return
     */
    private static List<String> createReadableNumList(String numString) {
        List<String> result = new ArrayList<>();
        if (!TextUtils.isEmpty(numString)) {
            int len = numString.length();
            for (int i = 0; i < len; i++) {
                if ('.' == numString.charAt(i)) {
                    result.add(DIAN);
                } else {
                    result.add(numString.charAt(i) + "_");
                }
            }
        }
        return result;
    }

    /**
     * ???????????????????????????
     *
     * @param integerPart
     * @return
     */
    private static List<String> readIntPart(String integerPart) {
        List<String> result = new ArrayList<>();
        String intString = MoneyUtils.readInt(Integer.parseInt(integerPart));
        int len = intString.length();
        for (int i = 0; i < len; i++) {
            char current = intString.charAt(i);
            if (current == '???') {
                result.add(UNIT_TEN);
            } else if (current == '???') {
                result.add(UNIT_HUNDRED);
            } else if (current == '???') {
                result.add(UNIT_THOUSAND);
            } else if (current == '???') {
                result.add(UNIT_TENTHOUSAND);
            } else if (current == '???') {
                result.add(UNIT_HUNDREDMILLION);
            } else {
                result.add(current + "_");
            }
        }
        return result;
    }

    private static void initVoiceConsList() {

        if (voiceCharacterList == null){
            delayTimeList = new HashMap<>();
            voiceCharacterList = new HashMap<>();
            delayTimeList.put(UNIT_TEN, 440L);
            voiceCharacterList.put("???",UNIT_TEN);
            voiceCharacterList.put("???",UNIT_TEN);
            delayTimeList.put(UNIT_HUNDRED, 400L);
            voiceCharacterList.put("???",UNIT_HUNDRED);
            voiceCharacterList.put("???",UNIT_HUNDRED);
            delayTimeList.put(UNIT_THOUSAND, 390L);
            voiceCharacterList.put("???",UNIT_THOUSAND);
            voiceCharacterList.put("???",UNIT_THOUSAND);
            delayTimeList.put(UNIT_TENTHOUSAND, 390L);
            voiceCharacterList.put("???",UNIT_TENTHOUSAND);
            delayTimeList.put(UNIT_HUNDREDMILLION, 390L);
            voiceCharacterList.put("???",UNIT_HUNDREDMILLION);
            delayTimeList.put(CNG, 700L);
            voiceCharacterList.put("cng",CNG);
            voiceCharacterList.put("CNG",CNG);
            delayTimeList.put(LNG, 700L);
            voiceCharacterList.put("lng",LNG);
            voiceCharacterList.put("LNG",LNG);
            delayTimeList.put(CHAIYOU, 600L);
            voiceCharacterList.put("??????",CHAIYOU);
            delayTimeList.put(DIAN, 240L);
            voiceCharacterList.put(".",DIAN);
            voiceCharacterList.put("???",DIAN);
            delayTimeList.put(GONGJIN, 500L);
            voiceCharacterList.put("??????",GONGJIN);
            delayTimeList.put(HAO, 260L);
            voiceCharacterList.put("???",HAO);
            delayTimeList.put(HAOQIANG, 900L);
            voiceCharacterList.put("??????",HAOQIANG);
            delayTimeList.put(JIFENDIKOU, 800L);
            voiceCharacterList.put("????????????",JIFENDIKOU);
            delayTimeList.put(JIN, 350L);
            voiceCharacterList.put("???",JIN);
            delayTimeList.put(LIFANG, 400L);
            voiceCharacterList.put("??????",LIFANG);
            delayTimeList.put(NIYOUYIBIXINDINGDAN, 1300L);
            voiceCharacterList.put("?????????????????????",NIYOUYIBIXINDINGDAN);
            delayTimeList.put(QIYOU, 500L);
            voiceCharacterList.put("??????",QIYOU);
            delayTimeList.put(QINGQUCAN, 700L);
            voiceCharacterList.put("?????????",QINGQUCAN);
            delayTimeList.put(QINGZHUNBEIJIUCAN, 1000L);
            voiceCharacterList.put("???????????????",QINGZHUNBEIJIUCAN);
            delayTimeList.put(SHENG, 260L);
            voiceCharacterList.put("???",SHENG);
            delayTimeList.put(SHOUKUAN, 400L);
            voiceCharacterList.put("??????",SHOUKUAN);
            delayTimeList.put(SHOUYIN, 460L);
            voiceCharacterList.put("??????",SHOUYIN);
            delayTimeList.put(WEIXIN, 460L);
            voiceCharacterList.put("??????",WEIXIN);
            delayTimeList.put(XIANJIN, 440L);
            voiceCharacterList.put("??????",XIANJIN);
            delayTimeList.put(YINHANGKA, 600L);
            voiceCharacterList.put("?????????",YINHANGKA);
            delayTimeList.put(YOUHUI, 400L);
            voiceCharacterList.put("??????",YOUHUI);
            delayTimeList.put(YUE, 460L);
            voiceCharacterList.put("??????",YUE);
            delayTimeList.put(YUAN, 400L);
            voiceCharacterList.put("???",YUAN);
            delayTimeList.put(ZHIFU, 500L);
            voiceCharacterList.put("??????",ZHIFU);
            delayTimeList.put(ZHIFUBAO, 550L);
            voiceCharacterList.put("?????????",ZHIFUBAO);
            delayTimeList.put(NUMBER_ZERO, 250L);
            voiceCharacterList.put("0",NUMBER_ZERO);
            voiceCharacterList.put("???",NUMBER_ZERO);
            delayTimeList.put(NUMBER_ONE, 360L);
            voiceCharacterList.put("1",NUMBER_ONE);
            voiceCharacterList.put("???",NUMBER_ONE);
            voiceCharacterList.put("???",NUMBER_ONE);
            delayTimeList.put(NUMBER_TWO, 360L);
            voiceCharacterList.put("2",NUMBER_TWO);
            voiceCharacterList.put("???",NUMBER_TWO);
            voiceCharacterList.put("???",NUMBER_TWO);
            delayTimeList.put(NUMBER_THREE, 400L);
            voiceCharacterList.put("3",NUMBER_THREE);
            voiceCharacterList.put("???",NUMBER_THREE);
            voiceCharacterList.put("???",NUMBER_THREE);
            delayTimeList.put(NUMBER_FOUR, 430L);
            voiceCharacterList.put("4",NUMBER_FOUR);
            voiceCharacterList.put("???",NUMBER_FOUR);
            voiceCharacterList.put("???",NUMBER_FOUR);
            delayTimeList.put(NUMBER_FIVE, 400L);
            voiceCharacterList.put("5",NUMBER_FIVE);
            voiceCharacterList.put("???",NUMBER_FIVE);
            voiceCharacterList.put("???",NUMBER_FIVE);
            delayTimeList.put(NUMBER_SIX, 400L);
            voiceCharacterList.put("6",NUMBER_SIX);
            voiceCharacterList.put("???",NUMBER_SIX);
            voiceCharacterList.put("???",NUMBER_SIX);
            delayTimeList.put(NUMBER_SEVEN, 400L);
            voiceCharacterList.put("7",NUMBER_SEVEN);
            voiceCharacterList.put("???",NUMBER_SEVEN);
            voiceCharacterList.put("???",NUMBER_SEVEN);
            delayTimeList.put(NUMBER_EIGHT, 400L);
            voiceCharacterList.put("8",NUMBER_EIGHT);
            voiceCharacterList.put("???",NUMBER_EIGHT);
            voiceCharacterList.put("???",NUMBER_EIGHT);
            delayTimeList.put(NUMBER_NINE, 400L);
            voiceCharacterList.put("9",NUMBER_NINE);
            voiceCharacterList.put("???",NUMBER_NINE);
            voiceCharacterList.put("???",NUMBER_NINE);
            delayTimeList.put(A, 260L);
            voiceCharacterList.put("a",A);
            voiceCharacterList.put("A",A);
            delayTimeList.put(B, 260L);
            voiceCharacterList.put("b",B);
            voiceCharacterList.put("B",B);
            delayTimeList.put(C, 260L);
            voiceCharacterList.put("c",C);
            voiceCharacterList.put("C",C);
            delayTimeList.put(D, 260L);
            voiceCharacterList.put("d",D);
            voiceCharacterList.put("D",D);
            delayTimeList.put(E, 260L);
            voiceCharacterList.put("E",E);
            voiceCharacterList.put("e",E);
            delayTimeList.put(F, 300L);
            voiceCharacterList.put("f",F);
            voiceCharacterList.put("F",F);
            delayTimeList.put(G, 260L);
            voiceCharacterList.put("g",G);
            voiceCharacterList.put("G",G);
            delayTimeList.put(H, 360L);
            voiceCharacterList.put("h",H);
            voiceCharacterList.put("H",H);
            delayTimeList.put(I, 260L);
            voiceCharacterList.put("i",I);
            voiceCharacterList.put("I",I);
            delayTimeList.put(J, 260L);
            voiceCharacterList.put("j",J);
            voiceCharacterList.put("J",J);
            delayTimeList.put(K, 260L);
            voiceCharacterList.put("k",K);
            voiceCharacterList.put("K",K);
            delayTimeList.put(L, 300L);
            voiceCharacterList.put("l",L);
            voiceCharacterList.put("L",L);
            delayTimeList.put(M, 300L);
            voiceCharacterList.put("m",M);
            voiceCharacterList.put("M",M);
            delayTimeList.put(N, 260L);
            voiceCharacterList.put("n",N);
            voiceCharacterList.put("N",N);
            delayTimeList.put(O, 260L);
            voiceCharacterList.put("o",O);
            voiceCharacterList.put("O",O);
            delayTimeList.put(P, 260L);
            voiceCharacterList.put("p",P);
            voiceCharacterList.put("P",P);
            delayTimeList.put(Q, 260L);
            voiceCharacterList.put("q",Q);
            voiceCharacterList.put("Q",Q);
            delayTimeList.put(R, 260L);
            voiceCharacterList.put("r",R);
            voiceCharacterList.put("R",R);
            delayTimeList.put(S, 260L);
            voiceCharacterList.put("s",S);
            voiceCharacterList.put("S",S);
            delayTimeList.put(T, 260L);
            voiceCharacterList.put("t",T);
            voiceCharacterList.put("T",T);
            delayTimeList.put(U, 260L);
            voiceCharacterList.put("u",U);
            voiceCharacterList.put("U",U);
            delayTimeList.put(V, 260L);
            voiceCharacterList.put("v",V);
            voiceCharacterList.put("V",V);
            delayTimeList.put(W, 280L);
            voiceCharacterList.put("w",W);
            voiceCharacterList.put("W",W);
            delayTimeList.put(X, 280L);
            voiceCharacterList.put("x",X);
            voiceCharacterList.put("X",X);
            delayTimeList.put(Y, 260L);
            voiceCharacterList.put("y",Y);
            voiceCharacterList.put("Y",Y);
            delayTimeList.put(Z, 260L);
            voiceCharacterList.put("z",Z);
            voiceCharacterList.put("Z",Z);
        }
    }
}
