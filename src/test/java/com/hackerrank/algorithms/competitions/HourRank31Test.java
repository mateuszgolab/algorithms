package com.hackerrank.algorithms.competitions;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

import static com.hackerrank.algorithms.competitions.HourRank31.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class HourRank31Test {


    @Test
    public void test1() {

        assertThat(solve(5, Arrays.asList(15, 11, 17), Arrays.asList(5, 1, 2)), is(12));
        assertThat(solve(5, Arrays.asList(5, 5), Arrays.asList(4, 4)), is(0));
        assertThat(solve(1000000000, Collections.singletonList(1000000000), Collections.singletonList(100000)), is(0));
        assertThat(solve(1, Collections.singletonList(1000000000), Collections.singletonList(100000)), is(999974999));


    }


    @Test
    public void test2() {

        assertThat(solve(3, Arrays.asList(1000, 100, 100, 100)), is(150.0000));
        assertThat(solve(3, Arrays.asList(10, 15, 10, 100)), is(17.5000));
        assertThat(solve(1, Collections.singletonList(10)), is(10.0000));
        assertThat(solve(1, Arrays.asList(10, 15)), is(25.0000));
        assertThat(solve(1, Arrays.asList(3, 3, 10)), is(16.0000));
        assertThat(solve(2, Arrays.asList(3, 3, 10)), is(6.0));
        assertThat(solve(7, Arrays.asList(35,47,82,10,11,23,99,50,19,24,67,70,80)), is(86.33333333333333));
        
        assertThat(solve(148, Arrays.asList(978, 3756, 3680, 3451, 7862, 7248, 82, 2905, 7324, 747, 168, 483, 1536, 3257, 6126, 3486,
                3092, 693, 7381, 5759, 7106, 7342, 4987, 1974, 3955, 4237, 4857, 4377, 5024, 7974, 2851, 2686, 295, 2221, 731, 766, 4160, 4379,
                6663, 1542, 6863, 5169, 325, 2560, 7245, 844, 8892, 6226, 3379, 5802, 8164, 8116, 630, 7436, 6617, 9815, 6217, 1180, 9852, 9205,
                4527, 3568, 5115, 2532, 3985, 3408, 9954, 559, 1583, 6917, 5137, 9718, 6778, 7202, 8223, 757, 2545, 1336, 4064, 1155, 1018, 2628,
                148, 1659, 9636, 2268, 928, 7232, 1994, 8714, 9664, 253, 3803, 8391, 2365, 4314, 9655, 5452, 9595, 3510, 4589, 6917, 8599, 5713,
                1491, 3911, 863, 1193, 37, 660, 9282, 5241, 1602, 4284, 5578, 1676, 4755, 7062, 2135, 5304, 1774, 5264, 6142, 9096, 778, 2387, 8049,
                6954, 6419, 3050, 7601, 1211, 5520, 8308, 5153, 640, 323, 3384, 7709, 3670, 4673, 2153, 8266, 2748, 6691, 5978, 5328, 1599, 1740,
                4451, 7766, 2406, 3084, 3045, 829, 9296, 7428, 6747, 6159, 1131, 3819, 849, 8841, 7238, 9073, 2425, 3447, 1209, 5170, 9196, 9615,
                2739, 6525, 1022, 5281, 3540, 4885, 1173, 8269, 2381, 9767, 11, 357, 820, 6653, 8066, 2197, 3628, 9155, 8999, 6768, 357, 3977,
                8362, 5117, 7151, 5064, 781, 8210, 8661, 1128, 1483, 2671, 2168, 8016, 2652)),
                is(4497.5));


    }

}