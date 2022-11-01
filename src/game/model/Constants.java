package game.model;

public class Constants {
    
    // GAMEBALLS INITIALIZATION (SPLIT)
    // HEAD SPOT
    public static final double HEAD_SPOT_X = 500;
    public static final double HEAD_SPOT_Y = 465;
    // TRIANGLE
    // 5 possible layouts on the x-axis
    public static final double TRIANGLE_ROW1_X = 923;
    public static final double TRIANGLE_ROW2_X = 947;
    public static final double TRIANGLE_ROW3_X = 971;
    public static final double TRIANGLE_ROW4_X = 995;
    public static final double TRIANGLE_ROW5_X = 1019;
    // 9 possible layouts on the y-axis
    public static final double TRIANGLE_COL1_Y = 415;
    public static final double TRIANGLE_COL2_Y = 428;
    public static final double TRIANGLE_COL3_Y = 440;
    public static final double TRIANGLE_COL4_Y = 453;
    public static final double TRIANGLE_COL5_Y = 465;
    public static final double TRIANGLE_COL6_Y = 478;
    public static final double TRIANGLE_COL7_Y = 490;
    public static final double TRIANGLE_COL8_Y = 503;
    public static final double TRIANGLE_COL9_Y = 515;
    // FOOT SPOT
    public static final double FOOT_SPOT_X = TRIANGLE_ROW1_X;
    public static final double FOOT_SPOT_Y = TRIANGLE_COL5_Y;

    // BANKCOLLISION
    public static final double A_MARGIN = 281;
    public static final double B_MARGIN = 1106;
    public static final double CD_MARGIN = 664;
    public static final double EF_MARGIN = 262;
    // LEFT BANK (A)
    public static final double A_UP_CORNER_START = 268;
    public static final double A_UP_CORNER_END = 286;
    public static final double A_DOWN_CORNER_START = 647;
    public static final double A_DOWN_CORNER_END = 660;
    // RIGHT BANK (B)
    public static final double B_UP_CORNER_START = 270;
    public static final double B_UP_CORNER_END = 282;
    public static final double B_DOWN_CORNER_START = 641;
    public static final double B_DOWN_CORNER_END = 660;
    // LEFT UP BANK (C)
    public static final double C_LEFT_CORNER_START = 307;
    public static final double C_LEFT_CORNER_END = 328;
    public static final double C_RIGHT_CORNER_START = 669;
    public static final double C_RIGHT_CORNER_END = 680;
    // RIGHT UP BANK (D)
    public static final double D_LEFT_CORNER_START = 722;
    public static final double D_LEFT_CORNER_END = 738;
    public static final double D_RIGHT_CORNER_START = 1082;
    public static final double D_RIGHT_CORNER_END = 1098;
    // LEFT DOWN BANK (E)
    public static final double E_LEFT_CORNER_START = 307;
    public static final double E_LEFT_CORNER_END = 324;
    public static final double E_RIGHT_CORNER_START = 669;
    public static final double E_RIGHT_CORNER_END = 683;
    // RIGHT DOWN BANK (F)
    public static final double F_LEFT_CORNER_START = 722;
    public static final double F_LEFT_CORNER_END = 734;
    public static final double F_RIGHT_CORNER_START = 1078;
    public static final double F_RIGHT_CORNER_END = 1099;

    //TOP-LEFT POCKET
    public static final double TOP_LEFT_POCKET_X = 284;
    public static final double TOP_LEFT_POCKET_Y = 244;
    //BOTTOM-LEFT POCKET
    public static final double BOTTOM_LEFT_POCKET_X = 284;
    public static final double BOTTOM_LEFT_POCKET_Y = 735;
    //TOP-MIDDLE POCKET
    public static final double TOP_MIDDLE_POCKET_X = 729;
    public static final double TOP_MIDDLE_POCKET_Y = 241;
    //BOTTOM-MIDDLE POCKET
    public static final double BOTTOM_MIDDLE_POCKET_X = 729;
    public static final double BOTTOM_MIDDLE_POCKET_Y = 740;
    //TOP-RIGHT POCKET
    public static final double TOP_RIGHT_POCKET_X = 1174;
    public static final double TOP_RIGHT_POCKET_Y = 244;
    //BOTTOM-RIGHT POCKET
    public static final double BOTTOM_RIGHT_POCKET_X = 1174;
    public static final double BOTTOM_RIGHT_POCKET_Y = 735;

    // split rectangle
    public static final double LEFT_BANK = 310;
    public static final double RIGHT_BANK = 1030;
    public static final double UP_BANK = 260;
    public static final double DOWN_BANK = 660;

    // scoreballs initial layout x
    public static final double RACK_LEFT = 253;
    public static final double RACK_RIGHT = 882;

    // rack
    public static final double RACKSTACK = 600; 


}
