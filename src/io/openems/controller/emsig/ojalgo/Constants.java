package io.openems.controller.emsig.ojalgo;

import java.util.stream.IntStream;

public class Constants {

	public final static int NO_OF_PERIODS = 96; // 24 or 96
	public final static int MINUTES_PER_PERIOD = 15; // 60 or 15

	/**
	 * Grid Feed-In Limit, e.g. 70 % law
	 */
	public final static int GRID_SELL_LIMIT = 30000; // [W]

	public final static int GRID_BUY_LIMIT = 30000; // [W]

	public final static int ESS_INITIAL_ENERGY = 7500; // [Wh]
	public final static int ESS_MIN_ENERGY = 0; // [Wh]
	public final static int ESS_MAX_ENERGY = 10000; // [Wh]
	public final static int ESS_MAX_CHARGE = 5000; // [W]
	public final static int ESS_MAX_DISCHARGE = 5000; // [W]
	public final static int ESS_CHARGE_EFFICIENCY = 95; // [%, 0-100] 
	public final static int ESS_DISCHARGE_EFFICIENCY = 105; // [%, 100-200]
//	public final static int ESS_EFFICIENCY = 50; // [Wmin] 
	
	// add PV, assume (for now) constant production
//	public final static int PV_POWER_CONST = 70; // [W]
//	public final static int[] PV_POWER = IntStream.of(new int[NO_OF_PERIODS]).map(i -> PV_POWER_CONST)
//			.toArray();
	
//	public final static int[] PV_POWER = {0, 0, 0, 0, 0, 0, 0, 50, 60, 70, 100, 150, 300, 300, 200, 100, 50, 50, 0, 0, 0, 0, 0, 0};
//	public final static int[] HH_LOAD = {100, 100, 100, 100, 100, 100, 150, 150, 200, 300, 200, 250, 200, 200, 150, 150, 200, 150, 100, 100, 100, 100, 100, 100};

	// add some (household) load which is once again assumed to be constant
//	public final static int HH_LOAD_CONST = 150; // [W]
//	public final static int[] HH_LOAD = IntStream.of(new int[NO_OF_PERIODS]).map(i -> HH_LOAD_CONST)
//			.toArray();
	
//	// Fems4, 22.07.21
//	public final static int[] PV_POWER = {0,
//			0,
//			0,
//			0,
//			0,
//			0,
//			0,
//			0,
//			0,
//			0,
//			0,
//			0,
//			0,
//			0,
//			0,
//			0,
//			0,
//			0,
//			6,
//			246,
//			504,
//			759,
//			969,
//			1161,
//			1377,
//			1655,
//			1968,
//			2728,
//			4035,
//			5102,
//			7122,
//			8826,
//			9909,
//			11885,
//			12889,
//			14194,
//			15494,
//			16664,
//			17709,
//			18609,
//			19517,
//			20298,
//			21151,
//			21851,
//			22627,
//			23483,
//			23614,
//			23744,
//			24046,
//			24047,
//			23898,
//			24123,
//			23773,
//			23526,
//			23253,
//			23077,
//			22456,
//			22041,
//			21509,
//			20661,
//			19885,
//			19001,
//			18034,
//			17041,
//			15849,
//			14527,
//			12980,
//			10395,
//			7633,
//			5310,
//			3472,
//			2331,
//			1878,
//			1538,
//			1182,
//			834,
//			510,
//			276,
//			34,
//			-9,
//			-4,
//			0,
//			0,
//			0,
//			0,
//			0,
//			0,
//			0,
//			0,
//			0,
//			0,
//			0,
//			0,
//			0,
//			0,
//			0};
//	
//	// Fems4, 22.07.2021
//	public final static int[] HH_LOAD = {2743,
//			2654,
//			2693,
//			2707,
//			2623,
//			2642,
//			2699,
//			2670,
//			2640,
//			2724,
//			2669,
//			2630,
//			2699,
//			2656,
//			2644,
//			2672,
//			2657,
//			2748,
//			2845,
//			3094,
//			2955,
//			2736,
//			2685,
//			2373,
//			1228,
//			912,
//			519,
//			518,
//			930,
//			750,
//			743,
//			606,
//			565,
//			2282,
//			2829,
//			3363,
//			3065,
//			3038,
//			919,
//			796,
//			829,
//			789,
//			786,
//			1411,
//			3804,
//			3934,
//			4165,
//			2497,
//			1889,
//			2152,
//			1081,
//			868,
//			899,
//			816,
//			865,
//			890,
//			877,
//			916,
//			1592,
//			3143,
//			3126,
//			2913,
//			4832,
//			5522,
//			3667,
//			3604,
//			2857,
//			2859,
//			3836,
//			4054,
//			4746,
//			3900,
//			4292,
//			4078,
//			4388,
//			4645,
//			5265,
//			6669,
//			5219,
//			5273,
//			5306,
//			5269,
//			3085,
//			2966,
//			1653,
//			736,
//			675,
//			725,
//			654,
//			630,
//			457,
//			444,
//			504,
//			434,
//			419,
//			491};
	
//	// Fems4 23.07.21
//	public final static int[] PV_POWER = {
//			0,
//			0,
//			0,
//			0,
//			0,
//			0,
//			0,
//			0,
//			0,
//			0,
//			0,
//			0,
//			0,
//			0,
//			0,
//			0,
//			0,
//			0,
//			12,
//			301,
//			742,
//			1096,
//			1511,
//			1852,
//			2011,
//			2101,
//			2500,
//			3528,
//			4271,
//			5335,
//			6697,
//			8529,
//			8656,
//			10293,
//			12348,
//			13640,
//			14804,
//			15710,
//			16742,
//			17765,
//			18692,
//			19442,
//			20255,
//			20924,
//			21574,
//			22361,
//			22444,
//			22929,
//			23215,
//			23143,
//			23093,
//			23077,
//			22837,
//			22577,
//			22336,
//			21931,
//			21488,
//			21086,
//			20615,
//			19989,
//			19394,
//			18527,
//			17569,
//			16508,
//			15351,
//			14201,
//			12917,
//			10233,
//			7414,
//			5074,
//			3194,
//			2026,
//			1612,
//			1318,
//			1027,
//			743,
//			448,
//			260,
//			27,
//			-5,
//			-4,
//			0,
//			0,
//			0,
//			0,
//			0,
//			0,
//			0,
//			0,
//			0,
//			0,
//			0,
//			0,
//			0,
//			0,
//			0
//	};
//	
//	// Fems4 23.07.21
//	public final static int[] HH_LOAD = {
//			466,
//			459,
//			495,
//			483,
//			460,
//			445,
//			528,
//			439,
//			408,
//			378,
//			388,
//			394,
//			389,
//			422,
//			437,
//			415,
//			397,
//			434,
//			786,
//			497,
//			660,
//			612,
//			550,
//			687,
//			666,
//			875,
//			679,
//			877,
//			2779,
//			2727,
//			2777,
//			487,
//			537,
//			581,
//			476,
//			1004,
//			787,
//			792,
//			818,
//			915,
//			773,
//			681,
//			708,
//			1260,
//			3660,
//			3681,
//			3561,
//			892,
//			1889,
//			1647,
//			2225,
//			1010,
//			3055,
//			3478,
//			4959,
//			3622,
//			3457,
//			3467,
//			5363,
//			5994,
//			6177,
//			8692,
//			5625,
//			5402,
//			5464,
//			5001,
//			3994,
//			4464,
//			3429,
//			1727,
//			1149,
//			1665,
//			1416,
//			1471,
//			770,
//			1560,
//			1298,
//			1856,
//			4300,
//			3630,
//			3582,
//			3317,
//			4687,
//			3919,
//			4157,
//			4105,
//			4121,
//			3906,
//			3740,
//			3199,
//			2019,
//			462,
//			431,
//			460,
//			445,
//			395
//	};
	
	// Fems4 05.10.21
	public final static int[]  PV_POWER = {0,
			0,
			0,
			0,
			0,
			0,
			0,
			0,
			0,
			0,
			0,
			0,
			0,
			0,
			0,
			0,
			0,
			0,
			0,
			0,
			0,
			0,
			0,
			0,
			483,
			732,
			989,
			2436,
			3475,
			2245,
			3086,
			6475,
			7215,
			7037,
			4162,
			4568,
			3728,
			1605,
			1928,
			3853,
			6337,
			3085,
			2495,
			1927,
			2168,
			3324,
			5365,
			4967,
			5627,
			4584,
			5822,
			3813,
			2549,
			2543,
			2723,
			3139,
			3169,
			2049,
			1490,
			1617,
			2367,
			1700,
			961,
			939,
			698,
			129,
			1211,
			529,
			418,
			0,
			0,
			0,
			0,
			0,
			0,
			0,
			0,
			0,
			0,
			0,
			0,
			0,
			0,
			0,
			0,
			0,
			0,
			0,
			0,
			0,
			0,
			0,
			0,
			0,
			0,
			0 }; 
	
	// Fems4 05.10.21
	public final static int[]  HH_LOAD = {
			400,
			429,
			483,
			427,
			456,
			460,
			424,
			401,
			458,
			400,
			446,
			446,
			1861,
			3502,
			4969,
			5368,
			426,
			419,
			458,
			393,
			528,
			2047,
			3738,
			6339,
			3958,
			718,
			918,
			773,
			632,
			1097,
			672,
			754,
			1276,
			1539,
			2721,
			2096,
			1215,
			1189,
			675,
			748,
			1156,
			679,
			2174,
			6353,
			6314,
			5516,
			7443,
			8324,
			8276,
			7880,
			6547,
			3653,
			7518,
			8998,
			9472,
			8895,
			3400,
			1716,
			1463,
			1394,
			1195,
			1265,
			525,
			724,
			3915,
			6383,
			6091,
			4092,
			1393,
			2141,
			1633,
			1250,
			1019,
			966,
			911,
			987,
			1060,
			1087,
			1071,
			978,
			890,
			907,
			896,
			2733,
			3689,
			2939,
			649,
			566,
			599,
			619,
			558,
			573,
			465,
			417,
			478,
			436
	};

// specify sell revenue and buy cost
	public final static int GRID_SELL_REVENUE_CONST = 10; // [ct]
	public final static int[] GRID_SELL_REVENUE = IntStream.of(new int[NO_OF_PERIODS]).map(i -> GRID_SELL_REVENUE_CONST)
			.toArray();

	public final static int GRID_BUY_COST_CONST = 30; // [ct]
	public final static int[] GRID_BUY_COST = IntStream.of(new int[NO_OF_PERIODS]).map(i -> GRID_BUY_COST_CONST)
			.toArray();
}
